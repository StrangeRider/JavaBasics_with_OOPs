package F_Methods;

public class a_ReturnTypes {
    // 1. int
    public static int getInt() {
        return 10;
    }

    // 2. float
    public static float getFloat() {
        return 10.5f;
    }

    // 3. double
    public static double getDouble() {
        return 10.5;
    }

    // 4. String
    public static String getString() {
        return "Hello";
    }

    // 5. boolean
    public static boolean getBoolean() {
        return true;
    }

    // 6. char
    public static char getChar() {
        return 'A';
    }

    // 7. Array
    public static int[] getArray() {
        return new int[]{123, 234, 345};
    }

    // 8. Object(come after the class&object lesson if new to this)
    public static Student getObject() {
        Student s1 = new Student("Toofaan",20,8.91); //Object created of Student class
        s1.name="Toofaani Sher"; //can update any field if needed
        System.out.println(s1); //object id or reference of object
        return s1; // Returned the reference of object
    }


    public static void main(String[] args) {

        //all method called
        System.out.println(getInt());
        System.out.println(getFloat());
        System.out.println(getDouble());
        System.out.println(getString());
        System.out.println(getBoolean());
        System.out.println(getChar());

        System.out.println(getArray()[0]); //access the 0th index element

        //come after the class&object lesson if new to this.
        Student student1 = getObject();
        System.out.println(student1); //object id
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.marks);
        student1.marks = 9.41;
        System.out.println(student1.marks);
    }
}

//Class for object return type example
class Student {

    String name;
    int age;
    double marks;

    // Constructor to initialize the object
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}