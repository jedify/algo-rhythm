package test;

public class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public A setName(String name) {
        this.name = name;
        return this;
    }
}
