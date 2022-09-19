// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals{
    public static void main(String[] args) {
        int[][] arr = {{2,6},{15,18},{8,10},{1,3}};
        // ArrayList<Integer> al = new ArrayList<>();
     
        Arrays.sort(arr, new SortArray());
        printArr(arr);
    }

    static void printArr(int[][] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i][0] + "  " + arr[i][1]);
        }
    }

}

class SortArray implements Comparator<int[]>{

    @Override
    public int compare(int[] o1, int[] o2) {
        if(o1[0] == o2[0])
            return o1[1] - o2[1];
        return o1[0] - o2[0];
    }
    
}