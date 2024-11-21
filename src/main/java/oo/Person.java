package oo;

import java.util.Objects;

public class Person {
    protected Integer id;
    protected String name;
    protected Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (Objects.isNull(object)) {
            return false;
        }
        if (object.getClass().equals(this.getClass())) {
            Person person = (Person) object;
            return Objects.equals(person.id, this.id);
        }
        return false;
    }
}
