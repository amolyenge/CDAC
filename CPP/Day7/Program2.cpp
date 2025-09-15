#include <iostream>
#include <string>
using namespace std;

int main() {
    string str1 = "";
    string str2 = "Hello, World!";

    if (str1.empty()) {
        cout << "str1 is empty." << endl;
    } else {
        cout << "str1 is not empty." <<endl;
    }

    if (str2.empty()) {
        cout << "str2 is empty." <<endl;
    } else {
       cout << "str2 is not empty." <<endl;
    }

    return 0;
}
