#include <iostream>
using namespace std;

class A
{
	int x;
        public:
            A()
            {
                cout << "default const of A\n";
            }
            A(int x)
            {
                cout << "para const of A\n";
                this->x=x;
            }
            void display()
            {
                cout << "value of x is " << x << endl;
            }
};

class B:virtual public  A
{
	int y;
        public:
            B()
            {
                cout << "default const of B\n";
            }
            B(int x,int y):A(x)
            {
                cout << "para const of B\n";
                this->y=y;
            }
            void display()
            {
                cout << "value of y is " << y<< endl;
            }
};

class C:virtual public  A
{
	int z;
        public:
            C()
            {
                cout << "default const of C\n";
            }
            C(int x,int z):A(x)
            {
                cout << "para const of C\n";
                this->z=z;
            }
            void display()
            {
                cout << "value of z is " << z << endl;
            }
};

class D:public B,public  C
{	
	public:
		D()
		{
			cout << "default const of D\n";
		}
		D(int x,int y,int z):B(x,y),C(x,z),A(x)
		{
			cout << "para const of D\n";
			
		}
};

int main()
{
    D obj(10,20,30);
    obj.B::display();
    obj.C::display();
    obj.A::display();
    
}
