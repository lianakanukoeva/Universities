import models.Student;
import models.University;

import java.io.IOException;
import java.util.List;

import static models.ReadXLSX.readStudents;
import static models.ReadXLSX.readUniversity;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities = readUniversity();
//        List<Student> students = readStudents();
        System.out.println("Сначла университеты:");
        System.out.println(universities);
        System.out.println();
        System.out.println("Затем студенты:");
//        System.out.println(students);
    }
}
