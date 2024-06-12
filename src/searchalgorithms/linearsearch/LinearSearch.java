package searchalgorithms.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 22, 23, 25, 30, 45, 50, 55, 60, 80};

        int searchFor = 80;
        int searchResultsIndex = linearSearch(arr, searchFor);

        System.out.println("Search result index = "+searchResultsIndex);
    }

    public static int linearSearch(int[] array, int value) {
        for (int i=0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
