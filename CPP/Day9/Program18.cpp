#include<iostream>
using namespace std;
#include<string.h>
class string1
{
	public:
	int len;
	char *ptr;
public:
	string1(char*);
	void stringdisplay();


};
void string1::stringdisplay()
{
	cout<<"length is "<<len<<endl;
	cout<<"string is "<<ptr<<endl;
}
string1::string1(char * sptr)
{
	len=strlen(sptr);
	ptr=new char[len+1];
	strcpy(ptr,sptr);
}


int main()
{	
	string1 c2("rahul");
	c2.stringdisplay();
	cout<<c2.ptr<<endl;
	{	
	string1 c3(c2);//copy constructor
    }
	c2.stringdisplay();
		cout<<c2.ptr<<endl;
}