package I_Inheritance.c_MultiLevel;

public class Child extends Parent {
    //constructor
    public Child(String name, int age) {
        super(name,age);
        //Always written in the subclass constructors.
        //We Don't need to write super() when no parameters are passed, it is internally written at the starting.
        System.out.println("This is Child constructor!");
    }

    //method
    public void childMethod(){
        super.parentMethod();
        System.out.println("This is Child method!");
        super.parentMethod();
    }
}
