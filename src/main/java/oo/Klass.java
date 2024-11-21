package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private Integer number;
    private Student leader;
    private List<Student> students;
    private Teacher teacher;

    public Klass() {
        students = new ArrayList<>();
    }

    public Klass(Integer number) {
        this();
        this.number = number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Klass klass = (Klass) obj;
        return Objects.equals(this.number, klass.number);
    }

    public Integer getNumber() {
        return number;
    }

    public void assignLeader(Student leader) {
        if (!leader.isIn(this)) {
            System.out.println("It is not one of us.");
        }
        this.leader = leader;

        if (!Objects.isNull(teacher))
            System.out.printf("I am %s, teacher of Class %d. I know %s become Leader.", teacher.getName(), number, leader.getName());

        students.stream()
                .filter(student -> Objects.equals(leader, student))
                .forEach(student -> System.out.printf("I am %s, student of Class %d. I know %s become Leader.", student.getName(), number, leader.getName()));
    }

    public boolean isLeader(Student student) {
        return Objects.equals(leader, student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
