import java.util.Scanner;

/**
 * DownwardTriangleStartPattern
 */
public class DownwardTriangleStartPattern {

    public static void main(String[] args) {
       System.out.println("Provide the value of n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=n; i>=1 ;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}