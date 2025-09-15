#include <iostream>  
using namespace std;  
class B;//forward declaraction
class A
{
	int a;
	public:
		void geta()
		{
			cout<<"enter value of a\n";
			cin>>a;
		}
		friend void big(A&, B&);
};
 class B
{
	int b;
	public:
		void getb()
		{
			cout<<"enter value of b\n";
			cin>>b;
		}
		friend void big(A&, B&);
};

void big(A& x,B& y)
{
	if(x.a>y.b)
	cout<<x.a<<"is greater";
	if(x.a<y.b)
	cout<<y.b<<"is greater";
	else
	cout<<"both are equal";
}
int main()
{
	A aobj;
	B bobj;
	aobj.geta();
	bobj.getb();
	big(aobj,bobj);	
}
