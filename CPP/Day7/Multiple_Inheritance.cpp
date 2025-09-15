#include <iostream>
using namespace std;

class First {
public:
    void displayFirst() {
        cout << "This is First class." << endl;
    }
};

class Second {
public:
    void displaySecond() {
        cout << "This is Second class." << endl;
    }
};

class Derived : public First, public Second {
public:
    void displayDerived() {
        cout << "This is Derived class." << endl;
    }
};

int main() {
    Derived obj;
    obj.displayFirst();
    obj.displaySecond();
    obj.displayDerived();

    return 0;
}
