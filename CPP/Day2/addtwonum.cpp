#include <iostream>
using namespace std;

int main()
{
    int a = 10;
    int b = 20;

    cout << "The Addition is:" << a + b << endl;

    string b1 = "1010", b2 = "0101";
    int x = stoi(b1, 0 ,2);
    int y = stoi(b2, 0 ,2);
    int sum = x+y;
    cout << "Sum of Binary Numbers = " << sum << endl;



    char c1 = 'A', c2 = 'B';
    cout << "Sum of Characters:" << (int)c1+(int)c2 << endl;
}