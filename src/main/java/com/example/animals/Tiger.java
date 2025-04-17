package com.example.animals;

public class Tiger extends Animal{

    private final int runDistance = 1000;
    private final int swimDistance = 5;


    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Tiger can't run");
        }   else if (distance <= runDistance) {
            System.out.println("Tiger runs " + distance + "m");
        }   else {
            System.out.println("Tiger can't run " + distance + "m");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("Tiger can't swim");
        }   else if (distance <= swimDistance) {
            System.out.println("Tiger swims " + distance + "m");
        }   else {
            System.out.println("Tiger can't swim " + distance + "m");
        }
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }
}
