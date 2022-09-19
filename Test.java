
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.HashMap;
import java.util.HashSet;
// import java.util.List;
// import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String a = "/../";
        String[] s = a.split("/");
        int i=0;
        for (String string : s) {
            System.out.println(string + " " +i++);

        }
      


    }
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        long minDiff = 0;
       
        for(int i=0; i <= n-m; i++){
            long diff = a.get(i + m -1) - a.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
        
    }

    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
       for(int i=0; i<n-2; i++){
           int j = i+1;
           int k = n-1;
           while(j<k){
            int sum = A[i] + A[j] + A[k];
               if(sum == X)
                return true;
                else if (sum > X)
                    k--;
                else
                    j++;
           }
       }
       return false;
    
    }

    static int findLongestConseqSubseq(int arr[], int n) {
        Set<Integer> hashSet = new HashSet<>();
        int maxLength = 0;
        for(int i=0; i<n ;i++){
            hashSet.add(arr[i]);
        }

        for(int i=0 ; i< n; i++){
            if(!hashSet.contains(arr[i] - 1)){
                int currentLenght = 0;
                while(hashSet.contains(arr[i] + currentLenght)){
                    currentLenght++;
                }
                maxLength = Math.max(maxLength, currentLenght);
            }
        }
        return maxLength;

    }

    static long maxSubarraySum(int arr[], int n) {

        int sum = 0;
        long maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int[] sumArr = new int[n];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sumArr[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    currentSum = sumArr[j];
                } else {
                    currentSum = sumArr[j] - sumArr[i - 1];
                }
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;

    }

}
