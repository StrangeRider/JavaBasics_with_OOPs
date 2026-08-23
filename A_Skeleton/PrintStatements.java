package A_Skeleton;

import java.util.Locale;

public class PrintStatements {
    public static void main(String[] args) {
        //Print statement: After printing the cursor stays on the same line
        System.out.print("Hello");
        System.out.print(" World!");
        System.out.print("\n"); //For manual next line use "\n"
        // similarly use "\t" for tab, "\'" for single quote, "\"" for double quote, "\\" for backslash

        //Println statement: After printing the cursor moves to the next line
        System.out.println("Hello");
        System.out.println("World!");


        // Basic of printf statement
        int age = 20;
        float height = 176.234f;
        char ch = '?';
        String str = "Baldev Yadav";
        boolean flag = true;
        System.out.printf("%s is %d years old with %.2fcm height, is a %b developer%c\n", str, age, height, flag, ch);
        //use %s:String, %d:Integer, %f:Decimal, %b:Boolean, %c:Character

        // float in exponential format
        float e = 278163871f;
        System.out.printf("%e\n",e);

        // Regional Number format.
        double num = 12345678.12345;
        System.out.printf("Default: %.3f\n",num);
        System.out.printf(Locale.US,"US: %,.3f\n",num);
        System.out.printf(Locale.FRENCH,"French: %,.3f\n",num);
        System.out.printf(Locale.GERMANY,"Germany: %,.3f\n",num);
    }
}
