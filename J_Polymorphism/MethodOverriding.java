package J_Polymorphism;
//Also Called: Run Time Polymorphism or Dynamic Method Dispatch.

class Animal {
    String name;
    int age;

    public void sayHello(){
        System.out.println("...");
    }
}

class Dog extends Animal {
    @Override
    public void sayHello(){
        System.out.println("Woof!");
    }

    //This is a extra Feature of Dog class.
    public void sayBye(){
        System.out.println("Woof! Woof!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        //Normal Object Creation using Reference of Dog Class
        //Here all the properties And method from Both Animal and Dog class Work.
        Dog d1 = new Dog();
        d1.sayHello();
        d1.sayBye();


        /*
        -Object Creation using Reference of Animal Class
        Since we are taking the reference of animal class. The Storing capacity is only for the animal class.
        Therefore, we cannot call the extra methods defined in the Dog Sub Class.
        Only the overriden methods of the Dog class can be called.
        */
        Animal d2 = new Dog();  //upcasting
        d2.sayHello();
        // d2.sayBye;  // Cannot call


        Dog d3 = (Dog)d2; //Typecasting for object. Down casting
        //Now we can call the extra Methods.
        d3.sayBye();
    }
}
