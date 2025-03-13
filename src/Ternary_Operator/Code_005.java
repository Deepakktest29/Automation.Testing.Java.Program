package Ternary_Operator;

public class Code_005 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = -7;

        int max = (a > b) ? (a > c) ? a : c : ((b > c) ? b : c);
        System.out.println("The biggest number = "+max);

    }
}
