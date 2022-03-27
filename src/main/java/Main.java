import models.Student;

public class Main {
    public static void main(String[] args) {
        String name = "Stiles Stilinsky";
        String university = "FBI";
        int course = 1;
        float avgscore = (float) 4.7;
        Student student = new Student(name, university, course, avgscore);

        System.out.println(student.toString());
    }
}
