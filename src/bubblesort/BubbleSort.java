package bubblesort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        arr = sort(arr);

        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] sort(int[] arr) {
        for (int lastUnsortedPartitionIndex=arr.length-1; lastUnsortedPartitionIndex>0; lastUnsortedPartitionIndex--) {
            for (int j = 0; j < lastUnsortedPartitionIndex; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
