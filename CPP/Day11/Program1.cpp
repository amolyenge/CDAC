#include <iostream>  
using namespace std;  
#include<stdlib.h>
int main()  
{  
   int *ptr;
   int n,i;
   cout<<"enter no of elements\n";
   cin>>n;
   ptr=(int*)malloc(n*sizeof(int));
   cout<<"accept elements\n";
   for(i=0;i<n;i++)
   cin>>ptr[i];
   	cout<<"display elements\n";
   for(i=0;i<n;i++)
   cout<<ptr[i]<<"\t";
   free(ptr);
}  