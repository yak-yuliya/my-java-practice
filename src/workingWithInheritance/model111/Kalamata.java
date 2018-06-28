package workingWithInheritance.model111;

public class Kalamata extends Olive {

    //subclass can have all sort of specific information
    //and ovverride defaults or set specific values that a superclass requires
    //but it can still use the features os a superclass where it doesnt need to have a specific functionality



    //there is no default constructor available in the Olive class
    //and thats because we have removed it
    //by default the subclass is expecting there to be a non argument superclass in the subclass but it doesnt exist
    //so we need to create it explicitly here
    //we will create a constructor specifically for this subclass

    public Kalamata(){

        //super - is a method call
        super(OliveNameEnum.KALAMATA, OliveColor.PURPLE, 2);
    }
}
