package Exercises;

import java.util.Scanner;

public class Ex_007_Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for whom you want the Factorial! ");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number <= 0) {

            System.out.println(factorial);

        } else {

            for (int i = 1; i <= number; i++) {

                factorial = factorial * i;

            }

            System.out.println("Factorial of " + number + " is: " + factorial);

        }


    }

}