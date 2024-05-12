package insertionsort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        arr = sort(arr);

        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] sort(int[] arr) {
        for (int firstUnsortedIndex=1; firstUnsortedIndex< arr.length; firstUnsortedIndex++) {
            // no need swapping
            // find the index and add new element to that index directly
            // initially index 0 is considered as the sorted array partition
            // we grow that sorted partition one by one

            int newElement = arr[firstUnsortedIndex];
            int index;

            for (index=firstUnsortedIndex; index>0 && arr[index-1] > newElement ; index--) {
                // shifting sorted partition elements until we find correct position to insert new element
                arr[index] = arr[index-1];
            }

            arr[index] = newElement; // insert new element
        }

        return arr;
    }
}
