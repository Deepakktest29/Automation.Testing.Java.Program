package Ternary_Operator;

import java.util.Scanner;

public class Code_008 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score value : ");
        int n = sc.nextInt();
        String Result = (n <0 || n>100) ? "Invalid score!!, Please enter again"
                        :(n <=100 && n >=90)?"A"
                        :(n <=89 && n >=80) ?"B"
                        :(n <=79 && n >=70) ?"C"
                        :(n <=69 && n >=60) ?"D"
                        :(n <=59 && n >=0) ?"E":"F";

        System.out.println(Result);
    }
}
