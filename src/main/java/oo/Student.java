package oo;

public class Student extends Person {
    private Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public String introduce() {
        String introduce = String.format("%s I am a student. I am in class %d.", super.introduce(), klass.getNumber());
        if(klass.isLeader(this)){
           introduce = String.format("%s I am the leader of class %d.",introduce,klass.getNumber());
        }
        return introduce;
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return klass.equals(this.klass);
    }

    public Klass getKlass() {
        return klass;
    }
}
