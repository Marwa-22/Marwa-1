//Q15
public class equals {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }
    boolean areIdentical(equals listb)
    {
        Node a = this.head, b = listb.head;
        while (a != null && b != null)
        {
            if (a.data != b.data)
                return false;
            a = a.next;
            b = b.next;
        }
        return (a == null && b == null);
    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String args[])
    {
        equals llist1 = new equals();
        equals llist2 = new equals();
        llist1.push(1);
        llist1.push(2);
        llist1.push(3);
        llist2.push(1);
        llist2.push(2);
        llist2.push(3);
        if (llist1.areIdentical(llist2) == true)
            System.out.println("Identical ");
        else
            System.out.println("Not identical ");}}
