package IF_Condition;

public class Code_001_ParseInt {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if(age > 18){
            System.out.println("You're allowed to visit GOA!!");
        }else{
            System.out.println("You can't visit to GOA!!");
        }

    }
}
