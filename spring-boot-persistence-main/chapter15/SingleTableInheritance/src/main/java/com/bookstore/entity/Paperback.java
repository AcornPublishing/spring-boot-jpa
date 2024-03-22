package com.bookstore.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@DiscriminatorValue("3")
public class Paperback extends Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    private String sizeIn;
    @NotNull
    private String weightLbs;

    public String getSizeIn() {
        return sizeIn;
    }

    public void setSizeIn(String sizeIn) {
        this.sizeIn = sizeIn;
    }

    public String getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(String weightLbs) {
        this.weightLbs = weightLbs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Paperback{" + "sizeIn=" + sizeIn + ", weightLbs=" + weightLbs + '}';
    }
}