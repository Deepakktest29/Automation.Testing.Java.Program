package Exercises;

import java.util.Scanner;

public class Ex_003_CLI_Option_Input {
    public static void main(String[] args) {

        //Take a user input - Name, Age and Salary and print them in the end.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your Age : ");
        int age = scanner.nextInt();

        System.out.println("Enter your Salary : ");
        float salary = scanner.nextFloat();

        System.out.println("Your Name is : "+name);
        System.out.println("Your Age is : "+age);
        System.out.println("Your salary is : "+salary);


    }
}
