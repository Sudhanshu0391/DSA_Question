import java.util.*;
public class program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of batches in BTech - CSE-1007");
		int n=s.nextInt();
		int arr[][] = new int[n][];
		int count = 0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number of slow learners in "+(i+1)+"th batch");
			int slowlearner = s.nextInt();
			if(slowlearner%4!=0)
			{
				int col = slowlearner/4;
				arr[i] = new int[++col];
				for(int j=0;j<col-1;j++)
				{
					arr[i][j] = 4;
				}
				arr[i][col-1] = slowlearner%4;
			}
			else
			{
				count++;
				int col = slowlearner/4;
				arr[i] = new int[col];
				for(int j=0;j<col;j++)
				{
					arr[i][j] = 4;
				}
			}
			
		}
		int k=1;
		for(int[] i : arr)
		{
			System.out.println("The number of tutors for "+k+"th batch is: "+i.length);
			System.out.println("Students under each tutors for "+k+"th batch is :");
			for(int j : i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			k++;
		}
		System.out.println("The number of batches in which all tutors have exactly 4 students is: "+count);
		
		
		

	}

}
/*
 * import java.util.Scanner;
import java.util.*;
public class program {
    
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of Array");
        int k=0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
            if(map.containsKey(arr[i]))
            {
                continue;
            }
            else
            {
                k++;
                map.put(arr[i],1);

            }
        }
        arr = new int[k];
        k=0;
        for(Integer i:map.keySet())
        {
            arr[k]=i;
            k++;
        }
        System.out.println("Array after removing duplicates");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("Length of new array is "+(k));        
    }
   
    
}
*/
