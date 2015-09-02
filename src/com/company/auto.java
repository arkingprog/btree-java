package com.company;

import java.util.Objects;

/**
 * Created by artem on 02.09.2015.
 */
public class Auto extends Object implements Comparable<Auto>{
    private String model;
    private String number;
    private String mark;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Auto(String mark, String model, String number ) {
        this.model = model;
        this.number = number;
        this.mark = mark;
    }

    @Override
    public int compareTo(Auto o)
    {
        return number.compareTo(o.number);
    }

    @Override
    public String toString()
    {
        return  "Чудо машина " + model + " " + mark + " гос номер" + number;
    }
}
