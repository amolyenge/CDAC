// C++ program to demonstrate the execution of constructor and destructor
 
#include <iostream>
using namespace std;
 class Test {
public:
    Test() { cout << "\n Constructor executed"; }

    ~Test() { cout << "\nDestructor executed"; }
};

main()
{
    Test t;
}