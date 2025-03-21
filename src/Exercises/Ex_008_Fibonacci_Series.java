package Exercises;

import java.util.Scanner;

public class Ex_008_Fibonacci_Series {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = scanner.nextInt();

        int f1 = 0;
        int f2 = 1;

        System.out.println("Fibonacci Series up to " + number + " terms:");
        System.out.print(f1 + " " + f2);

        for(int i=2; i < number;i++) {

            int fib = f1+f2;
            System.out.print(" " + fib);
            f1 = f2;  // Move forward in the series
            f2 = fib;

        }

        System.out.println();

    }


}
