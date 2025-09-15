#include <iostream>
#include <string.h>
using namespace std;

class A
{
    int a;
    public:
        static int count;
        A add(A&b1)
        {
            A sum;
            sum.a = a + b1.a;
            return sum;
        }

    void get()
    {
        cout << "Enter value of Num ";
        cin >> this->a;
    }

    void show()
    {
        cout << "Value is: " << a << endl;
    }
};


int A :: count = 0;

int main()
{
    A obj1,obj2,obj3;
    obj1.get();
    obj2.get();

    obj3 = obj1.add(obj2);
    obj3.show();
    return 0; 
}