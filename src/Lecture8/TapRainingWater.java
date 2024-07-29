package Lecture8;

public class TapRainingWater {
    public static void main(String[] args) {
        maxTapWater();
    }

    private static void maxTapWater() {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int[] leftMax= new int[arr.length];
        int[] rightMax= new int[arr.length];
        int totalWater= 0;
        //
        for(int i = 1;i<arr.length;i++) {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        // Fill right array
        for (int i =  arr.length- 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        for(int i = 0;i<arr.length;i++) {
            int var = Math.min(leftMax[i],rightMax[i]);
            if(var>arr[i]){
               totalWater+=var- arr[i];
            }
        }

        System.out.println(totalWater);
    }
}
