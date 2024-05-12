package selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        arr = sort(arr);

        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] sort(int[] arr) {
        for(int lastUnsortedPartitionIndex = arr.length -1; lastUnsortedPartitionIndex > 0; lastUnsortedPartitionIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedPartitionIndex; i++) {
                if (arr[largestIndex] < arr[i]) {
                    largestIndex = i;
                }
            }
            //swap
            int temp = arr[largestIndex];
            arr[largestIndex] = arr[lastUnsortedPartitionIndex];
            arr[lastUnsortedPartitionIndex] = temp;
        }
        return arr;
    }
}
