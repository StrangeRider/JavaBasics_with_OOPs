package F_Methods;

public class b_StringWithMethod {
    //Strings are immutable. So, whenever we modify the string a new string is created in the string pool and the address is modified.
    public static String toUpper(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "Babbar Sher";
        System.out.println(str);
        System.out.println(toUpper(str));
        //Since we did not assign the Updated String in str, it never Changed.
        System.out.println(str);
    }
}
