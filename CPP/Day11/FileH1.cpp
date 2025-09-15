Example 1: Opening and Closing a File
#include <iostream>
#include <fstream>
using namespace std; 
int main() {

    // opening a text file for writing
    ifstream my_file("Example1.txt");
    // close the file
    my_file.close();
    return 0;
}