package com.algorhythm.hard;

import com.google.gson.Gson;

import java.util.*;

public class FileSystem {

    public static void main(String[] args) {
        FileSystem obj = new FileSystem();
        List<String> param_1 = obj.ls("/");
        obj.mkdir("/a/b/c");
        obj.addContentToFile("/a/b/c/d", "hello");
        List<String> param_3 = obj.ls("/a/b");
        String param_4 = obj.readContentFromFile("/a/b/c/d");
    }

    private FileObj root;

    public FileSystem() {
        root = new FileObj(false, "");
    }

    public List<String> ls(String path) {
        String[] paths = path.split("/");
        FileObj parent = root;
        if (path.contentEquals("/")) {
            return new ArrayList<>(parent.getChildren().keySet());
        }
        int i = 1;
        while (i < paths.length - 1) {
            parent = parent.getChildren().get(paths[i++]);
        }
        FileObj file = parent.getChildren().get(paths[i]);
        if (file.isFile()) {
            return Arrays.asList(file.getName());
        } else {
            return new ArrayList<>(file.getChildren().keySet());
        }
    }

    public void mkdir(String path) {
        String[] paths = path.split("/");
        createFolders(paths, paths.length);
    }

    public void addContentToFile(String filePath, String content) {
        String[] paths = filePath.split("/");
        FileObj parent = createFolders(paths, paths.length - 1);
        FileObj file;
        if (parent.getChildren().containsKey(paths[paths.length - 1])) {
            file = parent.getChildren().get(paths[paths.length - 1]);
        } else {
            file = new FileObj(true, paths[paths.length - 1]);
            parent.getChildren().put(file.getName(), file);
            file.setParent(parent);
        }
        file.getContent().append(content);
    }

    private FileObj createFolders(String[] paths, int n) {
        FileObj parent = root;
        int i = 1;
        while (i < n) {
            if (!parent.getChildren().containsKey(paths[i])) {
                FileObj folder = new FileObj(false, paths[i]);
                folder.parent = parent;
                parent.getChildren().put(folder.getName(), folder);
                parent = folder;
            } else {
                parent = parent.getChildren().get(paths[i]);
            }
            i++;
        }
        return parent;
    }

    public String readContentFromFile(String filePath) {
        String[] paths = filePath.split("/");
        FileObj parent = root;
        int i = 1;
        while (i < paths.length) {
            parent = parent.getChildren().get(paths[i]);
            i++;
        }
        return parent.getContent().toString();
    }

    class FileObj {
        boolean file;
        String name;

        public StringBuffer getContent() {
            return content;
        }

        public void setContent(StringBuffer content) {
            this.content = content;
        }

        StringBuffer content = new StringBuffer();

        public FileObj getParent() {
            return parent;
        }

        public void setParent(FileObj parent) {
            this.parent = parent;
        }

        FileObj parent;
        Map<String, FileObj> children = new TreeMap<>();

        public FileObj(boolean file, String name) {
            this.file = file;
            this.name = name;
        }

        public boolean isFile() {
            return file;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Map<String, FileObj> getChildren() {
            return children;
        }
    }
}
