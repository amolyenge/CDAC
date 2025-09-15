#include <iostream>
#include <string>
using namespace std;
int main() {
    string str = "Hello World";
    string to_insert = "Beautiful ";
    str.insert(6, to_insert);
    cout << str;
    return 0;
}