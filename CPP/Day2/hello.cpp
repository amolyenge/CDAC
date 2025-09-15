#include<iostream>
using namespace std;

int main()
{
   //cout << "Hello World!!!!" << endl;

   int a [3][3];
   int i,j;

   cout << "Accept Element of an array" << endl;

   for(i=0;i<=2;i++)
   {
      for(j=0;j<=2;j++)
      {
         cin >> *(*(a+i)+j);
      }
   }

   for(i=0;i<=2;i++)
   {
      for(j=0;j<=2;j++)
      {
         cin >> *(*(a+i)+j);
      }
   }


   for(i=0;i<=2;i++)
   {
      for(j=0;j<=2;j++)
      {
         cout << *(a+i)+j;
      }
   }

}