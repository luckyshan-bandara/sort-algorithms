package searchalgorithms.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        // Note: Array must be sorted
        int[] arr = {10, 22, 23, 25, 30, 45, 50, 55, 60, 80};

        int searchFor = 80;
        int searchResultsIndex = binarySearch(arr, searchFor, 0, arr.length);

        System.out.println("Search result index = "+searchResultsIndex);
    }

    public static int binarySearch(int[] array, int value, int start, int end) {
        if (start >= end) {
            return -1;
        }
        System.out.println("start = "+start+", end = "+end);
        int mid = (start + end) / 2;
        if (array[mid] == value) {
            return mid;
        } else if (array[mid] < value) {
            return binarySearch(array, value, mid+1, end);
        } else {
            return binarySearch(array, value, start, mid);
        }
    }
}
