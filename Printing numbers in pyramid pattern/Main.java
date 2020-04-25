import java.util.*;
public class Main
{  
    public static void pyramidPattern(int n) 
    {  int num=1,i=0;
        for (i=0; i<n; i++) //outer loop for number of rows(n) 
        { for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print(num+" "); //print star
              num++;
            } 
  
            System.out.println(); //ending line after each row
        } 
    
    }
    public static void main(String args[]) //driver function
    { Scanner S=new Scanner(System.in);
        int n = S.nextInt(); 
        pyramidPattern(n); 
    } 
}