package dataCollections;

import java.util.HashMap;
import java.util.Map;

    public class Map2 {
        public static void main(String[] args) {

        Student ravi = new Student();
        Student sid = new Student();
        Student grace = new Student();
        Grade A = new Grade();
        Grade B = new Grade();
        Grade C = new Grade();
        Grade D = new Grade();

        Map<Student, Grade> studentGradeMap = new HashMap<>();
        studentGradeMap.put(ravi, B);
        studentGradeMap.put(sid, C);
        studentGradeMap.put(grace, B);

        Grade ravisGrade = studentGradeMap.get(ravi);

            System.out.println(ravisGrade);

        }

    }

    class Student {
        // omitted
    }

    class Grade {
        // omitted
    }

