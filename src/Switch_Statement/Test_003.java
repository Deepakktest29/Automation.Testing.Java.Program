package Switch_Statement;

import java.util.Scanner;

public class Test_003 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number from (1 to 7) : ");
        String browser = scanner.next();

        switch (browser) {

            case "Chrome":
                System.out.println("Open Chrome");
                System.out.println("Execute TC-01");
                System.out.println("Execute TC-02");
                break;

            case "Firefox":
                System.out.println("Open Firefox");
                break;

            case "Edge":
                System.out.println("Open Edge");
                break;

            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
