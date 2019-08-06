package lambdaAgain;

import java.util.ArrayList;
import java.util.List;

public class Books {

    public static List<Book> allBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("Vacation read", "Leo Tolstoy", 2008));
        books.add(new Book("Aaaaaaaaaaaaaa", "Arthur Conan Doyle", 2011));
        books.add(new Book("Zzzzzzzzzz read", "John Smith", 1999));
        books.add(new Book("Vacation read2", "Oscar Wilde", 2019));
        books.add(new Book("Vacation read1", "John Smith", 2008));
        books.add(new Book("Bbbbbbbbbb read", "John Smith", 2011));
        books.add(new Book("Yyyyyyyyyyyy read", "John Smith", 2015));
        books.add(new Book("Vacation read", "Jack London", 2015));
        return books;
    }
}
