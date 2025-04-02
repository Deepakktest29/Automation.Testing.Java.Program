package Inheritance;

public class Code001_Single_Inheritance {

    public static void main(String[] args) {

        System.out.println("Father Assets : ");
        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.house();

        System.out.println("-----------------------");

        System.out.println("Son Asset : ");
        Son s1 = new Son();
        s1.house();
        System.out.println(s1.gold);

    }
}

class Father {

    int gold = 2500;
     void house () {
         System.out.println("2 BHK ");
     }

}

class Son extends Father {

    void house() {
        System.out.println("3 BHK ");
    }
}