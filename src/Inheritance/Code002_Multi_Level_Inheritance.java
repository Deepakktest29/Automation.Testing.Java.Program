package Inheritance;

public class Code002_Multi_Level_Inheritance {

    public static void main(String[] args) {

        System.out.println("Grand Father Assets: ");
        GrandFather gdf1 = new GrandFather();
        gdf1.house();
        System.out.println("Gold: " + gdf1.gold);
        System.out.println("-------------------------------");

        System.out.println("Father Assets: ");
        Father1 f1 = new Father1();
        f1.house();
        System.out.println("Gold (Father1): " + f1.gold);
        System.out.println("Gold (GrandFather via Father1): " + ((GrandFather) f1).gold);
        System.out.println("-------------------------------");

        System.out.println("Son Assets: ");
        Son1 s1 = new Son1();
        s1.house();
        System.out.println("Gold (Father1 via Son1): " + ((Father1) s1).gold);
        System.out.println("Gold (GrandFather via Son1): " + ((GrandFather) s1).gold);
    }
}

class GrandFather {
    int gold = 5500;

    void house() {
        System.out.println("2 BHK House");
    }
}

class Father1 extends GrandFather {
    int gold = 3500; // This hides the gold variable from GrandFather

    void house() {
        System.out.println("3 BHK House");
    }
}

class Son1 extends Father1 {
    void house() {
        System.out.println("4 BHK House");
    }
}
