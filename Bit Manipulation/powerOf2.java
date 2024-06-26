import java.util.Scanner;

public class powerOf2{

    public static boolean isPowerOf2(int num){
        return num >0 && (num & (num-1)) == 0;
    }
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(isPowerOf2(num));
    }
}