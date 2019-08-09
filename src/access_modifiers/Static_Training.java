package access_modifiers;

import access_modifiers.package1.CourseBook;
import access_modifiers.package1.Librarian;
import access_modifiers.package2.House;
import access_modifiers.package2.StoryBook;

public class Static_Training {

}


class Office {
    public static void main(String[] args) {
        Emp emp = null;
        System.out.println(emp.bankVault); //prints 0
        System.out.println(emp.getBankVaultValue());//prints 0


//        System.out.println(new CourseBook());


        CourseBook coursebook = new CourseBook();
        coursebook.modifyTemplate();

        Librarian librarian = new Librarian();
        librarian.modifyTemplate();

        //diff package

        StoryBook storyBook = new StoryBook();
        storyBook.modifyTemplate();

        House house = new House();
        house.modifyTemplate();
    }
}

class Emp {
    String name;
    static int bankVault;

    static int getBankVaultValue() {
        return bankVault;
    }


}
