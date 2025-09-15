#include<iostream>
using namespace std;
class Student
{
	int rollno;
	char name[20];
	int marks[5];
	public:
		void accept_display()
		{
			int i,sum=0;
			cout<<"enter rollno for "<<" student\n";
			cin>>rollno;
			cout<<"enter name for "<<" student\n";
			cin>>name;
			for(i=0;i<=4;i++)
			cin>>marks[i];
			for(i=0;i<=4;i++)
			sum=sum+ *(marks+i);
			float avg=sum/5;
			cout<<"rollno is \t"<<rollno<<"name is \t"<<name<<endl;
			cout<<"average is"<<avg;
			
		}
		
};
  
  int main()
  {
  	int n,i;
  	cout<<"enter no of students\n";
  	cin>>n;
  Student* ptr	=new Student[n];
  cout<<"accept details\n";
  for(i=0;i<n;i++)
   ptr[i].accept_display();
  
}