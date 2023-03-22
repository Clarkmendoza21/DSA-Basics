public class linearSearch{
    static int [] array = {0,1,2,3,4,6,7,8,9,10,11,12,13,14,15,16,17,5,18,19,20};
    
    static int tries = 0;

    public static void getIndex (int[] arr, int num){
        for (int i = 0 ; i<arr.length ; i++){
            if (num == arr[i]) {
                tries++;
                System.out.print("The number is in "+ i+"th index. "+"tries: "+tries);
            }else{
                tries++;
                continue;
            }
        }
    }
    public static void main(String[] args) {
        getIndex(array,20);
       
    }
    /*  THE LOOP CHECKS ELEMENTS ONE BY ONE 
     * {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
     */
}