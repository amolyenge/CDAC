using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_Inheritance
{
    public  class CMath
    {
        public int add(int a , int b)
        {
            return a + b;
        }

        public void add(int a , int b , int c)
        {
            Console.WriteLine(a + b + c);
        }

        public void sub(int a , int b)
        {
            Console.WriteLine(a - b);
        }

        public virtual void mul(int a , int b)
        {
            Console.WriteLine(a * b);
        }
    }


    public class AdvancedMath : CMath
    {

        public override void mul(int a, int b)
        {
            Console.WriteLine((a * b) * 100);
        }

        public new void add(int a, int b)
        {
            Console.WriteLine((a + b) * 100);
        }

        public void sub(int a , int b)
        {
            Console.WriteLine((a - b) * 100);
        }
    }
}
