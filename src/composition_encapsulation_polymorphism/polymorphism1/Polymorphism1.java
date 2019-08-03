package composition_encapsulation_polymorphism.polymorphism1;

public class Polymorphism1 {
    //it allows actions to act differently based on object
    //you can create classes in same file, if the are small and compact (may not be accessed in ohther packeges based on access modifier)
    //we assign different type of fucntionality depending on the object type we have created



    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            //we create a variable of type Movie
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }
    //return type is object movie
    public static Movie randomMovie() {
        //we generate random number
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }}
//pack1.
class Movie {
    private String name;
    //we have a constructor that initialises the name of the movie
    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here"; //default plot or action we return is "no plot"
    }

    public String getName() {
        return name;
    }
}
//2. create 5 subclasses

class Jaws extends Movie {
    public Jaws() { //this is a constructor
        super("Jaws"); //from the inheritance we initialise name filed
    }
    //exactly same method and return type
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    //we override method here
    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}

