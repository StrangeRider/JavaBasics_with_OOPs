package B_DataTypes;

public class b_TypeCast {
    public static void main(String[] args) {

        // This is Widening conversion or Implicit conversion or Auto Conversion
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue; // Widening conversion from int to long
        float floatValue = longValue; // Widening conversion from long to float
        double doubleValue = floatValue; // Widening conversion from float to double

        System.out.println("byte:" + byteValue);
        System.out.println("double:" + doubleValue);

        //char to int and int to char
        int chVal = 'a';
        char ch = 76;

        //char to float
        float chValFloat = 'a';

        // This is Narrowing Conversion or Explicit conversion
        double d = 123.456;
        float f = (float) d; //forcefully typecast
        long a = (long) f;   //forcefully typecast
        int i = (int)a;      //forcefully typecast
        System.out.println("Int Value: "+i);

        //Integer.toBinaryString(int) : covert integer value to binary value in string format
        System.out.println("Binary Value of 123: "+Integer.toBinaryString(i));
    }
}
