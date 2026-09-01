package D_LoopsAndConditionalStatement;

public class ConditionalStatement {
    public static void main(String[] args) {

        //if-else statement: when "if" condition is true "if" block will execute otherwise else block will execute.

        //Nested if-else statement
        int age = 33;
        if(age>=18){
            System.out.println("You can apply for Driving License!");
        }else{
            if(age>=16){
                System.out.println("You can apply for Learning Driving License!");
            }else{
                System.out.println("You can not apply for Driving License!");
            }
        }

        // Same code with else-if statement :
        if(age>=18){
            System.out.println("You can apply for Driving License!");
        }else if(age>=16){
            System.out.println("You can apply for Learning Driving License!");
        }else{
            System.out.println("You can not apply for Driving License!");
        }



        int i = 3;
        // switch statement directly jumps to the value and execute all the case below it is break statement not used
        // used for byte,short,char,int,String,Enum types
        switch(i){
            case 1:
            case 2:
            case 3:
                System.out.println("Number is 1 2 or 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            default:
                System.out.println("Number in not 1 2 3 4");
        }

        // Used in str as per the new update
        String fruit = "Apple";
        switch (fruit){
            case "Apple":
                System.out.println("Fruit is Apple");
                break;
            case "Orange":
                System.out.println("Fruit is Orange");
                break;
            default:
                System.out.println("Fruit in not Fruit");
        }
    }
}
