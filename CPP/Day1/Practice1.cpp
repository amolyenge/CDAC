#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

class Student
{
    int rollNo;
    string name;
    int day, month, year;
    float totalmarks;

    void input()
    {
        cout << "Enter roll No:\n";
        cin >> rollNo;
        cout << "Enter name: \n";
        cin >> name;
        cout << "Enter day , month , year: \n";
        cin >> day >> month >> year;
        cout << "Enter total marks: \n";
        cin >> totalMarks;
    }

    void display()
    {
        cout << "roll no: " << rollNo << ",name: " << name
             << ",DOB: " << day << "-" << month << "-" << year
             << ", Marks: " << totalmarks;
    }
};

bool compareByRoll(const Student &s1, const Student &s2)
{
    return s1.rollNo < s2.rollNo;
}

bool compareByDOB(const Student &s1, const Student &s2)
{
    if (s1.year != s2.year)
        return s1.year < s2.year;
    if (s1.month != s2.month)
        return s1.month < s2.month;
    return s1.day < s2.day;
}

bool compareByMarks(const Student &s1, const Student &s2)
{
    return s1.totalmarks > s2.totalmarks;
}

int main()
{
    Vector<Student> students(10);

    cout << "Enter details of 10 students \n";
    for (int i = 0; i < 10; i++)
    {
        students[i].input();
    }

    cout << "..........sorted by roll no..............\n";
    sort(students.begin(), students.end(), compareByRoll);
    for (auto &s : students)
        s.diaplay();

    cout < "..............sorted by marks...................\n";
    sort(students.begin(), students.end(), compareByMarks);
    for (auto &s : students)
        s.display();

    cout << "..............sort By DOB......................\n";
    sort(students.begin(), students.end(), compareByDOB);
    for (auto &s : students)
        s.display();
}