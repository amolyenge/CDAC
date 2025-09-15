// C++ program for dynamic allocation
#include <iostream>
using namespace std;
 class Demo {
    int* ptr;
 public:
      Demo()
    {
        ptr = new int;
        *ptr = 10;
    }
    
    void display()
    {
        cout << *ptr << endl;
    }
};
 int main()
{
    Demo obj1;

     obj1.display();
}
