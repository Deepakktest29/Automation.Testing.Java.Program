package Linked_List;

import java.util.ArrayList;

public class Array_List_Operations {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(55);
        list.add(3.14);

        System.out.println(list.get(1));
        System.out.println(list.contains(55));
        System.out.println(list.getClass());;
        System.out.println(list.equals(list));
        System.out.println(list.isEmpty());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.size());
        System.out.println(list.remove(2));
        System.out.println(list);



    }

}
