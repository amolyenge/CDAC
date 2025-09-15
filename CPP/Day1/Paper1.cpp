#include <iostream>
#include <vector>
#include <fstream>
#include <stdexcept>
#include <iomanip>
#include <string>

using namespace std;

// ------------------------ Student Class ------------------------
class Student
{
private:
    int rollNo;
    string name;
    float marks[3];

public:
    Student()
    {
        rollNo = 0;
        name = "";
        marks[0] = marks[1] = marks[2] = 0;
    }

    Student(int r, string n, float m1, float m2, float m3)
    {
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100)
            throw invalid_argument("Invalid marks entered.");
        rollNo = r;
        name = n;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    int getRollNo() const {
         return rollNo; 
        }
    string getName() const { 
        return name; 
    }
    float getAverage() const {
         return (marks[0] + marks[1] + marks[2]) / 3.0f;
        }

    void display() const
    {
        cout << "Roll No: " << rollNo
             << ", Name: " << name
             << ", Marks: " << marks[0] << ", " << marks[1] << ", " << marks[2]
             << ", Average: " << fixed << setprecision(2) << getAverage() << endl;
    }

    void updateMarks(float m1, float m2, float m3)
    {
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100)
            throw invalid_argument("Invalid marks entered.");
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    // Operator Overloading: ++ (bonus marks)
    Student &operator++()
    {
        for (int i = 0; i < 3; ++i)
            if (marks[i] < 100)
                marks[i]++;
        return *this;
    }

    // Operator Overloading: > (compare average)
    bool operator>(const Student &other) const
    {
        return this->getAverage() > other.getAverage();
    }

    // For file I/O
    void writeToFile(ofstream &out) const
    {
        out << rollNo << " " << name << " "
            << marks[0] << " " << marks[1] << " " << marks[2] << endl;
    }

    void readFromFile(ifstream &in)
    {
        in >> rollNo >> name >> marks[0] >> marks[1] >> marks[2];
    }
};

// ------------------------ Gradebook Class ------------------------
class Gradebook
{
private:
    vector<Student> students;

public:
    Gradebook()
    {
        loadFromFile();
    }

    ~Gradebook()
    {
        saveToFile();
    }

    void addStudent(const Student &s)
    {
        for (const auto &stu : students)
        {
            if (stu.getRollNo() == s.getRollNo())
                throw runtime_error("Duplicate roll number.");
        }
        students.push_back(s);
    }

    void displayAll() const
    {
        if (students.empty())
            throw runtime_error("Gradebook is empty.");
        for (const auto &s : students)
            s.display();
    }

    Student *findStudent(int rollNo)
    {
        for (auto &s : students)
        {
            if (s.getRollNo() == rollNo)
                return &s;
        }
        return nullptr;
    }

    void searchByRoll(int rollNo)
    {
        Student *s = findStudent(rollNo);
        if (!s)
            throw runtime_error("Student not found.");
        s->display();
    }

    void updateMarks(int rollNo, float m1, float m2, float m3)
    {
        Student *s = findStudent(rollNo);
        if (!s)
            throw runtime_error("Student not found.");
        s->updateMarks(m1, m2, m3);
    }

    void bonusMarks(int rollNo)
    {
        Student *s = findStudent(rollNo);
        if (!s)
            throw runtime_error("Student not found.");
        ++(*s); // use overloaded ++
    }

    void compareStudents(int r1, int r2)
    {
        Student *s1 = findStudent(r1);
        Student *s2 = findStudent(r2);
        if (!s1 || !s2)
            throw runtime_error("One or both students not found.");

        cout << ((*s1 > *s2) ? s1->getName() : s2->getName())
             << " has higher average marks.\n";
    }

    void saveToFile()
    {
        ofstream out("gradebook.txt");
        for (const auto &s : students)
            s.writeToFile(out);
        out.close();
    }

    void loadFromFile()
    {
        ifstream in("gradebook.txt");
        if (!in.is_open())
            return;

        while (!in.eof())
        {
            Student s;
            s.readFromFile(in);
            if (in)
                students.push_back(s);
        }
        in.close();
    }
};

// ------------------------ Main Program ------------------------
int main()
{
    Gradebook gb;
    int choice;

    do
    {
        cout << "\n===== Gradebook Menu =====\n";
        cout << "1. Add Student\n";
        cout << "2. Display All Students\n";
        cout << "3. Search by Roll Number\n";
        cout << "4. Update Marks\n";
        cout << "5. Add Bonus Marks (++)\n";
        cout << "6. Compare Two Students\n";
        cout << "0. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        try
        {
            if (choice == 1)
            {
                int roll;
                string name;
                float m1, m2, m3;
                cout << "Enter Roll No, Name, Marks (3 subjects):e";
                cin >> roll >> name >> m1 >> m2 >> m3;
                Student s(roll, name, m1, m2, m3);
                gb.addStudent(s);
                cout << "Student added successfully.\n";
            }
            else if (choice == 2)
            {
                gb.displayAll();
            }
            else if (choice == 3)
            {
                int roll;
                cout << "Enter Roll Number: ";
                cin >> roll;
                gb.searchByRoll(roll);
            }
            else if (choice == 4)
            {
                int roll;
                float m1, m2, m3;
                cout << "Enter Roll No and new marks: ";
                cin >> roll >> m1 >> m2 >> m3;
                gb.updateMarks(roll, m1, m2, m3);
                cout << "Marks updated.\n";
            }
            else if (choice == 5)
            {
                int roll;
                cout << "Enter Roll No: ";
                cin >> roll;
                gb.bonusMarks(roll);
                cout << "Bonus marks added.\n";
            }
            else if (choice == 6)
            {
                int r1, r2;
                cout << "Enter two roll numbers: ";
                cin >> r1 >> r2;
                gb.compareStudents(r1, r2);
            }
            else if (choice == 0)
            {
                cout << "Exiting... Data saved.\n";
            }
            else
            {
                cout << "Invalid choice.\n";
            }
        }
        catch (exception &e)
        {
            cout << "Error: " << e.what() << endl;
        }

    } while (choice != 0);

    return 0;
}
