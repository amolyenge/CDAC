#include<iostream>
#include<cmath>;
using namespace std;

int main(){
    double p,r,t;
    cout<<"Enter Principal , rate , time: \n";
    cin>>p>>r>>t;

    double A = p*pow((1 + r /100 ) , t);
    double CI = A-p;
    cout<< "Compound Interest is :"<<CI;
    return 0;
}