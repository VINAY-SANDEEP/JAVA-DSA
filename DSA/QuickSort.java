package DSA;
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
     System.out.println("******Thankyou coming for Quick Sort*******");
     System.out.println("It is used tp select the pivot elemnts to select the sort ");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size : ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter the"+size+"elements : ");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
      }
        Quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void Quick(int[] nums, int low, int high) {
        if (low >= high) {                 // {1,2,3,4,5}
            return;                         //{0,1,2,3,4}        
        }
        int start = low;                       // start= 0;      
        int end = high;                         //end = 4     
        int mid = start + (end - start) / 2;      //mid=2    
        int pivot = nums[mid];                    //pivot = nums[mid]= 3   

        while (start <= end) {                      // (0 <=4)       
            while (nums[start] < pivot) {           // (1 < 3)       (2<3)   
                start++;                            // start = 1     start=2 
            }
            while (nums[end] > pivot) {             // (5 > 3)    // (4 > 3)  
                end--;                               // end=3     end=2
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        Quick(nums, low, end);                  
        Quick(nums, start, high);
    }
}
