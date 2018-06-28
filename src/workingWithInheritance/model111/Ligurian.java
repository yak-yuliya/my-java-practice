package workingWithInheritance.model111;

public class Ligurian extends Olive {

    //there is no default constructor available in the Olive class
    //and thats because we have removed it
    //by default the subclass is expecting there to be a non argument superclass in the subclass but it doesnt exist
    //so we need to create it explicitly here
    //we will create a constructor specifically for this subclass

    public Ligurian(){

        //super - is a method call
        super(OliveNameEnum.LIGURIAN, OliveColor.BLACK, 3);
    }
}