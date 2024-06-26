package Recursion;

public class SumofFirstNNaturalNumbers {
   
    public static void sumofFirstNNumbers(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sumofFirstNNumbers(n-1, sum);
    }
    public static void main(String[] args) {
       
        sumofFirstNNumbers(5, 0);
    }
}
