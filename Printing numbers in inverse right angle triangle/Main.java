import java.util.*;
public class Main
{
    public static void printNums(int n) 
    { 
        int i, j,num; 
    
        for(i=n; i>0; i--) // outer loop for rows
        { 
            num=i; 
            for(j=0; j<=i-1; j++) // inner loop for rows
            { 
                // printing num with a space  
                System.out.print(num); 
    
                //incrementing value of num 
                num--; 
            } 
    
            // ending line after each row 
            System.out.println(); 
        } 
    } 
       public static void main(String args[]) 
    { Scanner S=new Scanner(System.in);
        int n = S.nextInt(); 
        printNums(n); 
    } 
}