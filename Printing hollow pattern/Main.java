import java.io.*; 
  import java.util.*;
class Main { 
      
    // Function to print hollow rectangle 
    static void print_rectangle(int n, int m) 
    { 
        int i, j; 
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= m; j++) 
            { 
                if (i == 1 || i == n ||  
                    j == 1 || j == m)             
                    System.out.print("*");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
       
    } 
       
    // Driver program for above function 
    public static void main(String args[]) 
    { Scanner S=new Scanner(System.in);
        int rows = S.nextInt(); 
        print_rectangle(rows, rows); 
    } 
} 
  