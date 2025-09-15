#include <iostream>
#include <string>
using namespace std;

int main() {
    string str = "Hello, World!";
    cout << "Before clear: " << str <<endl;

    str.clear();

    cout << "After clear: " <<str<<endl;
    cout << "String size after clear: "<<str.size()<<endl;

    return 0;
}
