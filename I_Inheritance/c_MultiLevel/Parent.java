package I_Inheritance.c_MultiLevel;

public class Parent extends GrandParent {
    public Parent(String name, int age) {
        super(name, age);
        //Always written in the subclass constructors.
        //We Don't need to write super() when no parameters are passed, it is internally written at the starting.
        System.out.println("This is Parent constructor!");
    }

    public void parentMethod(){
        System.out.println("This is Parent method!");
    }
}
