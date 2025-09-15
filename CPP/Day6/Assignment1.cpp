#include<iostream>
using namespace std;
class A
{
	int c;
public:
	int a;
protected:
	int b;
public:
	void display()
	{
		cout<<"in display of A\n";
	}
};
class B:private A
{
public:
	int c;
public:
	void show()
	{
	    display();//allowed
		cout<<a<<b;
	}
};
class C:private B
{
	public:
	void show()
	{
	   // display(); not allowed
		//cout<< a<<b; not allowed
		cout<<c;
	}
};
int main()
{
	B bobj;
	bobj.show();
	bobj.display(); 
}