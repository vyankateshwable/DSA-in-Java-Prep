public class StarPyramidPattern_2 {
    public static void main(String[] args) {
        int n = 5;

        // Pointed at Middle
        for (int i = 1; i <= n; i++) {
            // Print SPaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {  //Only change n to n-1
            // Print SPaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
 
/* 
        //Not Pointed at Middle 
    //      *  
    //     * * 
    //    * * * 
    //   * * * * 
    //  * * * * * 
    //  * * * * * 
    //   * * * * 
    //    * * * 
    //     * * 
    //      *
        for (int i = 1; i <= n; i++) {
            // Print SPaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // Print SPaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
*/
    }
}
