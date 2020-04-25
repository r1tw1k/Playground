import java.util.*;
class Main
{	static int fact(int n)
{
if(n==0)
  return 1;
  else
    return (n*fact(n-1));
}
  public static void main(String args[])
  {
    // your code here
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int f=fact(n);
    System.out.println(f);
  }
}