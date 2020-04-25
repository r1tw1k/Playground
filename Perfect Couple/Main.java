import java.util.*;
public class Main {
static void  pairs_value(int inputArray[], int inputNumber)
  {
 
  for (int i =  0; i < inputArray.length; i++)
  {
  for (int j  = i+1; j < inputArray.length; j++)
  {
  if(inputArray[i]+inputArray[j] == inputNumber)
  {
  System.out.println(inputArray[i]+", "+inputArray[j]);
  }
  }
  }
  }
  
  public static void  main(String[] args)
  {
  Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    {arr[i]=S.nextInt();}
    int sum=S.nextInt();
    pairs_value(arr, sum);
  
  }
}

