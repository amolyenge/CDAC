#include<iostream>
using namespace std;
void copy_String(char* s2 , char* s1)
{
    while(*s1 != '\n'){
        *s2 = *s1;
        s1++;
        s2++;
    }
    *s2 = '\n';
    cout<<*s2;
}

int main(){
    char str1[30];
    char str2[50];
    cout<<"Enter the String"<<endl;
    cin>>str1;
    copy_String(str1 , str2);
}