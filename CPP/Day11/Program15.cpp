#include<iostream>
using namespace std;
class complex
{
	int real,img;
public:
	complex();
	complex(int,int);
	void display();
	complex operator+(int);
	friend complex operator+(int,complex&);
};
complex::complex()
{}
complex::complex(int real,int img)
{
	this->real=real;
	this->img=img;
}
void complex::display()
{
	if(img>0)
	cout<<"complex number is "<<real<<"+"<<img<<"i"<<endl;
	else
	cout<<"complex number is "<<real<<img<<"i"<<endl;
}
complex complex::operator+(int num)
{
	complex temp;
	temp.real=real+num;
	temp.img=img+num;
	return temp;
}
complex operator+(int num,complex & c)
{
	complex temp;
	temp.real=c.real+num;
	temp.img=c.img+num;
	return temp;
}



int main()
{
	/*complex c1(1,2);
	complex c2=c1 + 5;//c2=c1.operator+(5)
	c2.display();*/
	complex c1(1,2);
	complex c2=5+c1;//  operator+(5,c1)     
	c2.display();
	


}