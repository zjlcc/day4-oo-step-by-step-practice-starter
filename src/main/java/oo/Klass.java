package oo;

import java.util.Objects;

public class Klass {
    private Integer number;

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
}
