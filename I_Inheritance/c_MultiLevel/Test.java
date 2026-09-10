package I_Inheritance.c_MultiLevel;

public class Test {
    public static void main(String[] args) {
        Child c1 = new Child("Raj",20); // Constructor called from top to bottom.
        System.out.println(c1.age);
        c1.childMethod();
    }
}
