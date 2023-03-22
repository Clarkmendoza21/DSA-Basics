public class selectionSort {
    static int[] arr ={-6,1,24,65,8,76,9,0,4,2,5,10,9};
    static int[] arrTwo = {10,41,54,65,76,2,3,101,32};
    public static void main(String[] args) {
        selectSort(arrTwo);
        for(int i:arrTwo){
            System.out.print(i+" ");
        }
    }

    public static void selectSort(int[] arr){
        for (int i = 0; i<arr.length;i++){
            //container for the possible minimum number
            int min = i;
            // checks if number is the least in the array
            for (int j = i+1;j<arr.length;j++){
                //1,24,65,8,76,9,0,-6,4,2,5,10,9
                if (arr[min]>arr[j]) {
                    min=j;//get the smallest value
                }     
                
            }
            // to place the smallest value in the front
        int tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;
        } 
    }
}
