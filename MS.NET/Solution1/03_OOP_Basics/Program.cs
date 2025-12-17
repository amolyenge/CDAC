namespace _03_OOP_Basics
{
    internal class Program
    {
        static void Main(string[] args)
        {
            MyClass obj = new MyClass();
            int ans =  obj.addNElements(5);
            Console.WriteLine(ans);
        }
    }
}
