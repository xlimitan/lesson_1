package com.example;

import com.example.animals.Animal;
import com.example.animals.Cat;
import com.example.animals.Dog;
import com.example.animals.Tiger;

public class App
{
    public static void main( String[] args ) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Tiger()
        };

        for (Animal animal : animals) {
            animal.run(animal.getRunDistance());
            animal.swim(animal.getSwimDistance());
        }

        int cats = 0;
        int dogs = 0;
        int tigers = 0;

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                cats++;
            } else if (animal instanceof Dog){
                dogs++;
            } else if (animal instanceof Tiger){
                tigers++;
            }
        }
        System.out.println();
        System.out.println("Animals = " + animals.length);
        System.out.println("Cats = " + cats);
        System.out.println("Dogs = " + dogs);
        System.out.println("Tigers = " + tigers);

    }
}
