package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Teacher> teachers;

    private List<Klass> klasses;

    public School() {
        teachers = new ArrayList<>();
        klasses = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addKlass(Klass klass) {
        klasses.add(klass);
    }

    public void startSchool() {
        teachers.stream()
                .forEach(teacher -> System.out.println(teacher.introduce()));

        klasses.stream()
                .forEach(klass -> klass.getStudents().forEach(student -> System.out.println(student.introduce())));
    }
}
