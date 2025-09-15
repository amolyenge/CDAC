#include<iostream>
using namespace std;

class Date
{
	int dd,mm,yy;
	public:
        void show();
        Date(int,int,int);
        Date();
};

Date::Date()
{
	this->dd=this->mm=this->yy=0;
}

Date::Date(int dd, int mm, int yy)
{
	this->dd=dd;
	this->mm=mm;
	this->yy=yy;
}

void Date::show()
{
	cout << "Date is " << this->dd << "/" << this->mm << "/" << yy <<endl;
}

int main()
{
	Date d1(1,1,1);
	d1.show();

	Date d2(2,2,2);
	d2.show();
}


