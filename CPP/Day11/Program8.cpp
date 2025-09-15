#include <iostream>  
using namespace std;  
#include<string.h>
int main()  
{  
   char str1[50];
   char* ptr=str1;
   int space=0,vowel=0,cnt=0;
   cout<<"enter multi string\n";
	gets(str1);//iet cdac pune 
   puts(str1);
   while(*ptr!='\0')
   {
   		if(*ptr==32)
   		space++;
   		if(*ptr=='a'||*ptr=='e'||*ptr=='i'||*ptr=='o'||*ptr=='u')
   		vowel++;
   		cnt++;
   		ptr++;
   	
   }
 	cout<<"no of characters are"<<cnt<<endl;
 	cout<<"no of spaces"<<space<<endl;
 	cout<<"no of words"<<space+1;
   	cout<<"no of vowels"<<vowel;
}  