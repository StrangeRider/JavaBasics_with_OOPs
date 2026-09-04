package G_ClassAndObject;

class Cat{
    String name;
    int age;
}

public class ObjectIsAReference {

    public static Cat catNameChange1(Cat a){
        a.name="Astroid Destroyer";
        return a;
    }

    public static void catNameChange2(Cat a){
        a.name="Roberto March";
    }

    public static void main(String[] args) {
        //Using object return method
        Cat c1 = new Cat();
        c1.name="Plum";
        Cat c2 = catNameChange1(c1);

        //Both instances(c1 & c2) refers to the same object
        //name will be same for both
        System.out.println(c1.name);
        System.out.println(c2.name);

        //No object return
        Cat c3 = new Cat();
        c3.name="plum";
        catNameChange2(c3);
        System.out.println(c3.name);
    }
}
