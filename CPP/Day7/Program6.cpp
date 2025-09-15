#include <iostream>
#include <string>
using namespace std;

int main() {
    string str = "Hello, World!";
    str.erase(5, 7);
    cout << "After erase: " << str <<endl;
    return 0;
}
