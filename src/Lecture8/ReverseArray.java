package Lecture8;

public class ReverseArray {
    public static void main(String[] args) {
        reverseArray();
    }

    public static void reverseArray() {
        int[] arr =  {1,2,3,4,5,6,7};
        int k = 2;
        int n= arr.length;
        reverseItems(arr,0,n-1);
        reverseItems(arr,0,k-1);
        reverseItems(arr,k,n-1);

        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverseItems(int[] arr, int i, int j) {
        while (i<j) {
            int temp =  arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }
}
