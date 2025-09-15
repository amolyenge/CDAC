#include<iostream>
using namespace std;
int main()
{
	int n,i;
	cout<<"how many elements for which memory should be allocated\n";
	cin>>n;
	int* ptr=new int[n];
	cout<<"accept elements\n";
	for(i=0;i<n;i++)
	cin>>ptr[i];
	cout<<"display elements\n";
	for(i=0;i<n;i++)
	cout<<ptr[i];
	delete[] ptr;
	
}