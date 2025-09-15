#include <iostream>
using namespace std;
 #include<stdlib.h>
class A {
    int a;
 // Constructor of class A
    A()
    {
        cout << "Constructor was Called!"
             << endl;
    }
};
 

int main()
{
    // Create an object of class A using new operator
    A* a = new A();
    cout << "Object of class A was "
         << "created using new operator!"
         << endl;
 
    // Create an object of class A using malloc operator
    A* b = (A*)malloc(sizeof(A));
    cout << "Object of class A was "
         << "created using malloc()!"
         << endl;
 
    return 0;
}