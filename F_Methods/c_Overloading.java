package F_Methods;
//Method Overloading is when multiple methods have the same name but different parameters in the same class.
//It is used to perform similar tasks with different types or numbers of inputs.

public class c_Overloading {
    // Signature --> "sum(int a, int b)" this part is called signature of a method.

    //The sum() method is overloaded.
    public static int sum(int a, int b){ //Two int parameter
        return a+b;
    }

    public static int sum(int a, int b, int c){ //three int parameter
        return a+b+c;
    }

    public static float sum(float a, float b){ //two float parameter
        return (a+b);
    }

    public static int sum(int ...a){ // ...a represent and argument treated as array without passing the actual array.
        int ans = 0;
        for(int x : a){
            ans += x;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.printf("%.2f\n",sum(1.1f,2.2f));
        System.out.println(sum(1,2,3,4,5));
    }
}
