
public class node {
    int data;
    node next;
    node(int d)
    {
        this.data = d;
        this.next = null;
    }}
class LinkedList
{
    node start;
    LinkedList()
    {
        start = null;
    }
    public void push(int data)
    {
        if(this.start == null)
        {
            node temp = new node(data);
            this.start = temp;
        }
        else
        {
            node temp = new node(data);
            temp.next = this.start;
            this.start = temp;
        }
    }
    public int findSecondLastNode(node ptr)
    {
        node temp = ptr;
        if(temp == null || temp.next == null)
            return -1;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.push(12);
        ll.push(29);
        ll.push(11);
        ll.push(23);
        ll.push(8);
        System.out.println(ll.findSecondLastNode(ll.start));}}
