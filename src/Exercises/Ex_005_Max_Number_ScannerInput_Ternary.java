package Exercises;

import java.util.Scanner;

public class Ex_005_Max_Number_ScannerInput_Ternary {

    public static void main(String[] args) {

        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int f1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int f2 = scanner.nextInt();

        int Result = f1 > f2 ? f1 : f2;
        System.out.println("\n");
        System.out.println("The Maximum Number = "+Result);
    }
}
