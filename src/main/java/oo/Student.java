package oo;

import java.util.Objects;

public class Student extends Person {

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public String introduce() {
        return super.introduce() + " I am a student.";
    }
}
