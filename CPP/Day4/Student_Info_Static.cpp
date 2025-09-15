#include <iostream>
#include <string.h>
using namespace std;



class Student
{
    int roll;
    char name[15];

    public:
        static char clg_name[20];
    
    Student()
    {
        roll = 101;
        strcpy(name, "Aman");
    }

    Student(int rollno, char*ptr)
    {
        roll = rollno;
        strcpy(name, ptr);
    }
};

void display()
{
    cout << "RollNo.:" << roll << endl;
    cout << "Name:" << name << endl;
    cout << "CollegeName:" << clg_name << endl;
};

char Student :: clg_name[20] = "XYZ College";

int main()
{
    char s[10] = "Rohit";
    Student s1;
    s1.display();
    Student s2(102, s);
    s2.display();
}













































































// #include <iostream>
// #include <cstring> // Use <cstring> for strcpy
// using namespace std;

// class Student
// {
//     int roll;
//     char name[15];

// public:
//     static char clg_name[20];
    
//     Student()
//     {
//         roll = 101;
//         strcpy(name, "Aman");
//     }

//     Student(int rollno, const char* ptr) // Use const char*
//     {
//         roll = rollno;
//         strncpy(name, ptr, sizeof(name) - 1); // Use strncpy for safety
//         name[sizeof(name) - 1] = '\0'; // Ensure null termination
//     }

//     // display is a member function, so it must be inside the class or linked using ::
//     void display()
//     {
//         cout << "RollNo.: " << roll << endl;
//         cout << "Name: " << name << endl;
//         cout << "CollegeName: " << clg_name << endl;
//     }
// };

// char Student::clg_name[20] = "XYZ College"; // Correct way to define a static member

// int main()
// {
//     char s[10] = "Rohit";
//     Student s1;
//     s1.display(); // Call the member function using the object

//     Student s2(102, s);
//     s2.display(); // Call the member function using the object
    
//     return 0;
// }