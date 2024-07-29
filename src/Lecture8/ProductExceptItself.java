package Lecture8;

public class ProductExceptItself {
    public static void main(String[] args) {
        productExceptItself();
    }

    private static void productExceptItself() {
        int[] arr =  new int[]{6,2,3,4};
        int[] leftmultiply = new int[arr.length];
        int[] rightmultiply = new int[arr.length];
        int[] resProduct = new int[arr.length];
        leftmultiply[0]= 1;
        for(int i = 1;i<arr.length;i++)
        {
            leftmultiply[i] = arr[i-1]*leftmultiply[i-1];
        }
        rightmultiply[arr.length-1] = 1;
        for(int i = arr.length-2;i>=0;i--)
        {
            rightmultiply[i] = arr[i+1]*rightmultiply[i+1];

        }
        for(int i = 0;i<arr.length;i++)
        {
            resProduct[i] = rightmultiply[i]*leftmultiply[i];
        }
        System.out.println("product array");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println("product array element" + resProduct[i]);

        }
    }
}
