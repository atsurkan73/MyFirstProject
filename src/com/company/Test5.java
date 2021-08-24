package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Test5 {
    public static void main(String[] args) {
        int num1 = 21;
        int num2 = 21;
        if (num1 > num2) {
            System.out.println("Первое число больше");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число равно второму");
        }
    }
}