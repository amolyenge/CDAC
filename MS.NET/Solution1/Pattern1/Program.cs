namespace Pattern1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int size = 5;

            for (int i = 1; i <= size; i++)
            {
                for (int j = 1; j <= size; j++)
                {
                    if (i == 1 && j == 3 ||
                        i == 2 && (j == 2 || j == 4) ||
                        i == 3 && (j == 1 || j == 5) ||
                        i == 4 && (j == 2 || j == 4) ||
                        i == 5 && (j == 3))
                    {
                        Console.Write("*");
                    }
                    else
                    {
                        Console.Write(" ");
                    }
                }
                Console.WriteLine();
            }
        }
    }
}
https://github.com/chinmayy19/CDAC-Materails/tree/main/.NET_Practice
