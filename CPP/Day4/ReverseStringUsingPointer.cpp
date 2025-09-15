#include <iostream>
#include <string.h>
using namespace std;

void ReverseString(char* str) 
{ 
    int len, i; 
    char *start_ptr, *end_ptr, ch; 

    // Get the length of the string 
    len = strlen(str); 

    // Set the begin_ptr
    // initially to start of string 
    start_ptr = str;

    // Setting end_ptr initially to
    // the end of the string
    end_ptr = str + len-1;

    // Swap the char from start and end 
    // index using begin_ptr and end_ptr 
    for (i=0; i<len/2; i++)
    {   
        // swap character 
        ch = *end_ptr; 
        *end_ptr = *start_ptr; 
        *start_ptr = ch; 

        // update pointers positions 
        start_ptr++; 
        end_ptr--; 
    } 
} 

int main() 
{
    char str[50]; 
    cout << "Enter the String :" << endl;
    cin >> str;

  	cout << "OriginalString : " << str << endl;

    // Reverse the string 
    ReverseString(str); 
    cout << "ReverseString : " << str << endl; 

    return 0; 
}