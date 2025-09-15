#include <iostream>  
using namespace std;  
class A
{
	int a;
	public:
		int geta();
		friend void xyz(A&);
};
int A::geta()
{
	cout<<"enter the value of a\n";
	cin>>this->a;
}
void xyz(A& a1obj)
{
	cout<<"friend function is accessing private class data  "<<a1obj.a<<endl;
	
}
int main()
{
	A aobj;
	aobj.geta();//a=10
	xyz(aobj);
}