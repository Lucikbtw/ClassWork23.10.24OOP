package com.samsung;

public class Fish {
    private String name;
    private int age;
    private String Greeting;

    public Fish(String name, int age, String Greeting) {
        this.name = name;
        this.age = age;
        this.Greeting = Greeting;
    }

    public Fish(String name, String greeting) {
        this.name = name;
        Greeting = greeting;
    }

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
