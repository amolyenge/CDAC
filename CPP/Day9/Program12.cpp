// We can call the destructors explicitly using the following statement:

#include <iostream>
using namespace std;
  class Test {
	public:
    Test()
    { 
   
       cout<<"constructor is called\n";
    }
     ~Test()
    {
    	
       cout<<"destructor is called"<<endl;; 
	   
    }
};
int main()
{
    Test t,t1;
   t.~Test();
   t1.~Test();
  }