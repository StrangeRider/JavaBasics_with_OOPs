package I_Inheritance.d_Multiple;
/*
    Java does not support multiple inheritance using classes because it can cause ambiguity,
    especially when two parent classes contain the same method.
    Java achieves similar functionality using interfaces.
*/

public class Test {
    public static void main(String[] args) {
        //Let assume Child Inherits Both Parent_A And Parent_B.
        Child child = new Child();
        // child.show();
        // when this show() is called which method is called from Parent_A or Parent_B, this is the only reason.
    }

}
