package Switch_Statement;

import java.util.Scanner;

public class Switch_Without_Break {

        public static void main(String[] args) {

            //Here if we enter any number between the range 1 to 7 then from that number till the last is executed
            // Example: If 5 entered then "Friday" "Saturday" "Sunday" and "Invalid, Day Entered" is displayed

            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter any number from (1 to 7) : ");
            int number = scanner.nextInt();

            switch (number){

                case 1:
                    System.out.println("Monday");

                case 2:
                    System.out.println("Tuesday");

                case 3:
                    System.out.println("Wednesday");

                case 4:
                    System.out.println("Thrusday");

                case 5:
                    System.out.println("Friday");

                case 6:
                    System.out.println("Saturday");

                case 7:
                    System.out.println("Sunday");

                default:
                    System.out.println("Invalid, Day Entered");



            }




        }
}


