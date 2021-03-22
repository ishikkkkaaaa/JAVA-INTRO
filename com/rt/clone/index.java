package com.rt.clone;

public class index {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee(1, "Ishika");
        // method clone, defined inside obj class
        Employee e2 = e1.clone();

        e1.setId(10);
        e2.setName("nikhil");
        
        System.out.println(e1);
        System.out.println(e2);

    }
}
