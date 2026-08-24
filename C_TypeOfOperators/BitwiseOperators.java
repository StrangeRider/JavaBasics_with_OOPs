package C_TypeOfOperators;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Only Operands: byte,short,int and long; decimal values not supported.
        // AND &
        // OR |
        // XOR ^
        // Not ~
        // LeftShift <<
        // Right Shift >>
        // UnsignedRightShift >>> adds zero in the left side

        int a = 4 & 5;
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(a)+" AND is --> "+a);

        int b = 4 | 5;
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(b)+" OR is --> "+b);

        int c = 10^5;
        System.out.println(Integer.toBinaryString(10));
        System.out.println("0"+Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(c)+" XOR is --> "+c);

        int d = ~5;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(d)+" NOT is --> "+d);

        int e = 5<<2;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(e)+" Left Shift is --> "+e);

        int f = 5>>1;
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(f)+" Right Shift is --> "+f);

        // This add Extra ones in the left
        int g = -5>>1;
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(g)+" Right Shift is --> "+g);

        //But the unsigned rightShift add Extra zeros in the left
        int h = -5>>>1;
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(h)+" Right Shift is --> "+h);
    }
}
