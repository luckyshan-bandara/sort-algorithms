package mergesort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6};

        mergeSort(arr, 0, arr.length);

        System.out.println("------------------------------------------------------");
        System.out.print("Sorted array: ");
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] inputArray, int start, int end) {
        System.out.println("start = "+start+ " : end = "+end);
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) /2;
        mergeSort(inputArray, start, mid);
        mergeSort(inputArray, mid, end);
        merge(inputArray, start, mid, end);
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        System.out.println("merge:---------------> "+"start = "+start + " | mid = "+mid + " | end = "+end);

        if (inputArray[mid-1] < inputArray[mid]) {
            return;
        }

        int[] tempArr = new int[end-start];
        int i = start;
        int j = mid;
        int currentIndex = 0;

        while(i < mid && j < end) {
            if (inputArray[i] > inputArray[j]) {
                tempArr[currentIndex] = inputArray[j];
                j++;
            } else {
                tempArr[currentIndex] = inputArray[i];
                i++;
            }
            currentIndex++;
        }

        while (i < mid) {
            tempArr[currentIndex] = inputArray[i];
            currentIndex++;
            i++;
        }

        while (j < end) {
            tempArr[currentIndex] = inputArray[j];
            currentIndex++;
            j++;
        }

        int index = 0;
        for (int k=start; k< end; k++) {
            inputArray[k] = tempArr[index];
            index++;
        }
    }
}
