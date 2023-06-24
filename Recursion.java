import java.util.*;
public class Recursion {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value:");
        n=sc.nextInt();
        printNum(n); 

    }
}
    

