package oo;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> klasses = new ArrayList<>();

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public String introduce() {
        String formattedKlass = klasses.stream()
                .map(klass -> klass.getNumber().toString())
                .collect(Collectors.joining(", "));

        return String.format("%s I am a teacher. I teach Class %s.", super.introduce(), formattedKlass);
    }

    public void assignTo(Klass klass) {
        if (!klasses.contains(klass)) {
            klasses.add(klass);
            klass.setTeacher(this);
        }
    }

    public boolean belongsTo(Klass klass) {
        return klasses.contains(klass);
    }

    public boolean isTeaching(Student student) {
        return klasses.contains(student.getKlass());
    }
}
