#include <iostream>
using namespace std;

int main()
{
    int n=10, t1=0, t2=1, nextValue;
    
    cout << "Fibonacci Series: ";
    cout << t1 << "," << t2 << ",";

    for(int i=0; i<=n; i++)
    {
        nextValue = t1 + t2;
        t1 = t2;

        t2 = nextValue;
        cout << nextValue << ",";
    }
    return 0;
}