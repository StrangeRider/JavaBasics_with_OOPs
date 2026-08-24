package C_TypeOfOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        //a++ post increment: increased after use
        //a-- post decrement: decreased after use
        //++a pre increment: first increased then used
        //--a pre decrement: first decreased then used

        int a = 99;
        int b = a++;
        System.out.println(a);  // 100
        System.out.println(b);  // 99

        int c = 1;
        int d = c++ + c; // 1 + 2
        System.out.println(d); // 3

        int e = 1;
        int f =  (++e) + e ; // 2 + 2
        System.out.println(f);  // 4

        int g = 1;
        System.out.println(g++ + --g); // 2

    }
}
