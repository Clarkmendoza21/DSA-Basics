package linkedList;

public class app {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

        for(int i = 0; i<=2; i++){
            list.add(i);
            System.out.println("finger index is: "+ list.indexOfBookmark());
            System.out.println("finger value is: "+ list.getBookmark());
           System.out.println( list.toString());
        }
        for (int k = -1; k >= -2; k--){
            list.add(0,k);
            System.out.println("finger index is: "+ list.indexOfBookmark());
            System.out.println("finger value is: "+ list.getBookmark());
           System.out.println( list.toString());
        }
       
        
        
    }
}
