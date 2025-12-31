namespace Exception_Handling
{
    internal class Program
    {
        static void Main(string[] args)
        {

            try
            {
                Console.WriteLine("Enter first No : ");
                int n1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter second No : ");
                int n2 = Convert.ToInt32(Console.ReadLine());
                if (n2 == 0)
                {
                    throw new MyCustomException($"Second number should not be zero");
                }
                int divResult = n1 / n2;
                Console.WriteLine($"Div Result  = {divResult}");
            }
            catch (MyCustomException obj)
            {
                Console.WriteLine(obj.MyMessage);
            }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine($"---{ex.Message}");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                Console.WriteLine("finally block");
            }
        }
    }
    public class MyCustomException : Exception
    {
        public string MyMessage { get; set; }
        public MyCustomException(string msg)
        {
            MyMessage = msg;
        }
    }
}
