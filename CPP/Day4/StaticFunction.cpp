#include <iostream>
using namespace std;

class Complex
    {
        public:
            static int cnt;
    };
    int Complex :: cnt = 5; // initialise by 5
    
int main()
{
    cout << Complex :: cnt;
}





// class Complex 
//     {     
//         public:
//             static int Complex :: cnt;
//             void show();
//             Complex();
//             Complex(int, int);
//             static int getcnt();   
//     }; 
// int main()
// {
//     cout << Complex :: cnt;
// }