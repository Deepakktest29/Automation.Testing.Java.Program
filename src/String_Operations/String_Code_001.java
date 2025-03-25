package String_Operations;

public class String_Code_001 {

    public static void main(String[] args) {

        System.out.println("String Different Operations : ");
        String name = "Family that live together, stay together";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace(" ","_"));
        System.out.println(name.charAt(5));
        System.out.println(name.length());
        System.out.println(name.contains("live"));
        System.out.println(name.trim());
        System.out.println(name.concat("!"));
        System.out.println(name.equals("Family that live together, stay together"));
        System.out.println(name.equalsIgnoreCase("family"));
        System.out.println(name.indexOf('y'));
        System.out.println(name.substring(1,3));
        System.out.println(name.startsWith("F"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.compareTo("Family"));


    }
}
