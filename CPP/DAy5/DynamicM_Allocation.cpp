#include <iostream>
using namespace std;
int main() {
  // declare an int pointer
  int* pointInt;
  // declare a float pointer
  float* pointFloat;
  // dynamically allocate memory
  pointInt = new int;
  pointFloat = new float;
  // assigning value to the memory
  *pointInt = 45;
  *pointFloat = 45.45f;
  cout << *pointInt << endl;
  cout << *pointFloat << endl;
int *p = new int(45);  
cout<<*p;
  // deallocate the memory
  delete pointInt;
  delete pointFloat;
delete p;
}