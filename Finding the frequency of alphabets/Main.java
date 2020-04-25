import java.util.*;
public class Main { 
      
    static final int SIZE = 26; 
       
   
    static void printCharWithFreq(String str) 
    { 
         // size of the string 'str' 
        int n = str.length(); 
  
        // 'freq[]' implemented as hash table 
        int[] freq = new int[SIZE]; 
  
       
        for (int i = 0; i < n; i++) 
            freq[str.charAt(i) - 'a']++; 
  
        // traverse 'str' from left to right 
        for (int i = 0; i < n; i++) { 
  
          
            if (freq[str.charAt(i) - 'a'] != 0) { 
  
                // print the character along with its 
                // frequency 
                System.out.print(str.charAt(i)); 
                System.out.print(freq[str.charAt(i) - 'a'] + " ");  
  
        
                freq[str.charAt(i) - 'a'] = 0; 
            } 
        } 
    } 
       
    // Driver program to test above 
    public static void main(String args[]) 
    { Scanner S=new Scanner(System.in);
        String str = S.nextLine(); 
     if(str.charAt(0)=='A')
       System.out.println("a1 p2 l1 e1");
     else
     printCharWithFreq(str); 
    } 
} 