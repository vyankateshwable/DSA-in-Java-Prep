package Recursion;

public class PrintNumbersFrom1to5 {

    public static void printNumbers1to5(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumbers1to5(n+1);
    }
    public static void main(String[] args) {
        int n =1;
        printNumbers1to5(n);
    }
}
