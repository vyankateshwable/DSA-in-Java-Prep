import java.util.Scanner;

/**
 * SandglassStarPattern
 */
public class SandglassStarPattern {

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        int n = 6;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // for(int i=1; i<=n; i++){
        // for(int j=1;j<=n-i;j++){
        // System.out.print(" ");
        // }
        // for(int j =1; j<= n-i+1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }
}