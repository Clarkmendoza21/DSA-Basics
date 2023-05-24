

public class selectionSorting {
    static int[][] arr = {
                        {17,13,76,43},
                        {18,14,9,21},
                        {45,7,6,1},
                        {9,65,80,33}
                    };
    public static void main(String[] args) {
        sort(arr);
        for (int x=0;x<arr.length;x++){
            System.out.print(" [ ");
           for (int y: arr[x]){
             System.out.print(y+" ");
           }
           System.out.println("] \n");
        }
    }

    public static void sort(int [][] array){

        for (int a = 0; a < array.length;a++){
            for (int i = 0; i<array[a].length-1;i++){
            int min = i;
            for (int j = i+1;j<arr.length;j++){
                if (array[a][min]>array[a][j]) min=j;        
            }
        int tmp = arr[a][i];
        arr[a][i] = arr[a][min];
        arr[a][min] = tmp;
        } 
    }
    }

    /*
     * 
     */
}
