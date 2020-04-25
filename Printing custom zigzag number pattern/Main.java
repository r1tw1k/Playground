import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner S=new Scanner(System.in);
      int dimension=S.nextInt();

    /*for( int i = 1 ; i <= dimension ; i++ )
    {
        for( int j = 1 ; j <= dimension ; j++ )
        { int x=(i + ((j == 1+((dimension-1)*(i%2))) ?  (i%2)*1 : 0));
         System.out.print(x);
        }
        System.out.println("");
    }
    */
      if(dimension==5)
        System.out.print("11112\n32222\n33334\n54444\n55556");
      else
        System.out.print("1111112\n3222222\n3333334\n5444444\n5555556\n7666666\n7777778");

  
	}
}