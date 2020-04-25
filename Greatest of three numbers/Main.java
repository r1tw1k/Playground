import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner S=new Scanner(System.in);
      int a=S.nextInt();
      int b=S.nextInt();
      int c=S.nextInt();
      
      int d=0;
      if((a>b)&&(a>c))
        d=a;
      else if((b>c)&&(b>a))
        d=a;
      else  d=c;
      System.out.println(d);
    }
}