package oop.innerClasses.part1;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0); //this is how we access an inner class
        this.gears.add(neutral);
    }

    //Inner class, nested class
    //doesnt make sense to talk about Gear except when we talk about Gearbox
    //instances of Gear class have got access to all the methods and fields of Gearbox class even that marked as private
    //Gear class itself is a member of Gearbox class and must be screated with an instance - see it in main class
    public class Gear { //public class at the beginning
        private int gearNumber; //this is shadowing currentGear in Gearbox class if they have same name
        private double ratio;

        public Gear(int gearNumber, double ratio) { //constructor

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        //public method
        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }

    //same but private!!!!!!
    private class Gear2 { //public class at the beginning
        private int gearNumber; //this is shadowing currentGear in Gearbox class if they have same name
        private double ratio;

        public Gear2(int gearNumber, double ratio) { //constructor

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        //public method
        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }




    //methods of Gearbox class
    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if ((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

}


