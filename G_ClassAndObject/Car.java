package G_ClassAndObject;
//This is a class
public class Car {
    //Properties/Fields/Instance Variable
    private int year;
    private String name;
    private int color;
    private int speed;

    //Behaviors/Methods
    public void accelerate(int increment) {
        this.speed += increment;
    }
    public void  deaccelerate(int decrement) {
        if(this.speed < decrement || decrement < 0) {
            System.out.println("Invalid speed");
        }
        this.speed -= decrement;
    }

    //Getters
    public String getName() {
        return this.name;
    }
    public int year() {
        return this.year;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getColor() {
        return this.color;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setModelNo(int year) {
        this.year = year;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setColor(int color) {
        this.color = color;
    }

    //Constructors: It is used to initialize the object
    //Constructor Overloading: Multiple constructor with different signature(list of parameters).

    public Car(){
        System.out.println("Object Created");
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
        System.out.println("Object Created with Name and ModelNo.");
    }
}
