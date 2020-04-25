import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner S=new Scanner(System.in);
      int x=S.nextInt();
      int sum=0;
      sum=sum+x%10;
     int i=0;
      while(x>10)
      {
      i=x/10;
        x=x/10;
      }
      sum+=x;
      System.out.println(sum);
	}
}