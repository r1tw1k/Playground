import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner S=new Scanner(System.in);
      int x=S.nextInt();
      int y=0;
      while(x>0)
      {
      y=y*10+(x%10); 
      x=x/10;
      }
      y=y/10;
      System.out.println(y%10);
	}
}