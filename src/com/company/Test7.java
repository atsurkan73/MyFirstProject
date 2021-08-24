package com.company;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("Enter number 1  ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        if (number1 == 1) {
            System.out.println("You Entered number 1");
        } else {
            System.out.println("You Entered number that differ from 1");
        }
    }
}
