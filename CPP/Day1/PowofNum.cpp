#include<iostream>
using namespace std;
#include<cmath>

int main(){
    double base , exponent;
    cout<<"Enter the Base and Exponent:\n";
    cin>>base>>exponent;

    cout<<base<<"^"<<exponent<<"="<<pow(base,exponent)<<endl;
    return 0;
}