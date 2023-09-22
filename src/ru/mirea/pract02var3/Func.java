package ru.mirea.pract02var3;

import java.lang.*;

public class Func {

    private double i; //double - используем потому что если использовать int то получим нули.

    void printArgs() {
        for (i = 1; i <= 10; i++) {
            System.out.println(1 / i);
        }
    }
}
