// Scope of an Object
// Note: Objects are destroyed in the reverse order of their creation. 
#include<iostream>
using namespace std;

class Test
{
	public:
	Test()
	{
		cout<<"constructor is invoked";
	}
	~Test()
	{
		cout<<"destructor is invoked";
	}
};
Test t1;
int main()
{
	cout<<"main begins";
	Test t2;
	{
		cout<<"block begins"<<endl;
		Test t3;
		cout<<"block ends"<<endl;
	}
	cout<<"main ends"<<endl;
}