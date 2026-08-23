package B_DataTypes;

public class a_DataTypes {
    public static void main(String[] args) {
        //There are primitive data types stored in Stack.
        //default value: 0, 0.0, false

        //Whole numbers
        byte b = 127;          //1 Byte
        short s = 32767;       //2 Byte
        int i = 2147483647;    //4 Byte
        long l = 2147483648l;  //8 Byte
        // add "l" in last, if the long is out of range for int.
        System.out.println("Byte Max Value: "+Byte.MAX_VALUE);
        System.out.println("Short Max Value: "+Short.MAX_VALUE);
        System.out.println("Integer Max Value: "+Integer.MAX_VALUE);
        System.out.println("Long Max Value: "+Long.MAX_VALUE);
        System.out.println();

        //Decimal Number
        float f = 1000.378669658574545747777982f;   //4 Byte
        //add f in last
        double d = 1000.378669658574545747777982;   //8 Bytes
        System.out.println(f);
        System.out.println(d);
        System.out.println("Float Max Value: "+Float.MAX_VALUE);
        System.out.println("Double Max Value: "+Double.MAX_VALUE);
        System.out.println();

        //char
        char ch = (char)65; //2 Byte
        // or remove (char) , java can do automatic type conversion
        int ch_val = (int)'A';
        // similarly you can remove (int);
        System.out.println(ch_val +" : "+ch);
        System.out.printf("Range of a to z : %d to %d\nRange of A to Z : %d to %d\n",(int)'a',(int)'z',(int)'A',(int)'Z');
        System.out.println("Char Min Value: "+(int)Character.MIN_VALUE);
        System.out.println("Char Max Value: "+(int)Character.MAX_VALUE);

        System.out.println('\u2764'); // heart with hexadecimal value or 10084
        System.out.println((char)2309); // hindi "a"

        //boolean
        boolean flag = true;

    }
}