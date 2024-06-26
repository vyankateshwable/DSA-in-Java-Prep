class LL {

    Node head;

    private int size;
    LL(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next!= null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("List is Empty, No elements to remove.");
            return;
        }

        head = this.head.next;
        size--;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("List is Empty, No elements to remove.");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secondLastNode = secondLastNode.next;
            lastNode =  lastNode.next;
        }
        secondLastNode.next = null;
        
    }
    public int getSize(){
        return size;
    }

    public void printList(){

        if(head == null){
            System.out.println("List is empty, No elements to print.");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());
    }
}