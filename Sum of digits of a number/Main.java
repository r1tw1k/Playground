import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner S=new Scanner(System.in);
      int x=S.nextInt();
      int sum=0;
      while(x>0)
      {
      sum+=x%10;
        x=x/10;
      }
      System.out.println(sum);
	}
}