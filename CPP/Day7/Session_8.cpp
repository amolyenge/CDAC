#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

class Student{
    public:
    int roll;
    string name;
    string dob;
    int marks;

    void display() const{
        cout<< "Roll: "<<roll
        <<", Name: "<<name
        <<", DOB: "<<dob
        <<", Marks: "<<marks<<endl;
    }
};

bool sortRoll(const Student &a , const Student &b){
    return a.roll < b.roll;
}

bool sortDOB(const Student &a , const Student &b){
    return a.dob < b.dob;
}

bool sortMarks(const Student &a , const Student &b){
    return a.marks > b.marks;
}

int main(){
    vector<Student> students = {
        {102,"Amol","2002-12-22",400},
        {101,"Abhishek","2003-01-03",450},
        {103,"ABC","2008-04-12",500},
        {106,"PQR","2004-06-22",450},
        {107,"Parth","2007-08-23",350},
        {105,"XYZ","2005-12-17",400},
        {104,"Ayush","2001-09-02",500},
        {109,"Akash","1999-11-26",500},
        {108,"Amol","2000-04-08",300},
        {110,"Amol","2002-08-12",350},
    };

    sort(students.begin(), students.end(), sortRoll);
    cout<< "\nStudents sorted by Roll number: \n";
    for(const auto &s : students) s.display();

     sort(students.begin(), students.end(), sortMarks);
    cout<< "\nStudents sorted by Marks: \n";
    for(const auto &s : students) s.display();

     sort(students.begin(), students.end(), sortDOB);
    cout<< "\nStudents sorted by DOB: \n";
    for(const auto &s : students) s.display();

    return 0;
}