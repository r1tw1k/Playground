import java.util.Arrays;
import java.util.*;
class Main
{
	// Function to move all zeros present in the array to the end
	public static void reorder(int[] A)
	{
		// k stores index of next available position
		int k = 0;

		// do for each element
		for (int i: A)
		{
			// if current element is non-zero, put the element at
			// next free position in the array
			if (i != 0) {
				A[k++] = i;
			}
		}

		// move all 0's to the end of the array (remaining indices)
		for (int i = k; i < A.length; i++) {
			A[i] = 0;
		}
	}

	// Move all zeros present in the array to the end
	public static void main(String[] args)
	{ Scanner S=new Scanner(System.in);
		int n = S.nextInt();
      	int A[]=new int[n];
		for(int i=0;i<n;i++)
        {
        A[i]=S.nextInt();
        }
		reorder(A);
     for(int i=0;i<n;i++)
     System.out.print(A[i]+" ");
		//System.out.println(Arrays.toString(A));
	}
}
