package Linked_List;

import java.util.List;
import java.util.ArrayList;


public class LinkedList {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add("A");
        list.add(5);
        list.add(3.14);

        System.out.println("Linked_List - ArrayList");
        System.out.println("--------------------------");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

    }

}
