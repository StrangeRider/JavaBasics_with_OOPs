package B_DataTypes;

public class d_ArrayJava {
    public static void main(String[] args) {
        /*
        * Array is a Non-primitive dataType Or Reference DataType.
        * Reference is stored in stack and Actual data is stored in heap.
        * reference stores the address od starting block of the array.
        * Heap Memory:
            +---+---+---+---+---+
            | 0 | 0 | 0 | 0 | 0 |  <- Array object (of 5 integers) in heap memory
            +---+---+---+---+---+
             ^
             |
            Stack Memory: arr
        */



        //initializations: 1d array
        char arr1[] = new char[10]; // initialize the array as default value 0 for every index

        int arr2[];
        arr2 = new int[]{1, 2, 3, 4, 5};

        int arr3[] = {6,7,8,9,0};

        System.out.println("Address of arr1: "+arr1); // [C@6ce253f1: '[' = 1d array, 'C' = char array


        //iterating in 1d array:
        for(int element : arr3){
            System.out.print(element+" ");
        }
        System.out.println();


        //initializations: 2d array
        int matrix[][] = new int[3][2];   //[rows][columns]

        int matrix1[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Address of 2d array: "+matrix); // [[I@3d075dc0: '[[' = 2d array, 'I' = int array

        //initializing Jagged array
        int jaggedMatrix[][] = new int[3][];
        jaggedMatrix[0] = new int[2];
        jaggedMatrix[1] = new int[3];
        jaggedMatrix[2] = new int[2];

        //iterating in jaggedMatrix
        int count = 1;
        for(int i=0; i<jaggedMatrix.length; i++){
            for(int j=0; j<jaggedMatrix[i].length; j++){
                jaggedMatrix[i][j] = count;
                count++;
            }
        }
        for(int i=0; i<jaggedMatrix.length; i++){
            for(int j=0; j<jaggedMatrix[i].length; j++){
                System.out.print(jaggedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
