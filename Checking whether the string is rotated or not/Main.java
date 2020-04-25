import java.util.*;
class Main
{ 
    
    static boolean areRotations(String str1, String str2) 
    { 
        
        return (str1.length() == str2.length()) && 
               ((str1 + str1).indexOf(str2) != -1); 
    } 
      
    // Driver method 
    public static void main (String[] args) 
    { Scanner S = new Scanner(System.in);
        String str1 = S.nextLine(); 
        String str2 = S.nextLine(); 
  
        if (areRotations(str1, str2)) 
            System.out.println("Yes"); 
        else
            System.out.printf("No"); 
    } 
} 