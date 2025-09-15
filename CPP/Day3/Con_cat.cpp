#include <iostream>
using namespace std;

void concatenate(char* str1, char* str2) {
    
    while (*str1 != '\0') {
        str1++;
    }

    while (*str2 != '\0') {
        *str1 = *str2;
        str1++;
        str2++;
    }

    *str1 = '\0';
}

int main() {
    char str1[100] = "Hello, ";
    char str2[] = "World!";

    cout << "Before concatenation: " << str1 << endl;

    concatenate(str1, str2);

    cout << "After concatenation: " << str1 << endl;

    return 0;
}
