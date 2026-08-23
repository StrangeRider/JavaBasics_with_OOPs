package B_DataTypes;

public class c_StringJava {
    public static void main(String[] args) {
        //String is a Non-primitive dataType Or Reference Type
        //Refence is stored in stack and Actual data is stored in heap.
        //String are immutable.
        String str1 = "Kumar"; // stores in string pool present in the heap
        String str2 = "Kumar"; // str2 stores the same address as str1 locate same string in string pool
        String str3 = new String("Kumar"); // allocate a new memory in the heap for the same string

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        //str.compareTo()
        String s1 = "remote";  // a = 97
        String s2 = "ramote";  // e = 101
        System.out.println(s1.compareTo(s2)); // 101 - 97 = 4

        //str.replace
        System.out.println("remote after replacing: "+s1.replace("mo","uu")); // Or replace a single char ('e','z');

        //.startsWith() and .endsWith()
        System.out.printf("%s starts with \"re\" : %b\n",s1,s1.startsWith("re"));
        System.out.printf("%s endss with \"te\" : %b\n",s1,s1.endsWith("te"));

        //.isEmpty() and isBlank()
        String s3 = "    ";
        System.out.println("\"  \" Is Empty: "+s3.isEmpty());
        System.out.println("\"  \" Is Blank: "+s3.isBlank());

        //String.valueOf()
        int a = 123;
        String a_str = String.valueOf(a); // "123"

        //String.format
        String formattedStr = String.format("My name is %s and my age is %d", "Kumar", 20);
        System.out.println(formattedStr);
    }
}
