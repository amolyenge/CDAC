#include<iostream>
using namespace std;  
#include<string.h>
int main()  
{  
   char str1[20];
   char str2[20];
   cout<<"enter 1st string\n";
   cin>>str1;//iet
   strcpy(str2,str1);//str2=iet
   strrev(str1);// str1=tei
   if(strcmp(str1,str2)==0)
   cout<<"string is palindrom";
   else
   cout<<"not palindrom";
}  