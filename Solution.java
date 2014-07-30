import java.util.*;
import java.io.*;
class Solution
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int N;
			N=sc.nextInt();
			int[] arr=new int[N];
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=sc.nextInt();
			}
			int[] array1=new int[N/2];
			int[] array2=new int[N/2];
			int k=0,l=0;
			for(int j=0;j<N;j++)
			{
				if(j%2==0)
				{
					array1[k]=arr[j];
					k++;
				}
				else
				{
				array2[l]=arr[j];
				l++;
				}
			}
			int sum1=array1[0],sum2=array2[0];
			for(int j=0;j<array1.length;j++)
			{
			sum1=sum1*array1[j];
			if((j+1)<N/2)
			sum1=sum1+array1[++j];
			}
			for(int j=0;j<array1.length;j++)
			{
			sum2=sum2*array2[j];
			if((j+1)<N/2)
			sum2=sum2+array2[++j];
			}
			sum1=sum1%2;
			sum2=sum2%2;
			if(sum1>sum2)
			System.out.println("ODD");
			else if(sum1<sum2)
			System.out.println("EVEN");
			else
			System.out.println("NEUTRAL");
		}
	}
}