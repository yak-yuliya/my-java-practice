package thisAndSuper;

public class JuniorProgrammer  extends Programmer{

    JuniorProgrammer(String name) {
         //this();
        super.name = name;
    }

    @Override
    public void printName (String name){
        System.out.println("JuniorProgrammer name: " + name);
    }
}
