public class ThreeWayPart {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        threeWayPartition(arr, 1, 2);
    }
    public static void threeWayPartition(int arr[], int a, int b) {
        int n = arr.length;
        int s = -1;
        int e = n;
        for (int i = 0; i < e; i++) {
            if (arr[i] <= a) {
                s++;
                swap(arr, i, s);
            }
            if (arr[i] >= b) {
                e--;
                swap(arr, i, e);
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
