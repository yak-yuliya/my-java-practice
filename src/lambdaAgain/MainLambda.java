package lambdaAgain;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MainLambda {

    //prior to Java 9 - a lot of lines

    public static void usingAnonimousInlineClass() {
        List<Book> books = Books.allBooks();
        Collections.sort(books, new Comparator<Book>() {
                    @Override
                    public int compare(Book b1, Book b2) {
                        return b1.getTitle().compareTo(b2.getTitle());
                    }
                }
        );

        for (Book book : books) {
            System.out.println(book);
        }
    }


    public static void usingLambdasInLongForm() {
        List<Book> books = Books.allBooks();
        Collections.sort(books, (Book b1, Book b2) -> {
            return b1.getTitle().compareTo(b2.getTitle());
        });

        for (Book book : books) {
            System.out.println(book);
        }
    }


    public static void usingLambdasInShortForm() {
        List<Book> books = Books.allBooks();
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));

        books.forEach(book -> System.out.println(book));
    }


    public static void usingMethodReferences() {
        List<Book> books = Books.allBooks();
//        Collections.sort(books, Comparator.comparing(b -> b.getTitle())); //works or
        Collections.sort(books, Comparator.comparing(Book::getTitle));

//        books.forEach(book -> System.out.println(book)); //works or
        books.forEach(System.out::println);
    }


    //my method to stream books

    public static void methodToStreamBooks() {
        List<Book> books = Books.allBooks();
        books.stream()
                .sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()))
                //  .sorted() //override compareTo in Book class
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
//        usingAnonimousInlineClass();
//        System.out.println("========");
//        usingLambdasInLongForm();
//        System.out.println("========");
//        usingLambdasInShortForm();
//        System.out.println("========");
//        methodToStreamBooks();
//        System.out.println("========");
//        usingMethodReferences();

        List<String> ingredients = Arrays.asList("salt", "flour", "eggs", "butter", "milk", "baling powder");
        for (
                String ingredient : ingredients) {
            if (ingredient.contains("eggs")) {
                System.out.println("It has eggs!!!!!");
            }
        }

        System.out.println("----------");



        //what we want. not how we want it.

        //declarative way!
        //we made a new anonimous func and passed it to for each method

        ingredients.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);

            }
        });
        System.out.println("////////////////");
    }
}
