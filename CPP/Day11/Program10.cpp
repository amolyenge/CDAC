#include <iostream>  
using namespace std;  
#include<string.h>
int main()  
{  
  	int a=10;
  	int y=20;
 int * const ptr=&a;
   cout<<*ptr;
  *ptr=5;//allowed
  a=5;//allowed
 // ptr=&y;//error
}