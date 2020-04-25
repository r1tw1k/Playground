
    import java.util.Scanner;
    public class Main {
      private static Scanner sc;
      
      public static void main(String[] args) {
        int Number, i;
        sc = new Scanner(System.in);
       
        Number = sc.nextInt();
        
        for(i = 1; i <= Number; i++) {
          if(Number%i == 0) {
            System.out.println(i);
          }
        }
      }
    }