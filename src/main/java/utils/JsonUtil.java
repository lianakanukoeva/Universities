package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import models.Student;
import models.University;

import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {
    private JsonUtil(){}

    public static String universitySerialize (University university) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(university);
        System.out.println(json);
        return json;
    }

    public static String universityListSerialize (List<University> universityList) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(universityList);
        System.out.println(json);
        return json;
    }

    public static String studentSerialize(Student student) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(student);
        System.out.println(json);
        return json;
    }

    public static String studentListSerialize(List<Student> student) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(student);
        System.out.println(json);
        return json;
    }

    public static University universityDeserialize(String university) {
        Gson gson = new Gson();
        return gson.fromJson(university, University.class);
    }

    public static List<University> universityListDeserialize (String jsonName) {
        Type listType = new TypeToken<List<University>>() {}.getType();
        List<University> gson = new Gson().fromJson(jsonName, listType);
        System.out.println(gson);
        return gson;
    }

    public static Student studentDeserialize (String student) {
        Gson gson = new Gson();
        return gson.fromJson(student, Student.class);
    }

    public static List<Student> studentListDeserialize(String jsonName) {
        Type listType = new TypeToken<List<Student>>() {}.getType();
        List<Student> gson = new Gson().fromJson(jsonName, listType);
        System.out.println(gson);
        return gson;
    }
}
