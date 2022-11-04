package org.launchcode.techjobs.persistent.models;

import javax.annotation.processing.Generated;
import java.util.Objects;

//@MappedSuperclass //wtfff
public abstract class AbstractEntity {

    private int id;

    private String name;

//    @Id
//    @GeneratedValue
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}