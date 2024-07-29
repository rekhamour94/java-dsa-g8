package Lecture9;

import java.util.Scanner;

public class Matrix_demo {
    public static void main(String[] args) {
        int r= 4;
        int c= 4;
        int[][] arr = new int[r][c];
        Scanner sc= new Scanner(System.in);
   for(int i  = 0;i<r;i++) {
       for(int j =0;j<c;j++) {
           arr[i][j] = sc.nextInt();
       }
   }
        for(int i  = 0;i<r;i++) {
            for(int j =0;j<c;j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
