import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       int num1, num2, num3, result, temp;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        scanner.close();
        temp = num1>num2 ? num1:num2;
        result = num3>temp ? num3:temp;
        System.out.println(result);
	}
}