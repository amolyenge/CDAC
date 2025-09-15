// CASE 2:TO RECTIFY ML+DL SITUATION BY GIVING USERDEFINED ASSIGNMENT OPERATOR ()	
#include<iostream>
using namespace std;
#include<string.h>
class string1
{
	int len;
	char* ptr;
	public:
		void display();
		string1(char*);
		void operator=(string1&);
		
		~string1()
		{
			cout<<"destructor is called\n";
			if(ptr)
			{
			
			delete[] ptr;
			ptr=NULL;
		}
		}
};
void  string1::operator=(string1& s)
{
	cout<<"assignment operator function called\n";
	delete[] this->ptr;
	this->len=s.len;
	this->ptr=new char[this->len+1];
	strcpy(this->ptr,s.ptr);
	
}
	void string1::display()
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
	string1 s1("abc");
	{
	
	string1 s2("axyz");
	s2=s1;//s2.operator=(s1)
	}
	s1.display();
	

}