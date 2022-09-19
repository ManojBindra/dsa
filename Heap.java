import java.util.ArrayList;
public class Heap {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(9);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(5);

        int size = arr.size();
        Heap heap = new Heap();

        for(int i= size/2 - 1 ; i >= 0; i-- ){
            heap.heapify(arr, i);
        }
        System.out.println(arr);
      
    }

    void heapify(ArrayList<Integer> arr, int i){
        int largestValueIndex = i;
        int leftChildIndex = 2*i + 1;
        int rightChildIndex = 2*i + 2;
        int size = arr.size();

        if(leftChildIndex < size && arr.get(leftChildIndex) >  arr.get(largestValueIndex))
            largestValueIndex = leftChildIndex;
        if(rightChildIndex < size && arr.get(rightChildIndex) > arr.get(largestValueIndex))
            largestValueIndex = rightChildIndex;

        if(largestValueIndex != i){
            int temp = arr.get(i);
            arr.set(i, arr.get(largestValueIndex));
            arr.set(largestValueIndex, temp);
            heapify(arr, largestValueIndex);
        }

    }
}
