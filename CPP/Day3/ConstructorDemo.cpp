#include<iostream>
#include<String.h>
using namespace std;

class Student{
    int rollno;
    char name[50];
    public:
    Student(){
        rollno = 101;
        strcpy(name , "rahul");
    }
    Student(int i , char*ptr){
        rollno = i;
        strcpy(name, ptr);
    }

    void display(){
        cout<<"roll no is\t" << rollno<< endl;
        cout<<"name is\t" << name<< endl;
    }
};
int main(){
    Student s1;
    s1.display();
    Student s2 (101,"rahul");
    s2.display();
}