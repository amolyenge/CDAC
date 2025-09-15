#include <iostream>
using namespace std;

namespace first_space
{
    int a=10;
    void func()
    {
       cout << "Inside first_space" << endl;
    }
}

namespace second_space
{
    int a=100;
    void func()
    {
       cout << "Inside second_space" << endl;
    }
}

using namespace first_space;

int main ()
{
    func();
    cout << first_space::a;
    return 0;
}