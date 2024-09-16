package DSA;
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Merge_Sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void Merge_Sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        Merge_Sort(arr, start, mid);
        Merge_Sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[start + k2] = mix[k2];
        }
    }
}
