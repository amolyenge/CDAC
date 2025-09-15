#include<iostream>
#include<cmath>
using namespace std;

int main(){
    double principal  = 10000 , rate = 4 , time = 2;
    double amount = principal * pow((1 + rate/100),time);
    double ci = amount - principal;
    cout<< " Compound Interest is : " <<ci<<endl;
    return 0;
}

