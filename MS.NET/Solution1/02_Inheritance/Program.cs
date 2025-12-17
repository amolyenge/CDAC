namespace _02_Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BaseClass obj = new BaseClass();
            obj.m1();

            DerivedClass obj1 = new DerivedClass(15);
            obj1.m1();
            obj1.m2();

            
        }
    }
}
