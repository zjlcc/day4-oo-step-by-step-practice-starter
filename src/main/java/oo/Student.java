package oo;

public class Student extends Person {
    private Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public String introduce() {
        return super.introduce() + " I am a student." + " I am in class " + klass.getNumber() + ".";
    }

    public void join(Klass klass){
        this.klass = klass;
    }

    public boolean isIn(Klass klass){
        return klass.equals(this.klass);
    }
}
