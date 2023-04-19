public class insertionSort {
   static int [] arr = {1,5,3,4,7,9,8,6,2,0};
    public static void main(String[] args) {
        
        sort(arr);

        for (int i : arr){
            System.out.println(i);
        }
    }

    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];// LALAGYAN NG IPAPALIT SA LOWEST
            int j = i-1;//THE LOWEST VALUE 

            while (j >= 0 && arr[j] > temp){
                arr[j + 1]= arr[j];
                j--; 
            }
            arr[j + 1] = temp;
        }
    }
}
