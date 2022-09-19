class FrequencyObject{
    private int value;
    private int frequency;
    FrequencyObject(int value, int frequency){
        this.value = value;
        this.frequency = frequency;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

}

class Node{
    private FrequencyObject frequencyObject;
    Node left;
    Node right;
    Node (int value){
        this.frequencyObject = new FrequencyObject(value, 0);
    }
    int getValue(){
        return this.frequencyObject.getValue();
    }

    int getFrequency(){
        return this.frequencyObject.getFrequency();
    }

    void setFrequency(int n){
        this.frequencyObject.setFrequency(n);
    }
}

public class BinarySearchTree {
    private Node root;

    public void addValue(int num){
        root = addRecursive(root, num);
    }

    private Node addRecursive(Node current, int nums){
        if(current == null)
            return new Node(nums);
        if(nums <= current.getValue()){
            current.left = addRecursive(current.left, nums);
        }else{
            current.right = addRecursive(current.right, nums);
        }

        return current;
    }
}
