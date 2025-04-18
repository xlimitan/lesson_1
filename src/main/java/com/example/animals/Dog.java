package com.example.animals;

public class Dog extends Animal{

    private final int runDistance = 500;
    private final int swimDistance = 10;


    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Dog can't run");
        }   else if (distance <= runDistance) {
            System.out.println("Dog runs " + distance + "m");
        }   else {
            System.out.println("Dog can't run " + distance + "m");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("Dog can't swim");
        }   else if (distance <= swimDistance) {
            System.out.println("Dog swims " + distance + "m");
        }   else {
            System.out.println("Dog can't swim " + distance + "m");
        }
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }
}
