import java.util.Scanner;
class Main{
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){   
      int array[];
      Scanner S = new Scanner(System.in);
           int n = S.nextInt();   
    array = new int[n];   
    for (int c = 0; c < n; c++)  
      array[c] = S.nextInt();  
   
        int key1 = S.nextInt();    
      int key2 = S.nextInt();    
        System.out.println(linearSearch(array, key1)); 
      System.out.println(linearSearch(array, key2));  
    }    
}