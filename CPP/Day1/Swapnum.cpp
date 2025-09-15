#include<iostream>
using namespace std;

int main(){
    int num1 , num2;
    cout<<"Enter num1:\n";
    cin>>num1;
    cout<<"Enter num2:\n";
    cin>>num2;

    cout<<"Before swapping num1: \t"<<num1<<", num2: \t"<<num2<<endl;

    //int temp = num1;
    //num1 = num2;
    //num2 = temp;

    //num1 = num1 + num2;
    //num2 = num1 - num2;
    //num1 = num1 - num2;

    //num1 = num1 * num2;
    //num2 = num1/num2;
    //num1 = num1 / num2;

    num1 = num1 ^ num2;
    num2 = num1 ^ num2;
    num1 = num1 ^ num2;

    cout<<"After swapping num1: \t"<<num1<<", num2: \t"<<num2<<endl;

}