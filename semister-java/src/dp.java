import java.util.*;
public class dp {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int m = s.nextInt();
				int n = s.nextInt();
				int arr[][]=new int[m][n];
				for(int i=0;i<n;i++)
				{
				    arr[0][i]=1;
				}
				for(int j=0;j<m;j++)
				{
				    arr[j][0]=1;
				}
				for(int i=1;i<m;i++)
				{
				    for(int j=1;j<n;j++)
				    {
				        arr[i][j]=arr[i][j-1]+arr[i-1][j];
				    }
				}
				System.out.println(arr[m-1][n-1]);

	}

}
