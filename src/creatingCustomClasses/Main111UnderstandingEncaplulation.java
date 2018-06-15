package creatingCustomClasses;

public class Main111UnderstandingEncaplulation {

    public static void main(String[] args) {

        //you package complex functionality for ease of programming
        //to put all the code in one place - in main method - makes it difficult to manage
// so instead you want to break the code in large classes
        //grouping the functionality as the logic dictates
        //advantages: access to individual functions can be restricted
        //withing a class methods can be mapped as private, private, protected
    // so only those part of application, that shall use that functionality, can access it
        //each of that methods can hide high complex functionality
        // all developers don´t need to know how it operates in background
        //because each developer can write different module of application
        // and one developer can publish api, so that it is used by other programmers
        //when you encapsulate the functionality, you essentially hide the mechanism by which data is stored
//you can store data in xml, and you create methods to read and write data
        // but later you decide to change to json format#
        //if you encapsulated correctly, other parts of application can still call that methods
        //and it can reduce the risk of breaking the application
        //makes code much more easier and maintenance of application much more successfull
        //it is breaking the functionality down into a small maintanable units
        // //and you are grouping the functionality and data together
        // and wrapping it all out in java classes
        // that you can then create instance of, call methods, access and modify the data and so on
        // it is much easier to fix bugs when you are looking into a small amount of code
        //breaking things into small pieces makes it also easier to test
        // you can do something called unit testing




    }
}
