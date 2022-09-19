class AlternatePosNeg{
    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5 ,0 ,-5 ,-3, 2};
        rearrange(arr, 9);
        printArray(arr);
    }
    static void rearrange(int arr[], int n) {
        int[] res = new int[n];
        int positiveTracker = 0;
        int negativeTracker = 0;
        int resTracker = 0;
        
        while(resTracker<n){
            while(positiveTracker < n && arr[positiveTracker] < 0){
                positiveTracker++;
            }
            while(negativeTracker < n && arr[negativeTracker] >= 0){
                negativeTracker++;
            }
            if(positiveTracker < n && resTracker < n)
                res[resTracker++] = arr[positiveTracker++];
            if(negativeTracker < n && resTracker < n)
                res[resTracker++] = arr[negativeTracker++];
            
        }
        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }
        
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}