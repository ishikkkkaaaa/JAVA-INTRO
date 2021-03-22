package com.rt.clone;

public class Employee implements Cloneable{

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID is " + id + " Name is " + name;
    }
    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

}
