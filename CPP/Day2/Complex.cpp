#include <iostream>
using namespace std;

class Complex
{
    int real, img;
    public:
    Complex();
    Complex(int,int);
    void display() const;
    void setReal(int);
    int getReal() const;
};


void Complex::display() const
{
    cout<<"Complex Number is"<<real<< "+"<< img <<"i" << endl;;
}
void Complex::setReal(int r)
{
    real = r;
}
int Complex::getReal() const
{
    return real;
}

Complex::Complex()
{
    cout << "IN Default Constructor\n";
    real = 1;
    img = 2;
}

Complex::Complex(int r, int i)
{
    cout << "IN Para Constructor\n";
    real = r;
    img = i;
}

int main()
{
    const Complex c2(5,6);
    cout << "real part\t" << c2.getReal();
    Complex c3 (4,5);
    c3.setReal(10);
    cout << "real part\t" << c3.getReal();
}