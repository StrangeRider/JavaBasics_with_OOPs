package J_Polymorphism;
//Also Called: Compile Time Polymorphism

class Calculator{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b , int c){
        return a+b+c;
    }

    public float sum(float a, float b){
        return a+b;
    }
}

public class MethodOverLoading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,2));
        System.out.println(calc.sum(2,2,2));
        System.out.println(calc.sum(2.2f , 2.2f));

    }
}
