#include <iostream>
using namespace std;
#include<string.h>
 class String {
public:
    char* s;
    int size;
 public:
    String(char*); // constructor
    ~String(); // destructor
};

 String::String(char* c)
{
    size = strlen(c);
    s = new char[size + 1];
    strcpy(s, c);
}

String::~String() { 
    cout<<"dest called";
    delete[] s;
    cout<<s;
    }
 
int main()
{
    String str("Hello, World!");
}