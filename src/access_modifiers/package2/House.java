package access_modifiers.package2;

import access_modifiers.package1.Book;

public class House {

    public House(){
        Book book=new Book();
//        book.author="ABC"; //Error:(9, 13) java: author has protected access in access_modifiers.package1.Book
//        book.modifyTemplate(); //Error:(10, 13) java: modifyTemplate() has protected access in access_modifiers.package1.Book
    }

    public void modifyTemplate() {
        System.out.println("House!");
    }

}
