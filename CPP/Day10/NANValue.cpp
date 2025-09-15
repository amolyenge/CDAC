//If we pass a negative value in the argument domain error occurs and the output will be the Square root of -a,
//which is -nan.
//int abs(int)	This function takes an integer number as an argument 
//and returns its absolute value. 
//It means the output will always be positive regardless of the sign of the input.

#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int val1, val2;

    val1 = abs(1.9);
    val2 = abs(-43);

    int val3 = abs(-2.5);

    cout << val1 << "\n";
    cout << val2 << "\n";
    cout << val3 << "\n";
    return 0;
}