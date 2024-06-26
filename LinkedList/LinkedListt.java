public class LinkedListt {

    Node head;
    private int size;

    LinkedListt() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty list, No elements to remove.");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty list, No elements to remove.");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;

    }

    public void addInMiddle(int index, String data){
        if(index > size || index < 0){
            System.out.println("Invalid Index Value");
            return;
        }

        size ++;

        Node newNode = new Node(data);
        if(head == null || index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i =0; i<size ; i++){
            if(i == index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    public int getSize(){
        return size;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty, No elements to print.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedListt list = new LinkedListt();
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
        list.printList();
    }

}
