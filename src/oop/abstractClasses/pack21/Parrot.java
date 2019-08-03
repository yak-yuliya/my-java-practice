import oop.abstractClasses.pack1.Bird;

/**
 * Created by dev on 7/10/2015.
 */
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
