#include<iostream>
#include<fstream>
#include<vector>
#include<stdexcept>
using namespace std;

class Student{
    int rollNo;
    string name;
    int marks[3];

    public:
     Student(){
        rollNo = 0;
        name = "";
        marks[0] = marks[1] = marks[2] = 0;
    }

    Student(int r , string n , float m1 , float m2 , float m3){
        if(m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100)
          throw runtime_error("marks should be between 0 to 100 \n");

          rollNo = r;
          name = n;
          marks[0] = m1;
          marks[1] = m2;
          marks[2] = m3;
    }

    
    int getRollNo(){
        return rollNo;
    }

    string getName(){
        return name;
    }

    float getAverage(){
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    void display() const{
        cout<<"Roll No : "<<rollNo<<", name: "<<name<<",average: "<<getAverage()<<endl;

    }

    void updateMarks(float m1 , float m2 , float m3){
         if(m1 < 0 ||m1 > 100 ||m2 < 0 ||m2 > 100 || m3 < 0 || m3 > 100)
            throw invalid_argument("Invalid Input");

         marks[0] = m1;
         marks[1] = m2;
         marks[2] = m3;   
    }

    void writeToFile(ofstream &write){
        write<<rollNo<<" "<<name<<" "<<marks[0] <<" "<<marks[1]<<" "<<marks[2];
    }

    void readfromFile(ifstream &read){
        read>>rollNo>>name>>marks[0]>>marks[1]>>marks[2];
    }
};

