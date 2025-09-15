#include<iostream>
using namespace std;

class Student{
    static int count;
    Student(){
        count++;
    }
    static void showCount(){
        cout<<"Number of STudents: "<<count<<endl;
    }
};

int Student::count = 0;
int main(){
  Student s1;
  Student::showCount();
}