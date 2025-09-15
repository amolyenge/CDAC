// C++ program to demonstrate the number of times constructor 
// and destructors are called
 
#include <iostream>
using namespace std;
static int Count = 0;     
class Test {
public:
 
    Test()
    { 
        Count++;
        cout << "No. of Object created: " << Count<< endl;
    }
     ~Test()
    {
         
        cout << "No. of Object destroyed: " << Count << endl;                                  
                      Count--;                      
    }
};

int main()
{
    Test t, t1, t2, t3;
}