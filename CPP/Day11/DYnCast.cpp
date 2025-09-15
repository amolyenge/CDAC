 
#include <iostream>
using namespace std;
 
// Initialization of base class
class B {
    virtual void fun() {}
};
 
// Initialization of Derived class
class D : public B {
	public:
	void show()
	{
		cout<<"in show()";
	}
};
 
// Driver Code
int main()
{
    B* b = new D; // Base class pointer
    b->show()//error
      //c++ want new type of conversion i.e dynamic_cast
	
    D* d = dynamic_cast<D*>(b); // Derived class pointer
   d->show();
    getchar();
    return 0;
}