package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number 1, 2 or 3 of your choice: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2;
        number2 = number1 >= 1 && number1 <= 3 ? (System.out.println("You entered number: " + number1)):
        System.out.println("You entered number not equal to 1, 2 or 3");
        }
    }