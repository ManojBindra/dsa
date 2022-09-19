public class Kadnae {
    public static void main(String[] args) {
        int [] arr = {-1,-2,-3,-4};
        System.out.println(maxSubarraySum(arr, 4));
    }
    /**
     * contigous subbary sum by brute force method
     * O(n^2) solution
    */

    static long maxSubarraySum(int arr[], int n){
        
        long maxSum = Long.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            long sum = 0;
            for(int j=i; j<arr.length; j++){
                 sum = sumArrayBetweenIndex(arr,i,j);
                 if(sum > maxSum)
                    maxSum = sum;
            }
            
        }
        return maxSum;
        
    }
    
    static long sumArrayBetweenIndex(int[] arr, int s, int e){
        long sum = 0;
        for(int i=s; i<=e; i++){
            sum += arr[i];
        }
        return sum;
    }
}
