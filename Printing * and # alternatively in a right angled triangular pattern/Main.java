import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner S = new Scanner(System.in);
  		// Type your code here
      int k=1;
      int n=S.nextInt();
      for(int i=1;i<=n;i++)
      {
      for(int j=1;j<=i;j++)
      {
      if(k%2==0)
      {System.out.print("#");k++;}
       else{
         System.out.print("*");
        k++;}
      }System.out.print("\n");
      }
    }
}