using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practice_Basic
{
    internal class Count
    {
        public int CountnNum(int n)
        {
            int sum = 0;
            for(int i = 0; i <= n; i++)
            {
                sum = sum + i;
            }
            return sum;
        }
    }
}
