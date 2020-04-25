import java.util.*;
public class  Main
{
    
 
    public static void main(String[] args)
    {
             
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter N : ");
	int n=sc.nextInt();	 
            //  System.out.print("Enter Symbol : ");
	
              char c = '*';
 int m=n/2;
 
 
              int k=2*m+1;
 
	for(int i=1;i<=k;i++)
               {
                    
	        for(int j=1;j<=k;j++)
                
                        {      if(j==i || j==k-i+1)
                               System.out.print(c);
                                
                       		if(j!=k/2+1)
                              System.out.print(" ");
                                 
		 
                    	
                           }
		 
    
	 System.out.println();
	    
               }            
           
 
                
    }
}