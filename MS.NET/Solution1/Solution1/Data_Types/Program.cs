using System.Xml.Serialization;

namespace Data_Types
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Data Types (num)
            //int x = 300;
            //System.Int32 y = 100;
            //System.Int32 z = 200;
            //System.Int32 sum = x + y + z;
            //Console.WriteLine(sum);
            //double d = 2.13;
            //Console.WriteLine("x ={0} ,y = {1},z = {2} ", x, y, z);
            #endregion

            #region String and Chars
            //string str = "Amol Yenge";
            //string str2 = "Abhi Alkari";
            //string str3 = new string("ASP.Net");

            //Console.WriteLine(str + " " + str2 + " " + str3);
            //char ch = 'A';
            //char[] chArr = new char[3];
            //chArr[0] = 'A';
            //chArr[1] = 'B';
            //chArr[2] = 'C';

            //Console.WriteLine(chArr);
            #endregion

            #region Conditions
            //bool isTrue = true;

            //if (isTrue)
            //{
            //    Console.WriteLine("Condition is True...");
            //}
            //else
            //{
            //    Console.WriteLine("Condition is not True..");
            //}
            #endregion

            #region  Loops
            //int val = 10;
            //for(int i = 1; i > 10; i++)
            //{
            //    Console.WriteLine(i);
            //    val--;
            //}
            #endregion


            #region while loops
            //int val = 1;

            //while(val <= 10)
            //{
            //    Console.WriteLine(val);
            //    val++;
            //}
            #endregion

            #region do -While
            //int val = 1;
            //do
            //{
            //    Console.WriteLine(val);
            //    val++;
            //} while (val == 10);
            #endregion

            #region Switch case
            //Console.WriteLine("Enter Your Choice 1 ,2,3 or 4 : ");
            //string input = Console.ReadLine();
            //int ch = Convert.ToInt32(input);

            //switch (ch)
            //{
            //    case 1:
            //        Console.WriteLine("Choice 1.");
            //        break;
            //    case 2:
            //        Console.WriteLine("Choice 2.");
            //        break;
            //    case 3:
            //        Console.WriteLine("Choice 3.");
            //        break;
            //    case 4:
            //        Console.WriteLine("Choice 4");
            //        break;
            //    default:
            //        Console.WriteLine("Invalid Choice");
            //        break;
            //}
            #endregion

            #region TypeCasting Boxing Unboxing

            //int x = 100; // Value Type
            //string str = "Hello World"; // Reference Type
            //Object obj1 = new object(); // Reference Type
            //// Boxing: Converting Value Type to Reference Type
            //obj1 = x;
            //Console.WriteLine(obj1);
            //str = Convert.ToString(x);// Boxing
            //string str2 = x.ToString();// Boxing 
            #endregion
        }
    }
}
