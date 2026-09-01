package D_LoopsAndConditionalStatement;

public class LoopsInJava {
    public static void main(String[] args) {
        //Loops is used to iterating over something e.g. array, string, Map, List etc.
        //While loop
        int i = 1;
        while(i<=5){
            if(i==3){
                i++;
                continue; // skip the current iteration
            }
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //do-while loop
        int j = 1;
        do{
            if(j==4){
                break; // exit the current loop.
            }
            System.out.print(j+" ");
            j++;
        }while(j<=5);
        System.out.println();

        //for-loop
        outerLoop: //This is the label for the loop to break
        for(int k=1;k<=5;k++){
            for(int l=1;l<=5;l++){
                if(k==3){
                    break outerLoop;
                }
                System.out.print(k+" ");
            }

        }
        System.out.println();

        //for-each loop: iterating over array
        for(int element : new int[]{1,2,3,4,5}){
            System.out.print(element+" ");
        }
        System.out.println();

        //for-each loop: iterating over string
        for(char ch: "Kumar".toCharArray()){
            System.out.print(ch+" ");
        }
    }
}
