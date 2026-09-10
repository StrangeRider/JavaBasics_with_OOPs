package I_Inheritance.c_MultiLevel;

public class GrandParent {
    String name;
    int age;
    boolean hasSuperPower;


    //when no constructor is created java calls a default constructor with no parameters.
    //when we explicitly create a constructor, Java does not call the default constructor itself.

    public GrandParent(String name, int age) {
        this.name = name;
        this.age = age;
        this.hasSuperPower = false; //must be followed through generation, So Super Class Constructor Called first.
        System.out.println("This is GrandParent constructor!");
    }


}
