package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Account<Integer,Double> acc1 = new Account<>(123123,(double)9000);
        Account<String,Integer> acc2 = new Account<>("BB1231231",444);

        ArrayList person = new ArrayList(); // 20
        person.add(1); // 0
        person.add("adfgadfgadfg"); // 1
        person.add(new Object()); // 2

        int a = (int)person.get(1);

        ArrayList<Integer> fff = new ArrayList<>();
        fff.add(1);
        fff.add("sdfadf");



    }
}
