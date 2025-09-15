#include<iostream>
using namespace std;


int main(){
  cout<<"values are" << endl;
  void show();
  void show();
  void show();

  void showStatic();
  void showStatic();
  void showStatic();
  void showStatic();
}
void show(){
    int a = 0;
    cout<<a<<endl;
    a++;
}

void showStatic(){
    static int b = 0;
    b++;
    cout<<b<<endl;
}