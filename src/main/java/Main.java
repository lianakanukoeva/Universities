import comparators.StudentComparator;
import comparators.UniversityComparator;
import enums.StudentEnum;
import enums.UniversityEnum;
import models.Student;
import models.University;
import utils.EnumComparator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static models.ReadXLSX.readStudents;
import static models.ReadXLSX.readUniversity;

public class Main {
    public static void main(String[] args) throws IOException {
        List<University> universities = readUniversity();
        List<Student> students = readStudents();

//        System.out.println(universities);
//        System.out.println(students);

        UniversityComparator universityComparator = EnumComparator.getUniversityComparator(UniversityEnum.FULL_NAME);
        StudentComparator studentComparator = EnumComparator.getStudentComparator(StudentEnum.FULLNAME);

        System.out.println("Сначла университеты:");
        Stream universityStream = universities.stream();
        universityStream.sorted(universityComparator).forEach(System.out::println);

        System.out.println("Затем студенты:");
        Stream studentStream = students.stream();
        studentStream.sorted(studentComparator).forEach(System.out::println);
    }
}
