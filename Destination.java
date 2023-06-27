import java.util.*;

public class Destination {
    public static void towerOfHanoi(int n, String sour, String helper, String destination){
        if(n == 1){
            System.out.println("Transfer disk"+ n + "from" + sour + "to" + destination);
            return;
        }
        towerOfHanoi(n-1, sour, destination, helper);
        System.out.println("Transfer disk" + n + " from "+ sour +" to "+ destination);
        towerOfHanoi(n-1, helper, sour, destination);
    }
    public static void main(String args[]){
        int n=2;
        towerOfHanoi(n, "S", "H", "D");
    }
}
