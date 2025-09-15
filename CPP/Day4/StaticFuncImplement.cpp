#include <iostream>
#include <string.h>
using namespace std;

class Account 
{
public:
    int acc;
    char name[10];
    static float rateOfIntrest;

    Account(int a, const char* name1) 
    { 
        acc = a;
        strcpy(name, name1);
    }

    void display() 
    {
        cout << acc << " " << name << " " << rateOfIntrest << endl;
    }
};

float Account::rateOfIntrest = 9.2;

int main() 
{
    Account a1 = Account(101, "Sanjay");
    Account a2 = Account(102, "Nakul");
    Account a3 = Account(103, "Abhi");
    
    a1.display();
    a2.display();
    a3.display();

    return 0;
}