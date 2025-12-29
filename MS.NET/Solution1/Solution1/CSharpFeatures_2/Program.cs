using System.Collections;

namespace CSharpFeatures_2
{
    public delegate bool MyDelegate(int num);
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a Number: ");
            int no = Convert.ToInt32(Console.ReadLine());

            #region   Normal Function Call for Check Method 
            //var result = Check(no);
            //if (result)
            //{
            //    Console.WriteLine($"No : {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No : {no} is NOT greater than 10");
            //}
            #endregion

            #region  Check Method Call with MyDelegate
            //MyDelegate del = new MyDelegate(Check);
            //var result = del(no);
            //if (result)
            //{
            //    Console.WriteLine($"No : {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No : {no} is NOT greater than 10");
            //}
            #endregion

            #region Anonymous Methods with Mydelegate and delegate keyword
            ////MyDelegate del = new MyDelegate(delegate (int num)
            ////                                {
            ////                                    return num > 10;
            ////                                });
            //MyDelegate del = delegate (int num)
            //                    {
            //                        return num > 10;
            //                    };
            ////var result = del(no);
            ////if (result)
            //if (del(no))
            //{
            //    Console.WriteLine($"No : {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No : {no} is NOT greater than 10");
            //}
            #endregion

            #region Lamabada Expression : => goes to operator
            //MyDelegate del = (int num) =>
            //                    {
            //                        return num > 10;
            //                    };

            // Lambada Expression(=> goes to operator)
            //MyDelegate del = num => num > 10;

            //if (del(no))
            //{
            //    Console.WriteLine($"No : {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No : {no} is NOT greater than 10");
            //}
            #endregion

            #region Predicate<T> in-built delegate 

            //Predicate<int> del = num => num > 10;

            //if (del(no))
            //{
            //    Console.WriteLine($"No : {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No : {no} is NOT greater than 10");
            //}
            #endregion

            #region In-built Sum Extension Method and normal MySum Method
            //int[] arr = new int[] { 1, 5, 2, 3 };
            //var result = arr.Sum();
            //Console.WriteLine($"Sum1 = {result}");

            //var result1 = MySum(arr);
            //Console.WriteLine($"Sum2 = {result1}");

            //string[] names = new string[] { "Hugh", "John", "Tom" };
            //var result2 = MySum(names);
            ////var result3 = names.Sum();
            //Console.WriteLine($"Sum3 = {result2}");
            #endregion

            #region Regular valid email id checking code
            //Console.WriteLine("Enter your Email ID:");
            //string? email = Console.ReadLine();
            //if (email != null)
            //{
            //    if (CheckForValidEmailID(email))
            //        Console.WriteLine("Valid EMail id");
            //    else
            //        Console.WriteLine("Invaild email Id");
            //}
            #endregion

            #region Extension MEthods: Demo 01
            //Console.WriteLine("Enter your Email ID:");
            //string? email = Console.ReadLine();
            //if (email != null)
            //{
            //    if (email.CheckForValidEmailID())
            //        Console.WriteLine("Valid EMail id");
            //    else
            //        Console.WriteLine("Invaild email Id");
            //}
            #endregion

            #region Extension MEthods: Demo 02
            //int[] numbers = { 101, 102, 103, 104, 105 };
            //string[] days = { "Mon", "Tue", "Wed", "Sun" };

            //List<int> output1 = numbers.ConvertToList(1111);
            //foreach (var item in output1)
            //{
            //    Console.WriteLine($"{item}");
            //}

            //List<string> output2 = days.ConvertToList(4789);
            //foreach (var item in output2)
            //{
            //    Console.WriteLine($"{item}");
            //}
            #endregion

            #region Itertor
            #region Demo 01 :
            //int[] arr = { 1, 2, 3, 4, 5 };
            //arr[5] = 6;
            //foreach (int ele in arr)
            //{
            //    Console.WriteLine(ele);
            //}
            //List<int> lstArr = new List<int>();
            //lstArr.Add(11); 
            #endregion

            #region CustomCollection Demo 02
            //MyCustomCollection customCollectionObject = new MyCustomCollection();
            //customCollectionObject.AddElement(10);
            //customCollectionObject.AddElement(20);
            //customCollectionObject.AddElement(30);

            ////var result = customCollectionObject.GetElemets;
            ////for (int i = 0; i < result.Count; i++)
            ////{
            ////    Console.WriteLine(result[i]);
            ////}
            ////foreach (var item in result)
            ////{
            ////    Console.WriteLine(item);
            ////}

            //foreach (var item in customCollectionObject)
            //{
            //    Console.WriteLine($"--{item}");
            //}

            //MyCollection collection = new MyCollection();
            //foreach (string day in collection)
            //{
            //    Console.WriteLine(day); 
            //}
            #endregion

            #endregion
        }

    }

    public class MyCustomCollection : IEnumerable
    {
        private ArrayList arr = new ArrayList();
        public ArrayList GetElemets
        {
            //set
            //{
            //    arr.Add(value);
            //}
            get
            {
                return arr;
            }
        }
        public void AddElement(int element)
        {
            arr.Add(element);
        }
        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < arr.Count; i++)
            {
                yield return arr[i];
            }
        }
    }

    public class MyCollection : IEnumerable
    {
        private string[] days = new string[] { "Monday", "Tuesday", "Wedensday", "Thrusday", "Firday", "Saturday", "Sunday" };

        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < days.Length; i++)
            {
                string day = days[i];
                yield return day; 
            }
        }

        public string[] Days
        {
            get { return days; }
        }
    }

    public static class MyClass //: String : not allowed. sesled class
    {
        public static bool CheckForValidEmailID(this string email)
        {
            return email.Contains("@b.com");
        }

        public static List<T> ConvertToList<T>(this IEnumerable<T> source, int nonsenseParameter)
        {
            List<T> list = new List<T>();
            foreach (var item in source)
            {
                list.Add(item);
            }
            Console.WriteLine($"Nonsense Parameter value = {nonsenseParameter}");
            return list;
        }
    }
}
