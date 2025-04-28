public class DoubleMid  {
    class Node22 {
        int data;
        Node22 next;
        Node22 prev;
    
        public Node22(int data) {
            this.data = data;
        }
        public Node22(int data, Node prev, Node next) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        
    }
    Node22 head;
    
    public void insertFirst(int data) {
        Node22 node = new Node22(data);
        node.next = head;
        node.prev = null;
        if(head != null)
        {
            head.prev = node;
        }
        head = node;
    }
    
    public void insertDll(int index, int data) {
        if(head == null || index<=0) {
            insertFirst(data);
            return;
        } 
        Node22 node = head;
        for(int i=0;i<index-1;i++)
        {
            node = node.next;
        }
        Node22 temp = new Node22(data);
        temp.next = node.next;
        if(temp.next != null) {
            node.next.prev = temp;
        }
        node.next = temp;
        temp.prev = node;

    }
    public void display()
    {
        Node22 temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
     //   System.out.print(temp.data);
    
    }
    
    public static void main(String[] args) {
        DoubleMid list = new DoubleMid();
        list.insertFirst(4);
        list.insertFirst(54);
        list.insertFirst(13);
        list.insertFirst(42);
        list.insertFirst(243);
        
        list.insertDll(2, 33);

        list.display();
    } 
    }
    
