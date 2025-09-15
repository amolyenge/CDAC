#include <iostream>
using namespace std;
 
int main()
{
 	const int i=20;
 	 int* p;
 //	p=&i;
 	
 	p = const_cast<int*>(&i);
 	cout<<*p;
 
 //i++;//error
 *p=10;//allowed
 cout<<*p;
    getchar();
    return 0;
}