import java.util.Scanner;

public class Bits{
    public static void main(String[] args) {
       
    /*
    //    Get Bit (Bitmask & GivenNumber) 
        int n =5; // 0101
        int pos = 2;
        int bitmask = 1  << pos; //0001 << 2  =  0100

        int newNumber = n & bitmask; // 0101 & 0100 = 0100 So answer will be Bit was one else Zero
        if (newNumber == 0 ){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }
    */

    /*
    //    Set Bit (Bitmask | GiveNumber)
        int n =5; // 0101
        int pos = 1;
        int bitmask = 1  << pos; //0001 << 1  =  0010

        int newNumber = n | bitmask; // 0101 | 0010 = 0111 
        System.out.println(newNumber);
    */
    /* 
    // Clear Bit (~Bitmask & GivenNumber)
        int n = 5; // 0101
        int pos = 2;
        int bitmask = 1 << pos; // 0001 << 2 = 0100

        int newBitMask = ~ bitmask; //  1011 The bit which we want to clear we will set respective bit to zero in bitmask and perform & with it so that it will set to zero.
        int newNumber = newBitMask & n; // 1011 & 0101  = 0001
        System.out.println(newNumber);
    */
    
    // Update Bit 
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Which operation you want to perform 1 or 0: 0");
    int operation = sc.nextInt();
    // operation == 1 ==> Set ; operation == 0 ==> Clear
    
    int n = 5; // 0101
    int pos = 1;
    int bitmask = 1 << pos; //0001 << 1 = 0010
    if(operation == 1){
        // Set
        int newNumber = n | bitmask ;// 0101 | 0010 = 0111
        System.out.println(newNumber);

    }else{
        //Clear
        int newBitMask = ~bitmask; // ~0010 = 1101
        int newNumber = n & newBitMask; // 0101 & 1101 = 0101
        System.out.println(newNumber);
    }


    }
}