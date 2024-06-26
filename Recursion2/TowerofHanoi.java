package Recursion2;

public class TowerofHanoi {

    public static void towerofHanoi(int n , String src, String helper, String dest){

        if(n ==1){
            System.out.println("Transfer disk "+ n + " from "+ src + " to "+ helper);
            return;
        }
        towerofHanoi(n-1, src, dest ,helper );
        System.out.println("Transfer disk "+ n + " from " + src +" to "+ helper);

        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerofHanoi(n, "A", "B", "C");
    }
}
