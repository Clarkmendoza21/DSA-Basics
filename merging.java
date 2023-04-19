public class merging {
    public static void main(String[] args) {
        int[] arr ={1,24,65,8,76,9,0,6,4,2,5,10,91};

        mergeSort (arr);


        //PRINT THE WHOLE ARRAY TO CHECK IF SORTED
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
   public static void mergeSort(int [] array) {
        int length = array.length;
        
        if (length<=1) return;//BASE CASE

        int mid = length/2;// ARRAY MIDDLE

        //TEMPORARY ARRAYS
        int [] leftArray = new int [mid];
        int [] rightArray = new int[length-mid];

        int i = 0;// FOR LOOP POINTER AND INDEX POINTER FOR LEFT ARRAY
        int j = 0;// RIGHT ARRAY INDEX


        //THIS SECTION IS TO DIVIDE THE ARRAY TO SUB ARRAYS, THE LEFT AND RIGHT ARRAY
        //THIS CREATES THE LEFT AND RIGHT ARRAYS
        for (;i<length;i++){
            if (i < mid){
            leftArray [i] = array[i];
            }else {
                rightArray[j] = array[i];
                j++;
            }
        }
        // DIVIDE THE ARRAYS INTO SMALLER ONES?
        mergeSort(leftArray);
        mergeSort(rightArray);

        //BUILD IT AGAIN WHILE SORTING
        merge(leftArray, rightArray, array);
   } 
   public static void merge (int [] leftArray, int[]rightArray, int [] array){
        //DETERMINE THE SIZE OF LEFT AND RIGHT ARRAYS
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r=0;

        //MICRO SORTING SECTION
        //SORTS THE SUB ARRAYS FROM 2 ELEMENTS THEN COMBINE TO THE OTHER ARRAYS
        while (l< leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i]= leftArray[l];
                i++;
                l++;
            }else{
                array[i]= rightArray[r];
                i++;
                r++;
            }
        }
        //FINAL SORTING
        // SORT THE ELEMENTS AS A WHOLE ARRAY
        while (l<leftSize){
            array[i] = leftArray [l];
            i++;
            l++;
        }
        while (r<rightSize){
            array[i]= rightArray[r];
                i++;
                r++;
        }
   }
}
