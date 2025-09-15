#include <iostream>
#include <string>
using namespace std;

int main() {
    string str = "Hello, World!";
    string subStr = str.substr(7, 5);

    cout << "Original String: " << str <<endl;
    cout << "Substring: " << subStr <<endl;

    return 0;
}
