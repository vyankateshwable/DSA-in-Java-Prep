package Recursion;

public class print_Factorial_of_Number_N {

    public static int  printFact(int n){
        if(n ==0 || n ==1){
           
           return 1;
        }
        int fact = n *  printFact(n-1);
        return fact;
       
    }
    public static void main(String[] args) {
        int n = 5;
       int factorial =  printFact(n );
        System.out.println(factorial);
    }
} 
