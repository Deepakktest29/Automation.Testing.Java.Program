package Operators;

public class Different_OperatorType {
    public static void main(String[] args) {

        //In this case if both are true then it's true else false
        System.out.println("AND Operator (&&) : ");
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println("\n");

        //In this case if both are false then it's false else true
        System.out.println("OR Operator (||) : ");
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println("\n");

        //In this case opposite will come
        System.out.println("NOT Operator (!) : ");
        System.out.println(!true);
        System.out.println(!false);

    }
}
