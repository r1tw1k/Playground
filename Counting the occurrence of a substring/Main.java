import java.util.Scanner;
public class Main{
 
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        String str = S.nextLine();
        
        String strFind = S.nextLine();
        int count = 0, fromIndex = 0;
        
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
            count++;
            fromIndex++; 
        }
        
        System.out.println(count);
    }
}