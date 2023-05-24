

public class LinkedList {
    Node head; //THE INDEX ZERO OF THE LINKED LIST
    int size;

    public void add (int data){
        /*
         * THIS METHOD ADDS VALUE TO THE LAST INDEX OF THE LINKED LIST
         * WHEN THIS METHOD IS USED, IT DOESN'T SPECIFY WHICH INDEX BUT ALWAYS GOES TO THE BACK OF THE LIST 
         */
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null){
            // IF THE LINKED LIST IS EMPTY, THIS EXECUTES
            head = node;
        }else {
            Node n = head;
            while (n.next != null){
                // THIS LOOP FINDS THE LAST NODE OF THE LIST
                n = n.next;
            }
            //THIS CHANGES THE "NULL" VALUE OF THE LAST INDEX OF THE LIST TO THE ENTERED VALUE
            n.next = node;
        }
        size++;
    }

    public void addToStart (int data){
        //THIS METHOD ADDS THE ENTERED VALUE TO THE START AND BECOMES THE HEAD OF THE LINKED LIST
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        size++;
    }

    public void addToIndex(int index, int data) {
        /*
         * HERE, YOU CAN SPECIFY ON WHICH INDEX DO YOU WANT TO PUT THE VALUE
         * BUT THERE IS AN EXCEPTION, YOU CANNOT PUT VALUE BEYOND THE SIZE OF THE LIST
         */
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) addToStart(data);// THIS EXECUTES IF THE INDEX ENTERED IS ZERO, IT ITS THE SAME AS THE addToStart() FUNCTION


        Node n = head;
        for (int i =0; i< index-1;i++){
            // THIS IS WHERE THE TRAVERSAL OF THE LIST HAPPENS TO FIND THE SPECIFIC INDEX
            n = n.next;
        
        }
        node.next = n.next;
        n.next = node;
    }

    public void delete (int index){
        /* 
         * THIS METHOD IS USED TO DELETE VALUES OF SPECIFIC INDEXES 
         * HAS THE INDEX NUMBER AS ITS PARAMETER
         */
         if (index == 0){
            head = head.next;// IF THE INDEX ENTERED IS EQUAL TO THE HEAD
         }else{
            Node n = head;
            Node n1 = null;
        for (int i =0; i< index-1;i++){
         // THIS IS WHERE THE TRAVERSAL OF THE LIST HAPPENS TO FIND THE SPECIFIC INDEX
            n = n.next;
        }
        //THIS IS WHERE THE DELETION HAPPENS
        // N1 IS THE VALUE OF THAT SPECIFIC INDEX TO FIND 
            n1 = n.next;
            n.next = n1.next;
        // TO MAKE SURE THAT THE VALUE IS DELETED IT IS SET TO NULL
            n1 = null;
         }
         size--;
    }

    public void getElement(int index){
        Node n = head;
        if(index == 0) {
            System.out.println(n.data);
       }else{
            for (int i =0; i< index-1;i++){
                // THIS IS WHERE THE TRAVERSAL OF THE LIST HAPPENS TO FIND THE SPECIFIC INDEX
                n = n.next;
            }
            System.out.println(n.next.data);
       }
    }

    public void setElement (int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        for (int i = 0; i<index-1;i++){

            n = n.next;
        }
        Node n1= n.next;
        n1.data = data;
    }

    public int indexOf (int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
       while (node.next != null){
            if(n.data == data){
                return indexOf(data);
            }
            n = n.next;
       }
        return 0;
    }

    public int size (){
        return size;
    }

    public void print (){
        // THIS IS THE PRINT STATEMENT OF THE PROGRAM WHERE IT RETURNS THE VALUES OF EACH NODE WHEN CALLED
        Node node = head;
        while (node.next != null ){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data+ "\n");
    }
}
