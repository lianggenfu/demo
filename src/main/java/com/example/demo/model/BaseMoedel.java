package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

public class BaseMoedel implements Serializable {

    private static final long serialVersionUID = -7224334994831765053L;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseMoedel that = (BaseMoedel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
