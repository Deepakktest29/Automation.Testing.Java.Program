package Exercises;

import java.util.Scanner;

public class Ex_004_Even_Odd_Via_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();


        if(number%2==0){
            System.out.println("This is a Even number");
        }else{
            System.out.println("This is Odd Number");
        }

    }
}
