#include <iostream>
using namespace std;
 
int main()
{
   int i=100000;
   int* p;
  p=i;
    getchar();
    return 0;
}
//error



#include <iostream>
using namespace std;
 
int main()
{
   int i=100000;
   int* p;
  p=reinterpret_cast<int*>(i);
  cout<<p;
    getchar();
    return 0;
}