
package com.example;

import java.util.Arrays;
import java.util.List;

public class QuickSort {
    private int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /**
     * 快速排序
     * 
     * @param arr
     * @param low
     * @param high
     */
    private void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        List<String> parseToList = Arrays.asList(args);
        System.out.println(parseToList.size());
    }
}