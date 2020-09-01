package com.deutsche;

import demo.Person;
import homework.DynamicIntegerArray;
import homework.DynamicIntegerArrayImpl;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {

        DynamicIntegerArrayImpl dynamicIntegerArray = new DynamicIntegerArrayImpl();
        dynamicIntegerArray.size();
        dynamicIntegerArray.add(6);
        System.out.println(dynamicIntegerArray.get(4));

    }
}
