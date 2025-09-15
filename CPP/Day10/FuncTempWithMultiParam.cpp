#include <iostream>  
using namespace std; 

// template<class X,class Y> 
// void fun(X a,Y b)  
// {  
//     cout << "Value of a is : " << a << endl;  
//     cout << "Value of b is : " << b << endl;  
// }  
  
// int main()  
// {  
//    fun(15, 12.3);  
//    return 0;  
// }  


template <class T ,class Y> 
T myMax(T x, Y y)
{
    return (x > y) ? x : y;
}

int main()
{
    
    cout << myMax(3, 'a') << endl;
    cout << myMax<double>(3,4 ) << endl;
    cout << myMax('g', 'e') << endl;
    return 0;
}
