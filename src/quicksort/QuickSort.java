package quicksort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,5,1,2,3,7,4,8,9};

        quickSort(arr, 0, arr.length);

        System.out.print("Sorted array: ");
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] inputArray, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = getPivotIndex(inputArray, start, end);
        quickSort(inputArray, start, pivotIndex);
        quickSort(inputArray, pivotIndex+1, end);
    }

    private static int getPivotIndex(int[] input, int start, int end) {
        // consider first element as the pivot element
        int pivot = input[start];
        // all elements left to the pivotElement should be less than pivotElement
        // all elements right to the pivotElement should be larger than pivotElement

        System.out.println("Pivot index= "+start+ ", Pivot element= "+pivot);
        System.out.println("Array before processing with pivot element: ");
        for(int i =0; i< input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();

        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;

        System.out.println("Array after processing with pivot element: ");
        for(int k =0; k< input.length; k++) {
            System.out.print(input[k] + " ");
        }
        System.out.println("");
        System.out.println("------");

        return j;
    }
}
