package com.example.spring_boot;

public class param {
    private Integer a;
    private  Integer b;

    public param(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    public param() {
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
