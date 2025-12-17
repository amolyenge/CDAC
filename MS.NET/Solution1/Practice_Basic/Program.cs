namespace Practice_Basic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter number1");
            int num = Convert.ToInt32(Console.ReadLine());

            int fact = 1;
            const int num2 = 100;

            for(int i = 1; i <= num; i++)
            {
               fact = fact * i;
            }
            Console.WriteLine("Factorial of num is " + fact);

            Count obj = new Count();
            int val = obj.CountnNum(num);
            Console.WriteLine("Sum of N Numbers is " + val);
        }

    }
}
