package com.example.animals;

public  class Animal {

    int runDistance;
    int swimDistance;

    public Animal(int runDistance, int swimDistance) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Animal can't run");
        }   if (distance < runDistance) {
            System.out.println("Animal runs " + distance + "m");
        }   else {
            System.out.println("Animal can't run " + distance + "m");
        }
    }


    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("Animal can't run");
        }   if (distance < swimDistance) {
            System.out.println("Animal swims " + distance + "m");
        }   else {
            System.out.println("Animal can't swim " + distance + "m");
        }
    }
}
