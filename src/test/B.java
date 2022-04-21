package test;

public class B extends A {
    private String id;

    public B(String name, String id) {
        super(name);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public B setId(String id) {
        this.id = id;
        return this;
    }
}
