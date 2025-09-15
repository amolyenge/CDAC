#include<iostream>
using namespace std;
class A
{
	int a;
public:
	A();
    void display();
 };
A::A()
{
	cout<<"in default of A\n";
	a=0;
}
void A::display()
{
	cout<<a<<endl;
}
class B:public A
{
	int b;
public:
	B(int,int);
	void display();
};
B::B(int p,int q)
{
	cout<<"in para of B\n";
	b=q;
}
void B::display()
{
	A::display();
	cout<<b<<endl;
}
int main()
{
	B bobj(10,20);
	bobj.display();
}