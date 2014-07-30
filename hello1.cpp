#include<iostream>
using namespace std;
int main()
{
	int T;
	cin>>T;
	for(int i=0;i<T;i++)
	{
		int N;
		cin>>N;
		int arr[N];
		for(int j=0;j<N;j++)
		{
			cin>>arr[j];
		}
		int array1[N/2],array2[N/2],k=0,l=0;
		for(int j=0;j<N;j++)
		{
			if(j%2==0)
			{
				//even index but odd member of an array
				array1[k]=arr[j];
				k++;
			}
			else
			{
				//odd index but even member of an array
				array2[l]=arr[j];
				l++;
			}
		}
		int sum1=array1[0],sum2=array2[0];
		for(int j=1;j<N/2;j++)
		{
			sum1=sum1*array1[j];
			if((j+1)<N/2)
			sum1=sum1+array1[++j];
		}
			for(int j=1;j<N/2;j++)
		{
			sum2=sum2*array2[j];
			if((j+1)<N/2)
			sum2=sum2+array2[++j];
		}
		sum1=sum1%2;
		sum2=sum2%2;
		if(sum1>sum2)
		{
		cout<<"ODD";
		}
		else if(sum1<sum2)
		{
			cout<<"EVEN";
		}
		else
		{
		cout<<"NEUTRAL";
	}
		
	}
	return 0;
}
