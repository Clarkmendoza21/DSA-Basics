package searching;

public class linearSearching {
    static int [][] arr = {
                            {1,6,7,9},//0
                            {10,13,14,17},//1
                            {18,21457646,33,34246}, //2
                            {45,65,76,80}//3
                        };
    public static void main(String[] args) {
        search(arr, 43);
    }

    public static void search(int[][] array, int x){
        int tries= 0;
        // RESPONSIBLE FOR OUTER ARRAY ROUTING
        for (int i = 0;i<array.length;i++){
            // CHECK IF ELEMENT IF INNER ARRAY IS EQUAL TO THE INPUT 
            for (int j=0;j<array[i].length;j++){
                if( x==array[i][j]) {
                    tries++;
                    System.out.println("Answer: "+array[i][j]+" tries: "+tries);
                }else {
                    tries++; 
                    continue;
                }
            }
        }
    }
    /*
     * DOUBLE LINEAR SEARCH 
     * 00,01,02,03,10,11,12,13
     */
}
