package access_modifiers.package1;

public class Librarian {

    public Librarian(){
        Book book = new Book();
        book.author = "ABC";
        book.modifyTemplate();
    }
//    Book book2 = new Book();
//        book2.modifyTemplate();

    public void modifyTemplate() {
        System.out.println("Librarian!");
    }

}
