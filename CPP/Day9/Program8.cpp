// C++ program to demonstrate the execution of constructor
// and destructor when multiple objects are created
#include <iostream>
using namespace std;
class Test {
public:
     Test() { cout << "\n Constructor executed"; }
 
    ~Test() { cout << "\n Destructor executed"; }
};
 main()
{
    Test t, t1, t2, t3;
}