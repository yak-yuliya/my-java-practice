package annotations;

public class OverrideAnnotation {

    public static void main(String[] args) {

        Cheese myCheese = new Cheese();
        System.out.println(myCheese); //will print annotations.Cheese@266474c2 - other toString method was not overridden without @Override annptation


    }

}
