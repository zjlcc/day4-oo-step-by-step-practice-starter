package oo;

import java.util.Objects;

public class Klass {
    private Integer number;

    public Klass(){}

    public Klass(Integer number){
        this.number = number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
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
            Klass klass = (Klass) object;
            return Objects.equals(klass.number, this.number);
        }
        return false;
    }

    public Integer getNumber() {
        return number;
    }
}
