#include<iostream>
using namespace std;
enum Day{sunday=0,monday,tuesday,wednesday,thursday,friday,saturday
};
int main() 
{ 
    Day today=sunday;
  
    switch (today) { 
    case sunday: 
        cout << "it is sunday"; 
        break; 
    case monday: 
        cout << "it is monday"; 
        break; 
}
}
