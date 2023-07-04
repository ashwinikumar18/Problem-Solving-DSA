import java.util.HashSet;
public class UniquesChar {
    
    public static void subsequence(String str, int idx, String newString, HashSet<String>set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to add the string if it
        subsequence(str, idx+1, newString+currChar, set);
       //not to add the string if not
        subsequence(str, idx+1, newString,set);
    }
    public static void main(String args[]){
    String str = "aaa";
    HashSet<String>set = new HashSet<>( );
    subsequence(str, 0, "",set);
    }
}
    
