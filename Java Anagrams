import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int n1 = a.length();
        int n2 = b.length();
        if(n1!=n2)
        return false;
     a = a.toLowerCase();
     b = b.toLowerCase();
     
     int[] char_freq = new int[26];
     for(int i =0;i<n1;i++)
     {
         char curr_char = a.charAt(i);
         int index = curr_char -'a';
         char_freq[index]++; //it counts all the characters in String a
     }
     for(int i =0;i<n2; i++)
     {
         char curr_char = b.charAt(i);
         int index = curr_char -'a';
         char_freq[index]--; }//and this one decreases all the character's frequency from String b
         //So if char_freq is not 0 then it means that String a and b do not have the same alphabets
         for(int i=0; i<26; i++)
         {
             if(char_freq[i] != 0)
             return false;
            }
         return true;
     
     
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
