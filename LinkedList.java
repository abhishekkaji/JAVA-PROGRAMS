public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }
    public static Node insertATNPostion(Node head, int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position is out of bounds");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.insertAtBeg(1);
//        ll.insertAtBeg(2);
//        ll.insertAtBeg(3);
//        ll.insertAtBeg(4);
//        ll.insertAtBeg(5);
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        ll.display();
        ll.insertATNPostion(head,6, 3);
        ll.display();
    }
}
