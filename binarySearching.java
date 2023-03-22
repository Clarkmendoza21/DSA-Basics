package searching;

public class binarySearching {
    static int [][] arr = {
                            {1,6,7,9},//0 arr[2][2]
                            {9,13,14,17},//1
                            {18,21,33,43},//2
                            {45,65,76,80}//3
                        };
    static int[][] arrTwo={
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                        };
    public static void main(String[] args) {
        search(arrTwo, 6);
    }
    public static void search (int array[][],int x){
        //OUTER LOOP
        int minOut=0;
        int maxOut= array.length-1;
        int midOut = maxOut-minOut/2; 

        //INNER LOOP
        int minIn = 0;
        int maxIn = array[midOut].length-1;

        //COUNTER
        int tries= 0;
        
        while (maxOut>=minOut){
            while (maxIn>=minIn){
                // MANIPULATE INNER ARRAYS
                int midIn = maxIn-minIn/2;
                if(x==array[midOut][midIn]){tries++; System.out.println("ans: "+array[midOut][midIn]+" tries: "+tries);break;}
                else if(x<midIn){tries++; maxIn = midIn- 1;}
                else {tries++; minIn = midIn +1;}
            }
            // OUTER ARRAY ROUTING
            if(x<array[midOut][maxIn]){maxOut = midOut- 1;}
                else {minOut = midOut +1;}
        }
    }

    /*
     * GOAL : 
     *       MAKE A DOUBLE BINARY SEARCH: ONE FOR THE INNER ARRAYS AND ONE FOR OUTER ARRAY
     *       LESSEN THE TIME NEEDED FOR THE PROGRAM TO FINISH (compare to linear search)
     */
}
