package DSA;
import java.util.Arrays;
import java.util.Scanner;
public class Sortings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bittu nuvvu super ra");
        System.out.println("***************************Hello Everyoe Welcome To This*****************************************");
        System.out.println("Enter which algorthium do you want");
        System.out.println("1.linear Search--------{to search an element easy way}");
        System.out.println("2.Binary search------- {to search mid value in array}");
        System.out.println("3.Binary search 2d---- {to search mid value in 2d array}");
        System.out.println("4.Bubble Sort----------{to arrange correct position from the mid point}");
        System.out.println("5.Selection Sort-------{to arrange correct position < to other elements  }");
        System.out.println("6.Insertion Sort-------{to arrange correct position > to other elements  }");
        System.out.println("7.CyclicSort-------{to arrange correct position > to other elements  }");
          int choice = scanner.nextInt();
         switch (choice) {
            case 1:
                linear_search();
                break;
            case 2:
                binary_search();
            break;
            case 3:
                binary_search2d();
            break;
            case 4:
                BubbleSort();
            break;
            case 5:
               selection_sort();
            break;
            case 6:
               insertion_sort();
            break;
            case 7:
            Cyclic_sort();
            break;
            default :
            System.out.println("you did not enter a vaild option : ");
         }
    }
    static void linear_search(){
        System.out.println("******Thankyou coming for linear search*******");
        System.out.println("It is used for searching an element in simple way using == operator ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here size elements : ");
        int size = sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter here "+ size +" elements : ");
        for (int i = 0; i < arr.length; i++) {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter here Target  : ");
        int target = sc.nextInt();
        int x= element(arr, target);
        if (x!=-1) {
          System.out.println("found at "+(x++));
        }
        else{
          System.out.println("not found");
        }
    
      }
       static int  element(int[] arr ,int target){
       for (int i = 0; i < arr.length; i++) {
        if (arr[i]==target) {
            return i;
        }
        }
        return -1;
       }
       static void binary_search(){
        System.out.println("******Thankyou coming for binary search*******");
        System.out.println("It is used for searching an element form the mid value");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here array size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter here "+size+" elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter here a target : ");
        int target = sc.nextInt();
        int result = BinarySearch(arr,target);
        if (result != -1) {
            System.out.println("Found at :" + (result+1));
        }
        else {
            System.out.println("not found");
        }
    }
      static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
          while (start <= end) {
          int mid = start + (end - start)/2;
          if (arr[mid]==target) {
            return mid;
          }
          else if (arr[mid] < target) {
            start = mid+1;
          }
          else {
            end = mid-1;
          }
              }
              return -1;
      }
      static void binary_search2d(){
        System.out.println("******Thankyou coming for binary search 2d*******");
        System.out.println("It is used for searching an element form the mid value");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here row elements : ");
        int size = sc.nextInt();
        System.out.println("Enter here col elements : ");
        int size1 = sc.nextInt();
        int[][] matrix = new int[size][size1];
        System.out.println("Enter here "+size*size1+" elements : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("you entered these numbers : ");
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size1; j++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
        System.out.println("Enter here a target : ");
        int target = sc.nextInt();
        int[] result = binary2d(matrix, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] binary2d(int[][] matrix,int target){
          int row = 0;
          int col = matrix.length-1;
          while (row < matrix.length && col >=0) {
             if (matrix[row][col]==target) {
                return new int[]{row+1,col+1};
             }
             else if(matrix[row][col] < target){
                row++;
             }
             else{
                col--;
             }
          }
          return new int[]{-1,-1};
    }
     static void BubbleSort(){
        System.out.println("******************Welcome to bubble sort******************* ");
        System.out.println("It is used for swap elements sorting for correct position ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter here size of an elements : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter here " + size +" elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] x = bubble_sort(arr);
        System.out.println(Arrays.toString(x));
    }
    static int[] bubble_sort(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } 
            System.out.println();
        }
        return arr;
    }
    static void selection_sort(){
        System.out.println("******************Welcome to Selection sort******************* ");
        System.out.println("It is used for swap elements sorting for the first element to < other side ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter here size of an elements : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter here " + size +" elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] x = selection_sort_function(arr);
        System.out.println(Arrays.toString(x));
    }
    static int[] selection_sort_function(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j;
          }
          }
          int temp = arr[i];
          arr[i] = arr[min];
          arr[min] = temp;
          }
          return arr;
          }
    static void insertion_sort(){
      System.out.println("******************Welcome to insertion sort******************* ");
      System.out.println("It is used for swap elements sorting for the first element to < other side ");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter here size of an elements : ");
      int size = scanner.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter here " + size +" elements : ");
      for (int i = 0; i < arr.length; i++) {
          arr[i] = scanner.nextInt();
      }
      int[] x = insertion_sort_function(arr);
      System.out.println(Arrays.toString(x));
  }
     static int[] insertion_sort_function(int[] arr){
      for(int i=1;i<arr.length;i++)
      {
      int key=arr[i];
      int j= i-1;
      while(j >=0 && arr[j] > key){
      arr[j+1] = arr[i];
      j--;
      }
      arr[j+1] = key;
    }
    return arr;
  }
  static void Cyclic_sort(){
    System.out.println("******************Welcome to  Selection sort******************* ");
      System.out.println("It is used for swap elements sorting for the first element to < other side ");
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter here size of an elements : ");
      int size = scanner.nextInt();
      int[] arr = new int[size];
      System.out.println("Enter here " + size +" elements : ");
      for (int i = 0; i < arr.length; i++) {
          arr[i] = scanner.nextInt();
      }
      int[] x = cyclic_sort_function(arr);
      System.out.println(Arrays.toString(x));
  }
     static int[] cyclic_sort_function(int[] arr){
      int i = 0;
      while (i < 4) {
          int value =arr[i] - 1;
          if (arr[i] !=arr[value]) {
            int temp =arr[i];
            arr[i] =arr[value];
            arr[value] = temp;
          } else {
              i++;
          }
      }
      return arr;
  }
}
