#include <iostream>
#include <string>
using namespace std;

int main() {
    string str1 = "Hello";
    string str2 = "World";

    cout << "Before swap:" <<endl;
    cout << "str1: " << str1 <<endl;
    cout << "str2: " << str2 <<endl;
    str1.swap(str2);

    cout << "\nAfter swap:" <<endl;
    cout << "str1: " << str1 <<endl;
    cout << "str2: " << str2 <<endl;

    return 0;
}
