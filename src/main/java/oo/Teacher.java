package oo;

public class Teacher extends Person{
    public Teacher(Integer id, String name, Integer age){
        super(id, name, age);
    }
    public String introduce(){
        return super.introduce() + " I am a teacher.";
    }
}
