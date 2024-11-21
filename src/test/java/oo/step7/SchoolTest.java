package oo.step7;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_print_introduce_when_startSchool_given_klasses_in_School() {
        Student tom = new Student(1, "Tom", 18);
        Klass klass = new Klass(1);
        tom.join(klass);
        School school = new School();
        school.addKlass(klass);

        school.startSchool();

        assertThat(systemOut()).contains("My name is Tom. I am 18 years old. I am a student. I am in class 1");
    }

    @Test
    public void should_print_introduce_when_startSchool_given_teachers_in_School() {
        Teacher jerry = new Teacher(1, "Jerry", 25);
        School school = new School();
        school.addTeacher(jerry);

        school.startSchool();

        assertThat(systemOut()).contains("My name is Jerry. I am 25 years old.");
    }

    private String systemOut() {
        return outContent.toString();
    }
}
