#include<iostream>
using namespace std;
 
// class A
// {
//     public:
//     A()
//     { cout << "A's constructor called" << endl; }
// };

 
// class B
// {
//     public:
//     B() 
//     { cout << "B's constructor called" << endl; }
// };
 
// class C: public B, public A  
// {
//     public:
//     C()
//     { cout << "C's constructor called" << endl; }
// };
 
// int main()
// {
//     C c;
//     return 0;
// }


#include<iostream>
using namespace std;
 
class A
{
	int a;
        public:
        A()  
        { cout << "A's default constructor called" << endl; }
        A(int p) 
    {
        cout << "A's para constructor called" << endl;
    }
};
 
class B
{
	int b;
        public:
        B()  { cout << "B's default constructor called" << endl; }
        B(int q)
    { 
  		cout << "B's para constructor called" << endl;
    }
};
 
class C: public B, public A
{
    public:
    C(int p,int q):A(p),B()
    { 
	cout << "C's para constructor called" << endl; 
	}
};
 
int main()
{
    C c(10,20);
    return 0;
}
