package linkedList;

public class app {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

        list.add(13);
        list.add(43);
        list.add(53);
        list.add(234);
        list.add(1231);
        list.add(4342);
        list.add(2, 75);
        list.remove(4);
        list.clear();
        
        System.out.println("finger index is: "+ list.indexOfBookmark());
        System.out.println("finger value is: "+ list.getBookmark());
       System.out.println( list.toString());
    }
}
