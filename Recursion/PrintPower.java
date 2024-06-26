package Recursion;

public class PrintPower {

public static int printPow(int x, int n){
    if (n ==0){
        return 1;
    }
    if(x ==0){
        return 0;
    }

    int res = x * printPow(x, n-1);
    return res;
}

    public static void main(String[] args) {
        int n = 5;
        int x =2;
        int result = printPow(x, n);
        System.out.println(result);
    }
}
