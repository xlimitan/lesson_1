package com.example.animals;

public  class Animal {

    int runDistance;
    int swimDistance;


    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Animal can't run");
        }   else if (distance <= runDistance) {
            System.out.println("Animal runs " + distance + "m");
        }   else {
            System.out.println("Animal can't run " + distance + "m");
        }
    }


    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("Animal can't swim");
        }   else if (distance <= swimDistance) {
            System.out.println("Animal swims " + distance + "m");
        }   else {
            System.out.println("Animal can't swim " + distance + "m");
        }
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }
}
