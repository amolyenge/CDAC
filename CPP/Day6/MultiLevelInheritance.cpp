#include<iostream> 
using namespace std; 
  class A 
{ 
    public: 
        A() 
        { 
            cout << "Base class A constructor \n"; 
        } 
        ~A() 
        { 
            cout << "Base class A destructor \n"; 
        } 
}; 
  
// Derived class B 
class B: public A 
{ 
    public: 
        B() 
        { 
            cout << "Class B constructor \n"; 
        }
		~B() 
        { 
            cout << " class B DEstructor \n"; 
        }  
}; 
  
// Derived class C 
class C: public B 
{ 
    public: 
        C() 
        { 
            cout << "Class C constructor \n"; 
              
        } 
        ~C() 
        { 
            cout << "Class C DEstructor \n"; 
              
        } 
}; 
  
// Driver code 
int main() 
{ 
    C obj; 
    return 0; 
}