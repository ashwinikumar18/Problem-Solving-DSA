import java.util.*;
public class Srtingreverse {
    public static void printRev(String str, int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text:");
        String str;
         str= sc.nextLine();
        printRev(str, str.length()-1); 

    }
}
