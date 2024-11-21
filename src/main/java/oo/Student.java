package oo;

import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Student(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "My name is "+ name +". I am "+ age+" years old. I am a student.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if(Objects.isNull(object)){
            return false;
        }
        if(object.getClass().equals(this.getClass())){
            Student student= (Student)object;
            return Objects.equals(student.id, this.id);
        }
        return false;
    }
}
