import java.util.*;
public class Reverse {
    public static void printNum(int n){
        if( n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String args[]){
        int n=0;
        printNum(n+1);
    }
}
