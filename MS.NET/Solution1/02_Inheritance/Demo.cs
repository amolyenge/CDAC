using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02_Inheritance
{
    internal class BaseClass
    {
        private int _baseNo;

        public BaseClass()
        {

        }

        public BaseClass(int num)
        {
            _baseNo = num;
            Console.WriteLine("You Passed No = {0}" ,_baseNo);
        }

        public void m1()
        {
            Console.WriteLine("Mwthod from Base class");
        }

    }

    internal class DerivedClass : BaseClass
    {
        public DerivedClass(int no):base(no)
        {

        }

        public void m2()
        {
            Console.WriteLine("Method from derived class");
        }
    }
}
