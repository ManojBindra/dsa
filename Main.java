public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 3, 2 };
        MajorityElementBST meBST = new MajorityElementBST();
        for (int i = 0; i < arr.length; i++) {
            meBST.insert(arr[i]);
        }
        meBST.traverse();
    }
}
