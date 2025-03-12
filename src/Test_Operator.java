public class Test_Operator {

    public static void main(String[] args){

        // Here is the example of the Boolean Operator with an example
        System.out.println("Boolean Operator Example : ");
        boolean Is_married = true;
        boolean Is_amit_married = false;

        System.out.println(Is_married);
        System.out.println(Is_amit_married);
        System.out.println("\n");

        // Arithmetic Operator with an example
        int a = 25;
        int b = 12;
        System.out.println("Arithmetic Operator Example : ");
        System.out.printf("Addition = %d\n",a+b);
        System.out.printf("Subtraction = %d\n",a-b);
        System.out.printf("Multiplication = %d\n",a*b);
        System.out.printf("Division = %d\n",a/b);
        System.out.printf("Modulus = %d\n",a%b);
        System.out.println("a+b");

        System.out.println("\n");

        // Unary Operator with an example
        int c = 12;
        int d = 5;
        c+=15;
        d-=3;
        int a1 = +10;
        int a2 = -110;
        int result = a1+a2;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(result);
        System.out.println("Unary Operator Example : ");
        System.out.println(c);
        System.out.println(d);

        //Assignment Operator
        int e = 12;  // The Equal (=) sign is a Assignment operator , where it assign from right to left
        System.out.println("Assignment Operator : ");
        System.out.println(e);
        System.out.println("\n");

        //Relational Operator
        int f = 14;
        int g = 21;
        boolean h = f>=g;
        System.out.println("Relational Operator : ");
        System.out.println(h);
        System.out.println("\n");

        //Logical Operator
        boolean a3 = true;
        System.out.println("Logical Operator");
        System.out.println(!a3);
        boolean a4 = false;
        System.out.println(!!a4);
        boolean a5 = true || false;
        System.out.println("\n");

        // + Operator
        String q1 = "Hello";
        String q2 =  "World";  // + operator work different for different data type
        int i = 12;
        int j = 15;
        System.out.println(" + Operator Example ");
        System.out.println(q1+q2);
        System.out.println(q1 + q2 + i + j);
        System.out.println(i + j + q1 + q2);
        System.out.println("\n");

        }

    }