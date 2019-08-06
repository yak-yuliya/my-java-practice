package oop.abstractClasses.pack21;

import oop.abstractClasses.pack1.Parrot;
import oop.abstractClasses.pack1.Penguin;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
