package access_modifiers.package1;

public class CourseBook extends Book {

    public CourseBook() {
        author = "CourseBook1";
        modifyTemplate();

    }
    String author = "CourseBook2";

    public void modifyTemplate(){
        System.out.println("CourseBook!");
    };
}
