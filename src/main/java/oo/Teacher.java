package oo;

import java.util.Objects;

public class Teacher {
    private Integer id;
    private String name;
    private Integer age;

    public Teacher(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "My name is "+ name +". I am "+ age+" years old. I am a teacher.";
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
            Teacher teacher= (Teacher) object;
            return Objects.equals(teacher.id, this.id);
        }
        return false;
    }
}
