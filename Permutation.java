import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<int[]> list = permutation(arr, 0, 2);
        for(int i=0; i<list.size(); i++){
            for(int j=0; j < list.get(i).length; j++){
                System.out.print(list.get(i)[j] + " ");
            }
            System.out.println(" ");
        }
    }

    public List<Integer> majorityElement(int[] nums) {
        int frequecy = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> value : map.entrySet()){
            if(value.getValue() >= frequecy)
                list.add(value.getKey());
        }

        return list;

    }

    static ArrayList<int[]> permutation(int[] arr, int s, int e){
       ArrayList<int[]> list = new ArrayList<>();
       backtracking(arr, s, e, list);
       return list;
    }

    static void backtracking(int[] arr, int s, int e, ArrayList<int[]> list){
        if(s == e){        
            list.add(arr.clone());
            return;
        }
        
        for (int i = s; i <= e ; i++) {
            arr = swap(arr, i, s);
            backtracking(arr, s + 1, e,list);
            arr = swap(arr, i, s);
        }
        
    }

    static int[] swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("");
    }
}
