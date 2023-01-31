package com.mycompany.classassignment;
import java.util.Scanner;

public class ClassAssignment {

    public static void main(String[] args) {
        System.out.println("Enter a 5-digit number: ");
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        int digit1 = number / 10000;
        int digit2 = number % 10000 / 1000;
        int digit3 = number % 1000 / 100;
        int digit4 = number % 100 / 10;
        int digit5 = number % 10;
        
        System.out.println(digit1 + "  " + digit2 + "  " + digit3 + "  " + digit4 + "  " + digit5);
    }
}
