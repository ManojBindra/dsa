class Node{
    private int value;
    private int frequency = 1;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    int getFrequency(){
        return this.frequency;
    }

    void setFrequency(int freq){
        this.frequency = freq;
    }

    @Override
    public String toString(){
        return "value = " + value + " frequency = " + frequency;
    }

}

public class MajorityElementBST {
    Node head;

    public void insert(int value){
        head = insertRecursive(value, this.head);
    }

    public void traverse(){
        inOrderTraversal(head);
    }
    private void inOrderTraversal(Node current){
        if(current == null)
            return;
        inOrderTraversal(current.left);
        System.out.println(current.getValue() + " " + current.getFrequency());
        inOrderTraversal(current.right);
    }

    private Node insertRecursive(int value, Node current){

        if(current == null)
            return new Node(value);
        
        if(value == current.getValue()){
            current.setFrequency(current.getFrequency() + 1);
        }else if(value < current.getValue()){
            current.left = insertRecursive(value, current.left);
        }else{
            current.right = insertRecursive(value, current.right);
        }

        return current;   
    }

}
