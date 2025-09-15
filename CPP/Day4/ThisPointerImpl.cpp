#include <iostream>  
using namespace std; 

class Address 
{
	int a,b;
	public:
		Address (int p,int q)
		{
			cout << "address stored in this: " << this <<endl;
			this->a = p;//compiler implicitly add this-> before attribute.
			this->b = q;
		}

		void display()
		{
			cout << a;
			cout << b;
		}
};

int main()
{
	Address b(10,20);
	cout << "address of 'd' obj is: " << &b << endl;
}