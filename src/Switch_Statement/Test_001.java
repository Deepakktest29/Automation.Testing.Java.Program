package Switch_Statement;

public class Test_001 {

    public static void main(String[] args) {

        //Here the Output of the program is "Chrome" as the Switch check the expression which is 1 in the case and it
        //It checks for matching expression, where for 1 it's "Chrome"


        int num = 10;
        switch(1){
            case 1:
                System.out.println("Chrome");
                break;

            case 2:
                System.out.println("Firefox");
                break;
        }
    }
}
