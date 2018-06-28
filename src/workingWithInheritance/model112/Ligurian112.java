package workingWithInheritance.model112;

public class Ligurian112 extends Olive112 {

    //there is no default constructor available in the Olive class
    //and thats because we have removed it
    //by default the subclass is expecting there to be a non argument superclass in the subclass but it doesnt exist
    //so we need to create it explicitly here
    //we will create a constructor specifically for this subclass

    public Ligurian112(){

        //super - is a method call
        super(OliveNameEnum112.LIGURIAN, OliveColor112.BLACK, 3);
    }

    //this method will be automatically created if i make an Olive class abstract and make
    //an abstract method getOrigin inside of Olive class

    //alt + enter -
    @Override
    public String getOrigin() {
        return "Italy";
    }
}