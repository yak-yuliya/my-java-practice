package oop.abstractClasses.pack21;

import oop.abstractClasses.pack1.Animal;

/**
 * Created by dev on 7/10/2015.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }
}
