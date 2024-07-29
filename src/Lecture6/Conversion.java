package Lecture6;

public class Conversion {

    public static void main(String[] args) {
       decimarytoBinary(5);
    }

    public static void decimarytoBinary(int n){
        int rem =0;
        int sum =0;
        int multiplier =1;
        while(n>0) {
            rem =  n%2;
            sum = sum+(rem*multiplier);
            n= n/2;
            multiplier = multiplier*10;
        }
        System.out.println(sum);
    }
}
//110111100