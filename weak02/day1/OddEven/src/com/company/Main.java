package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("I need a number");
        int number = sc.nextInt();

        if((number % 2) == 0){
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}
