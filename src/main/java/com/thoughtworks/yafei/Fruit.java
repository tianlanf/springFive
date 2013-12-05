package com.thoughtworks.yafei;

public class Fruit {
    private int size;
    private int rank;


    public Fruit(int rank) {
        this.rank = rank;
    }

    public void pringMsg() {
        System.out.println("I am fruit, my size is " + size + " and my rank is No." + rank);
    }

    public void setSize(int size) {
        this.size = size;
    }
}
