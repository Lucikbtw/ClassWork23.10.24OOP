package com.samsung;

import java.util.Arrays;

public class GoldFish extends Fish {

    String[] songs = {};
    public GoldFish(String name, int age, String[] songs, String greeting) {
        super(name, age, greeting);
        this.songs = songs;
    }

    public GoldFish(String name, String greeting, String[] songs) {
        super(name, greeting);
        this.songs = songs;
    }

    public GoldFish(String name, String greeting) {
        super(name, greeting);
    }

    public void walk(){
        System.out.println("Я гуляю на ногах!");
    }
    public String[] getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "Я золотая рыбка по имени:" + getName();
    }
}
