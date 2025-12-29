using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_OOP_Inheritance.logic
{
    internal class Person
    {
        public string first_name;
        public string last_name;

        public string name()
        {
            return first_name + last_name;
        }
    }

    internal class Employee : Person
    {
        public int emp_id;
    }
}
