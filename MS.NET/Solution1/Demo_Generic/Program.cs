namespace Demo_Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Without Template Swap Method Code 
            //int a = 10;
            //int b = 30;

            //CMath cmath = new CMath();

            //Console.WriteLine($"Before Swapping A : {a} & B: {b}");
            //cmath.swap(ref a, ref b);
            //Console.WriteLine($"After Swapping A : {a} & B: {b}");


            //string str1 = "Amol";
            //string str2 = "Yenge";

            //Console.WriteLine($"Before Swapping str1 : {str1} & str2: {str2}");
            //cmath.swap(ref str1, ref str2);
            //Console.WriteLine($"After Swapping str1 : {str1} & str2: {str2}");
            #endregion

            #region With Template Swap MEthod Code
            //int a = 12;
            //int b = 7;
            //CMath cmath = new CMath();
            //Console.WriteLine($"Before Swapping A={a}, B={b}");
            //cmath.swap<int>(ref a, ref b);
            //Console.WriteLine($"After Swapping A={a}, B={b}");

            //string s1 = "Hello";
            //string s2 = "Bye";
            //Console.WriteLine($"Before Swapping S1={s1}, S2={s2}");
            //cmath.swap<string>(ref s1, ref s2);
            //Console.WriteLine($"After Swapping S1={s1}, S2={s2}");
            #endregion

            #region Generic Overloadded Demo Methods
            //CMath cmath = new CMath();
            //int res1 = cmath.Demo<int, string, int, string>(101, "Amol", 45000, "Pune");
            //Console.WriteLine(res1);


            //string res2 = cmath.Demo<int, string, int, string, int>(102, "Om", 44000, "Pune", 23);
            //Console.WriteLine(res2);

            #endregion

            #region Out Parameter
            //double area, circumference = 0;
            //double radius = 5;
            //CMath cmath = new CMath();
            //cmath.CalculateCircleArea(radius, out area, out circumference);
            //Console.WriteLine($"Circle : Area = {area}, Circumference = {circumference}");
            #endregion

            #region Generic Class With Generic and Non- Generic MEthods
            //MyClass<string> myClass = new MyClass<string>();
            //myClass.sayHii("Hugh Jackman");
            //Console.WriteLine(myClass.doubleNumber(2));
            #endregion

            #region Params Keyword
            //int[] numbers = new int[3];
            //numbers[0] = 10;
            //numbers[1] = 20;
            //numbers[2] = 30;

            //Demo demo = new Demo();
            //demo.Add(numbers);

            //demo.PlayerNames(101, "Rohit", "Virat");
            //demo.PlayerNames(102, "Rohit", "Dhoni", "Virat", "Hardik");
            #endregion

        }
    }

    public class Demo
    {
        public void Add(int[] arr)
        {
            int sum = 0;
            for(int i = 0; i < arr.Length; i++)
            {
                sum += arr[i];
            }
            Console.WriteLine(sum);
        }

        public void PlayerNames(int x ,params string[] arr)
        {
            string output = "Player Name: ";
            for(int i = 0; i < arr.Length; i++)
            {
                output += arr[i] + " ";
            }

            Console.WriteLine(output);
            Console.WriteLine(x);
        }
    }


    public class MyClass<T>
    {
        public void sayHii(T para)
        {
            Console.WriteLine($"Hello {para}");
        }

        public int doubleNumber(int x)
        {
            return x * 2;
        }
    }

    public class CMath
    {
        public void swap<T>(ref T x, ref T y)
        {
            T temp = x;
            x = y;
            y = temp;
        }

        public R Demo<P,Q,R,S>(P a,Q b,R c,S d)
        {
            return c;
        }

        public T4 Demo<T1,T2,T3,T4,T5>(T1 a , T2 b,T3 c,T4 d,T5 e)
        {
            return d;
        }

        public T Add<T>(T x , Task y)
        {
            dynamic para1 = x;
            dynamic para2 = y;

            dynamic sum = para1 + para2;
            return sum;
        }

        public void CalculateCircleArea(double radius, out double area, out double circumference)
        {
            area = 3.14 * radius * radius;
            circumference = 2 * 3.14 * radius;
        }
    }
}
