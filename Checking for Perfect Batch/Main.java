import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     int n,flag=-1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
   int sum[]=new int[(n/3)];
    int k=0;
    int count=0;
    for(int i=0;i<n;i+=3)
    {
    for(int j=i;j<i+3;j++)
    {
    count+=a[j];
    }
      sum[k]=count;
      count=0;
      k++;
    }
    for(int p =0;p<(n/3)-1;p++)
    {
    if(sum[p]==sum[p+1])
      flag=1;
    }
       if(flag==1) System.out.println("Perfect Batch");
        else System.out.println("Not a Perfect Batch");
    
  }
}