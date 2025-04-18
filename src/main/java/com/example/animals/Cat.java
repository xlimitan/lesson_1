package com.example.animals;

public class Cat extends Animal{
    private final int runDistance = 200;
    private final int swimDistance = 0;


    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Cat can't run");
        } else if (distance <= runDistance) {
            System.out.println("Cat runs " + distance + "m");
        }   else {
            System.out.println("Cat can't run " + distance + "m");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("Cat can't swim");
        }   else if (distance <= swimDistance) {
            System.out.println("Cat swims " + distance + "m");
        }   else {
            System.out.println("Cat can't swim " + distance + "m");
        }
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }
}
