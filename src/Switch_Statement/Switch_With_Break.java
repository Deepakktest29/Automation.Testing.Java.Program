package Switch_Statement;

import java.util.Scanner;

public class Switch_With_Break {

    public static void main(String[] args) {

        //Here if we enter number between the range 1 to 7 then related output is displayed
        // Example: If 5 entered then "Friday" is displayed

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any number from (1 to 7) : ");
        int number = scanner.nextInt();

        switch (number){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid, Day Entered");
                break;


        }




    }
}
