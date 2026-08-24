package C_TypeOfOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        System.out.println(x+y); //addition operator
        System.out.println(x-y); //subtraction operator
        System.out.println(x*y); //multiplication operator
        System.out.println(x/y); //division operator
        System.out.println(x%y); //modulo operator

        //Implicit typeCast Or Widening TypeCast.
        int a = 4;
        double b = a + 10.8;

        //Can't Store e in long.(Data loss possible.)
        float c = 5.9f;
        long d = 10;
        //long * float must be store in float(big dataType b/w two).
        float e = c + d;


        //int f = 436788688;  In int data loss possible
        long f = 436788688;
        long g = f * 27252;
        System.out.println(g);

        //Both the no Int.
        int h = 10;
        int i = 3;
        System.out.println("Division of Integers:" + h/i);

        //Both the no float or double(more precision in double)
        float j = 10;
        float k = 3;
        System.out.println("Division of FLoat/Double:"+j/k);

        //Adding a int in a byte dataType
        byte l = 10;
        //l = l + 5;  //this line shows error because 5 in an Int No. and we are adding saving in byte
        l = (byte)(l + 5);

    }
}
