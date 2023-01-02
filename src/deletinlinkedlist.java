import java.lang.*;

class LinkedList {
    Node head;
    // not using parameterized constructor would by default
    // force head instance to become null
    // Node head = null;  // can also do this, but not required

    // Node Class
    class Node{
        int data;
        Node next;

        Node(int x) // parameterized constructor
        {
            data = x;
            next = null;
        }
    }
    public void deleteStart()
    {
        if (head == null){
            System.out.println("List is empty, not possible to delete");
            return;
        }

        System.out.println("Deleted: " + head.data);
        // move head to next node
        head = head.next;
    }

    public void deleteLast()
    {
        if (head == null){
            System.out.println("List is empty, not possible to delete");
            return;
        }

        // if LL has only one node
        if(head.next == null)
        {
            System.out.println("Deleted: " + head.data);
            head = head.next;
        }
        Node previous = null;
        Node temp = head;
        // else traverse to the last node
        while (temp.next != null)
        {
            // store previous link node as we need to change its next val
            previous = temp;
            temp = temp.next;
        }
        // Curr assign 2nd last node's next to Null
        System.out.println("Deleted: " + temp.data);
        previous.next = null;
        // 2nd last now becomes the last node

    }

    public void deletePosition(int n)
    {
        int size = calcSize(head);

        // Can only insert after 1st position
        // Can't insert if position to insert is greater than size of Linked List
        if(n < 1 || n > size)
        {
            System.out.println("Can't delete\n");

        }
        else
        {
            if(n == 1)
            {
                // head has to be deleted
                System.out.println("Deleted: " + head.data);
                deleteStart();
            }
            // required to traverse
            Node temp = head;
            Node previous = null;

            // traverse to the nth node
            while(--n > 0) {
                previous = temp;
                temp = temp.next;
            }
            // assigned next node of the previous node to nth node's next
            previous.next = temp.next;
            System.out.println("Deleted: " + temp.data);
        }
    }
    public Node insert(int data)
    {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);
        // assigning this newNode's next as current head node
        newNode.next = head;

        // re-assigning head to this newNode
        head = newNode;

        return head;
    }

    public void display()
    {
        Node node = head;
        //as linked list will end when Node reaches Null
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println("\n");
    }
    // required for insertPosition() method
    public int calcSize(Node node){
        int size = 0;
        // traverse to the last node each time incrementing the size
        while(node!=null){
            node = node.next;
            size++;
        }
        return size;
    }

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();

        ll.insert(6);
        ll.insert(5);
        ll.insert(4);
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);

        ll.display();

        ll.deleteStart();
        ll.display();

        ll.deleteLast();
        ll.display();

        // deletes 3rd node
        ll.deletePosition(2);
        ll.display();
    }
}