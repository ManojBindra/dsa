class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class ReverseLinkedList
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {   
        Node newHead = null;
        
        while(head != null){
            
            Node newNode = new Node(head.data);
            newNode.next = newHead;
            newHead = newNode;
            head = head.next;
        }
        return newHead;
    }
}