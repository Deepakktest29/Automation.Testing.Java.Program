package String_Operations;

public class String_Code_005 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Anatartica");
        sb.append(" IceBerg");
        System.out.println(sb);
        System.out.println(sb.charAt(5));
        System.out.println(sb.delete(0,3));
        System.out.println(sb.deleteCharAt(9));
        System.out.println(sb.length());
        System.out.println(sb.lastIndexOf("a"));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0,3,"Var"));
        System.out.println(sb.subSequence(5,9));
        System.out.println(sb.equals("Anatartica"));
        System.out.println(sb.isEmpty());

    }

}
