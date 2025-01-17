package Lecture4;

public class MirrorUshape {
    public static void main(String args[])
    {
        int n = 5;
        printPattern(n);
    }

    private static void printPattern(int n) {
        int row = 1;
        int space = n-1 ;
        int star = n;
        while (row <= n*2-1) {
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            if (row < n) {
                space--;
                star--;
            } else {
                space++;
                star++;

            }

            row++;
            System.out.println();


        }
    }
}
