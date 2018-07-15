package composition_encapsulation_polymorphism.encapsulation1;

public class Main {
    //Encapsulation can be achieved by:
    // Declaring all the variables in the class as private
    // and writing public methods in the class to set and get
    // the values of variables.

    //Encapsulation is defined as the wrapping up of data under a single unit.
    // It is the mechanism that binds together code and the data it
    // manipulates.
    // Other way to think about encapsulation is,
    // it is a protective shield that prevents the data
    // from being accessed by the code outside this shield.
    public static void main(String[] args) {
//	    Player player = new Player();
//        player.name = "Tim";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
