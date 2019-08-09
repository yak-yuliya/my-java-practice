package access_modifiers.package2;

import access_modifiers.package1.Book;

public class StoryBook extends Book {

    public StoryBook() {
        author = "ABC";
        modifyTemplate();
    }

    public void modifyTemplate() {
        System.out.println("StoryBook!");
    }

}
