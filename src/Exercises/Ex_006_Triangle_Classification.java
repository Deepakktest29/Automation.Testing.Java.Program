package Exercises;

import java.util.Scanner;

public class Ex_006_Triangle_Classification {

    public static void main(String[] args) {

        // ✅ Triangle Classifier:
        //
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Triangle Side 1 :");
        int s1 = scanner.nextInt();

        System.out.println("Enter the Triangle Side 2 :");
        int s2 = scanner.nextInt();

        System.out.println("Enter the Triangle Side 3 :");
        int s3 = scanner.nextInt();

        if(s1 == s2 && s3 == s1){
            System.out.println("Acute/Equilateral Triangle");
        } else if (s1 == s2 || s2 == s3 || s3==s1) {
            System.out.println("Issoeles Triangle ");
        } else {
            System.out.println("Scalene Triangle");
        }


    }
}
