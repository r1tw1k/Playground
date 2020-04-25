import java.util.Scanner;
class Main {
  static int sum(int n)
  {while(n>0)
  return (n+sum(n-1));
   return 0;
  }
    public static void main(String[] args) 
    {
		Scanner S=new Scanner(System.in);
      int x=S.nextInt();
      int s=sum(x);
      System.out.println(s);// Type your code here
    }
}