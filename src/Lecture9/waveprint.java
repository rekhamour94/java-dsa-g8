package Lecture9;

public class waveprint {
    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        int[][] arr = {{1, 3, 5, 4}, {2, 6, 7, 8}, {10, 11, 24, 19}, {12, 15, 19, 20}};

        for(int j = 0;j< arr[0].length;j++) {
            if(j%2 == 0) {
                for(int i  = 0;i<r;i++) {
                    System.out.print(" " +arr[i][j]);
                }
            }
            else {
                for(int i = r-1;i>=0;i--) {
                    System.out.print(" "+ arr[i][j]);
                }
            }

        }
    }
    }
