#include <iostream>
#include<iomanip>

using namespace std;
#define MAX 100
int main()
{
	int array[MAX];
	int n;
	cout<<"�������N��";
	cin>>n;
	for(int i=0;i<n;i++)
	{
		cin>>array[i];
	}
	//�ж����ֵ
	int sum=0;
	int max=array[0];
	for(int j=0;j<n;j++)
	{
		sum=sum+array[j];
		if(sum<array[j])//������ϵ�ǰԪ��֮��ĺͱȵ�ǰԪ�ػ�С��������֮ǰԪ��
		{
			sum=array[j];
		}
		if(sum>max)
		{
		max=sum;
		}
	}
	
	cout<<"���max:"<<max<<endl;
	
	return 0;
}
