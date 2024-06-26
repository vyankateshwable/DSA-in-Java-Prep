package Recursion2;

public class StringReverse {

    public static String reverseString(String str){
        
    if (str.length()==1){
        return str;
    }

    char currChar = str.charAt(0);
    String nextString =  reverseString(str.substring(1));
    return nextString + currChar;
    }
    public static void main(String[] args) {
        String str = "abcd";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }
}
