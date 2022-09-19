import java.util.*;
public class CountPair {
    public static void main(String[] args){
        int[] arr = {1,1,1,1};
        System.out.println(getPairsCount(arr, 4, 2));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int i=0; i<n; i++){
            int key = k - arr[i];
            if(map.containsKey(key)){
                if( key == arr[i]){
                    count += map.get(key) - 1;
                }else{
                    count+=map.get(key);
                }
            }
        }
        return count / 2;
    }
}
