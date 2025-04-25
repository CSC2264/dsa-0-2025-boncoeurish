// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = generate(1, 100, 10000);
        mergeSort(numbers, 0, numbers.length - 1);
        display(numbers);
    }
   /*Generate 10000 random integers between 1 and 100
    */
 public static int[] generate(int low, int high, int size){
    Random rand = new Random();
    int[] result = new int[size];

    for (int i = 0; i < size; i++) {
        result[i] = rand.nextInt(high - low + 1) + low;
    }

    return result;
 }
  public static void mergesort(int[] a,int low, int high ){
    if (low < high) {
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }
  }

  // Merge function to combine two sorted subarrays
  public static void merge(int[] arr, int low, int mid, int high) {
    int[] temp = new int[high - low + 1];
    int i = low, j = mid + 1, k = 0;

    while (i <= mid && j <= high) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= high) {
        temp[k++] = arr[j++];
    }

    for (i = 0; i < temp.length; i++) {
        arr[low + i] = temp[i];
    }
}

public static void display(int[] arr) {
    for (int x : arr) {
        System.out.print(x + "\t");
    }
}
}