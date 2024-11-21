package oo;

import java.util.Objects;

public class Klass {
    private Integer number;
    private Student leader;

    public Klass() {
    }

    public Klass(Integer number) {
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

    public void assignLeader(Student student){
        if(!student.isIn(this)){
            System.out.println("It is not one of us.");
        }
        leader = student;
    }

    public boolean isLeader(Student student){
        return Objects.equals(leader, student);
    }
}
