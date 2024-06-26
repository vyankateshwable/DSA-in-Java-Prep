package Recursion;

/**
 * PrintNumbersFrom5to1
 */
public class PrintNumbersFrom5to1 {

    public static void PrintNumbers5to1(int n){
        if(n ==0){
            return;
        }

        System.out.println(n);
        PrintNumbers5to1(n-1);

    }
    public static void main(String[] args) {
        int n = 5;
        PrintNumbers5to1(n);
        
    }
}