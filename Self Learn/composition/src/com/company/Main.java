package com.company;

public class Main {

    public static void main(String[] args) {


        Human human1 = new Human(173,12,"Kamal");
        Plant plant2 = new Plant("Jack");
        Earth earth1 = new Earth(human1,plant2);

        earth1.getHuman().getHeight();
    }
}
