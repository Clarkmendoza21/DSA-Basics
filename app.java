
public class app {
    
    public static void main(String[] args) {
        //MAIN METHOD WHERE THINGS EXECUTE
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(5);
        list.add(4354);
        list.add(65);
        list.addToStart(2);
        list.addToIndex(4, 76);
        list.print();
        list.setElement(4, 100);
        System.out.println(list.indexOf(4354));
        
    }

}
