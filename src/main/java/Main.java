import comparators.StudentComparator;
import comparators.UniversityComparator;
import enums.StudentEnum;
import enums.UniversityEnum;
import models.Student;
import models.University;
import utils.EnumComparator;
import utils.JsonUtil;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static readwrite.ReadXLSX.readStudents;
import static readwrite.ReadXLSX.readUniversity;

public class Main {
    public static void main(String[] args) throws IOException {
        // чтение из файла
        List<University> universities = readUniversity();
        List<Student> students = readStudents();

        // определяем по какому параметру будет происходить сортировка
        UniversityComparator universityComparator = EnumComparator.getUniversityComparator(UniversityEnum.FULL_NAME);
        StudentComparator studentComparator = EnumComparator.getStudentComparator(StudentEnum.FULLNAME);

        // вывод сортированного объекта
        System.out.println("Сначла университеты:");
        Stream universityStream = universities.stream();
        universityStream.sorted(universityComparator).forEach(System.out::println);

        System.out.println("Затем студенты:");
        Stream studentStream = students.stream();
        studentStream.sorted(studentComparator).forEach(System.out::println);

        // в данном случае выводим весь объект, даже цикл не нужен, List все хранит
        // сериализация -> превращение в json-объект
        String universityJson = JsonUtil.universityListSerialize(universities);
        String studentJson = JsonUtil.studentListSerialize(students);

        // десериализация
        List<University> universitiesJsonList = JsonUtil.universityListDeserialize(universityJson);
        List<Student> studentsJsonList = JsonUtil.studentListDeserialize(studentJson);

        // сравнение размеров исходных объектов и десериализированных
        System.out.println(universities.size() == universitiesJsonList.size());
        System.out.println(students.size() == studentsJsonList.size());

        // тут выводим каждый элемент отдельно, поэтому и нужен цикл, чтобы пройтись по каждому
        // сериализация и десериализация элементов
        universities.forEach(university -> {
            String universityObjectJson = JsonUtil.universitySerialize(university);
            University universityDeserialize = JsonUtil.universityDeserialize(universityObjectJson);
            System.out.println(universityDeserialize);
        });

        students.forEach(student -> {
            String studentObjectJson = JsonUtil.studentSerialize(student);
            Student studentDeserialize = JsonUtil.studentDeserialize(studentObjectJson);
            System.out.println(studentDeserialize);
        });
    }
}
