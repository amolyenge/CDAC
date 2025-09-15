#include<iostream>
#include<cmath>
using namespace std;

int main(){

    int base , power;
    cout<<"Enter Base"<<endl;
    cin>>base;
    cout<<"Enter power"<<endl;
    cin>>power;

   int ans =  pow(base,power);

    // for(int i = 1; i <= power;i++){
    //     base *= base;
    // }
    cout<<ans;
}