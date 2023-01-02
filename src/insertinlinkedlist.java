import java.lang.*;

// Node Class
class Node {
    int data;
    Node next;

    Node(int x) // parameterized constructor
    {
        data = x;
        next = null;
    }
}

class main
{
    static Node insertStart(Node head, int data)
    {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);

        // assigning this newNode's next as current head node
        newNode.next = head;
        // re-assigning head to this newNode
        head = newNode;

        return head;
    }

    static Node insertLast(Node head, int data) {

        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);

        // if Linked List was empty, entering first node
        if(head==null) {
            head = newNode;
            return head;
        }

        // required to traverse the Linked List
        Node temp = head;

        // traverse till the last node in Linked List
        while(temp.next!=null)
            temp = temp.next;

        // assigning the current last node's next to this newNode
        // thus newNode becomes the last node in Linked List
        temp.next = newNode;
        return head;
    }

    static Node insertPosition(int pos, int data, Node head) {
        int size = calcSize(head);

        // Can only insert after 1st position
        // Can't insert if position to insert is greater than size of Linked List
        if(pos < 1 || size < pos)
        {
            System.out.println("Can't insert," + pos + " is not a valid position\n");
        }
        else
        {
            Node newNode = new Node(data);
            // required to traverse Node 
            Node temp = head;

            // traverse to the nth node 
            while (--pos > 0)
                temp = temp.next;

            // assigning this newNode's next to nth node's next
            newNode.next= temp.next;

            // assigning the nth node's next to this newNode
            temp.next = newNode;
            // newNode added after nth node
        }
        return head;
    }

    static void display(Node node) {

        //as linked list will end when Node is Null
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // required for insertPosition() method
    static int calcSize(Node node){
        int size=0;

        // traverse to the last node each time incrementing the size
        while(node!=null)
        {
            node = node.next;
            size++;
        }
        return size;
    }

    public static void main(String args[])
    {
        Node head = null;
        head = insertStart(head,3);
        head = insertStart(head,2);
        head = insertStart(head,1);

        display(head);

        head = insertLast(head,5);
        head = insertLast(head,6);
        head = insertLast(head,7);
        head = insertLast(head,8);

        display(head);

        //Inserts after 3rd position
        head = insertPosition(3,25,head);
        display(head);

    }
}