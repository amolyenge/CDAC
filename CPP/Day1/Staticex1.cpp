#include<iostream>
using namespace std;

class Config{
    static int maxUsers;
    public:
       static void setMaxUsers(int n){
          maxUsers = n;
       }
       static void showmaxUsers(){
         cout<<" max Users = "<<maxUsers<<endl;
       }
};

int Config::maxUsers = 10;

int main(){
     Config::showmaxUsers;
     Config::setMaxUsers(30);
     Config::showmaxUsers;
}