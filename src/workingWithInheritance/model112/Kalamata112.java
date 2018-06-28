package workingWithInheritance.model112;

public class Kalamata112 extends Olive112 {

    //subclass can have all sort of specific information
    //and ovverride defaults or set specific values that a superclass requires
    //but it can still use the features os a superclass where it doesnt need to have a specific functionality


    //there is no default constructor available in the Olive class
    //and thats because we have removed it
    //by default the subclass is expecting there to be a non argument superclass in the subclass but it doesnt exist
    //so we need to create it explicitly here
    //we will create a constructor specifically for this subclass

    public Kalamata112() {

        //super - is a method call
        super(OliveNameEnum112.KALAMATA, OliveColor112.PURPLE, 2);
    }

    //this method will be automatically created if i make an Olive class abstract and make
    //an abstract method getOrigin inside of Olive class
    @Override
    public String getOrigin() {
        return "Greece";
    }
}
