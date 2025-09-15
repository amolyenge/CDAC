#include <iostream>  
using namespace std;  

// template<class X> 
// void fun(X a)  
// {  
//     cout << "Value of a is : " << a << endl;  
// }  

// template<class X,class Y> 
// void fun(X b ,Y c)  
// {  
//     cout << "Value of b is : " << b << endl;  
//     cout << "Value of c is : " << c << endl;  
// }  

// int main()  
// {  
//    fun(10);  
//    fun(20,30.5);  
//    return 0;  
// }  


template<class X> 
void fun(X a,X b)  
{ 
	cout << "execute1\n";
    cout << "Value of a is : " << a << endl;  
}  

template<class X,class Y> 
void fun(X b ,Y c)  
{  
cout << "execute2\n";
	cout << "execute"; 
    cout << "Value of b is : " << b << endl;  
    cout << "Value of c is : " << c << endl;  
} 

template<class X,class Y,class Z> 
void fun(X b ,Y c,Z d)  
{  
    cout << "Value of b is : " << b << endl;  
    cout << "Value of c is : " << c << endl;
	cout << "Value of c is : " << d << endl;  
}   

int main()  
{  
   fun(10,12);  
   fun(20,30.5);
   fun(10,10,10);  
   return 0;  
}
