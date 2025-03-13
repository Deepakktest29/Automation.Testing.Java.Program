package Ternary_Operator;

public class Code_007 {
    public static void main(String[] args) {

        // Age Classification without defined value as we took user input

        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println(result);

    }
}
