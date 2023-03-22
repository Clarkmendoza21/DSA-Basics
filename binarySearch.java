public class binarySearch {
    public static int [] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    public static void main(String[] args) {
        getIndex(array,18);
        //System.out.println(array.length);
    }

    public static void getIndex (int[] arr,int num){
        int max = array.length-1;
        int min = 0;
        int tries = 0;
        
        while(max>=min){
            int mid = (int)Math.floor(min+(max-min)/2);
            if(num == array[mid]){tries++;System.out.println(mid+"tries: "+tries); break;}
            else if (num<array[mid]) {tries++;max = mid-1;}
            else {tries++;min = mid + 1;}
        }
    }
    /* ELIMINATE HALF OF THE ELEMENTS UNTIL THE REQUIRED ELEMENT IS FOUND
     * GUMAGANA LANG SA SORTED ARRAY
     * 
     */
}
