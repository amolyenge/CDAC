namespace _03_Interface
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region implicit
            //Console.WriteLine("Enter your choice.");
            //int ch = Convert.ToInt32(Console.ReadLine());
            //switch (ch)
            //{
            //    case 1:
            //        IDrink d1 = new ColdDrink();
            //        d1.GetDrink();
            //        break;

            //    case 2:
            //        IDrink d2 = new HotDrink();
            //        d2.GetDrink();
            //        break;

            //    default:
            //        Console.WriteLine("Invalid Choice.");
            //        break;
            //}
            #endregion


            Console.WriteLine("Enter your choice. 1) IY  2) IDemo");
            int ch = Convert.ToInt32(Console.ReadLine());
            switch (ch)
            {
                case 1:
                    IY d1 = new MyMath();
                    Console.WriteLine(d1.add(10,20));
                    Console.WriteLine(d1.mul(10,20));
                    break;

                case 2:
                    IDemo d2 = new MyMath();
                    d2.Log("Hello");
                    break;

                default:
                    Console.WriteLine("Invalid Choice.");
                    break;
            }

        }
    }

    #region implicit
    //public interface IDrink {
    //    public void GetDrink();
    //}

    //public class ColdDrink :IDrink
    //{
    //    public void GetDrink()
    //    {
    //        Console.WriteLine("Coke");
    //    }
    //}

    //public class HotDrink : IDrink
    //{
    //    public void GetDrink()
    //    {
    //        Console.WriteLine("Coffee");
    //    }
    //}
    #endregion

    public interface IX
    {
        int add(int x, int y);
        int sub(int x, int y);
    }
    public interface IY
    {
        int add(int x, int y);
        int mul(int x, int y);
    }
    public interface IDemo
    {
        int div(int x, int y);
        void Log(string message);
    }

    public class MyMath : IY, IDemo
    {
        public int add(int x, int y)
        {
            return x + y;
        }

        public int div(int x, int y)
        {
            return x / y;
        }

        public void Log(string message)
        {
            Console.WriteLine("This is Log");
        }

        public int mul(int x, int y)
        {
            return x * y;
        }
    }

}
