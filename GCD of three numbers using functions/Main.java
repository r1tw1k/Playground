import java.util.Scanner;
public class Main{
     static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner S=new Scanner(System.in);
      int x=S.nextInt();
      int y=S.nextInt();
      int z=S.nextInt();
      int p=gcd(x,y);
      int q=gcd(p,z);
      System.out.println(q);
	}
}