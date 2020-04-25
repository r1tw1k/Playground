import java.util.*;
public class Main {
    
   public static void main(String[] args)
    {Scanner S=new Scanner(System.in);
        String str = S.nextLine();
String rep1=S.nextLine();
     String rep2=S.nextLine();
     
         // Replace all the 'dog' with 'cat'.
        String new_str = str.replaceAll(rep1,rep2);
       
         // Display the strings for comparison.
       // System.out.println("Original string: " + str);
        System.out.println(new_str);
    }
}
