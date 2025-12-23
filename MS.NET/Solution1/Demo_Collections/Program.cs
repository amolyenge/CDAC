using System.Collections;

namespace Demo_Collections
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region int[]
            //int[] arr = new int[5];
            //arr[0] = 5;
            //arr[1] = 10;
            //arr[2] = 20;
            //arr[3] = 30;
            //arr[4] = 50;

            //for(int i = 0; i< arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);
            //}
            #endregion

            #region Strign[]
            //string[] arr = new string[3];
            //arr[0] = "I";
            //arr[1] = "am";
            //arr[2] = "Amol";

            //for(int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);
            //}
            #endregion

            Employee emp = new Employee();
            emp.EId = 101;
            emp.EName = "Amol";
            emp.EAddress = "Pune";

            Employee emp1 = new Employee();
            emp1.EId = 102;
            emp1.EName = "Akshay";
            emp1.EAddress = "Nagpur";

            Employee emp2 = new Employee();
            emp2.EId = 103;
            emp2.EName = "Om";
            emp2.EAddress = "Akola";

            #region Object [] 
            //Employee[] empArr = new Employee[3];

            //empArr[0] = emp;
            //empArr[1] = emp1;
            //empArr[2] = emp2;

            //for(int i = 0; i < empArr.Length; i++)
            //{
            //    Console.WriteLine($"ID: {empArr[i].EId} , Name: {empArr[i].EName} , Address: {empArr[i].EAddress}");
            //}
            #endregion

            #region Object [] 
            //Object[] objs = new Object[5];
            //objs[0] = 100; // Boxing
            //objs[1] = "Something";
            //objs[2] = emp1;
            //objs[3] = book;
            //objs[4] = 12.34; // Boxing
            #endregion

            #region ArrayList
            //ArrayList arr = new ArrayList();

            //arr.Add(1010);
            //arr.Add("Hello Amol");
            //arr.Add(emp);
            //arr.Add(22.23);

            //for (int i = 0; i < arr.Count; i++)
            //{
            //    object element = arr[i];// value in object form
            //    if (element is int)
            //    {
            //        int j = Convert.ToInt32(element); // Unboxing
            //        Console.WriteLine($"Value = {j}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is string)
            //    {
            //        string str = element.ToString(); // Unboxing
            //        Console.WriteLine($"Value = {str}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is double)
            //    {
            //        double d = Convert.ToDouble(element); // Unboxing
            //        Console.WriteLine($"Value = {d}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is Employee)
            //    {
            //        Employee emp3 = element as Employee;
            //        Console.WriteLine($"Value = {emp3.EId} {emp3.EName} {emp3.EAddress}, Type ={element.GetType().ToString()}");
            //    }
            //    if (element is Book)
            //    {
            //        Book book2 = element as Book;
            //        Console.WriteLine($"Value = {book2.BookName} {book2.Author}, Type ={element.GetType().ToString()}");
            //    }
            //}
            #endregion

            #region Hashtable
            //Hashtable ht = new Hashtable();
            //ht.Add(1, "Amol");
            //ht.Add(2, "Yenge");
            //ht.Add("A", 22.24);
            //ht.Add(3,emp);

            //foreach (object key in ht.Keys)
            //{
            //    Console.WriteLine(key);
            //}
            //foreach (object value in ht.Values)
            //{
            //    Console.WriteLine(value);
            //}
            //foreach (object key in ht.Keys)
            //{
            //    Console.WriteLine($"Key = {key}, Value = {ht[key]}");
            //}
            #endregion

            #region Generic
            //List<int> l = new List<int>();
            //l.Add(10);
            //l.Add(20);
            //l.Add(30);
            //l.Add(40);
            //l.Add(50);

            //for(int i = 0; i < l.Count; i++)
            //{
            //    Console.WriteLine(l[i]);
            //}
            #endregion

            #region Tuples
            //var empDetails = Display(104, "Adhav", "Latur");
            //Console.WriteLine($"Id={empDetails.Id}, Name={empDetails.Name}, Address={empDetails.Address}");

            //static (int Id, string Name, string Address) Display(int id, string name, string address)
            //{
            //    int Id = id;
            //    string Name = name;
            //    string Address = address;
            //    return (Id, Name, Address);
            //}
            #endregion
        }
    }

    public class Book
    {
        private string _Author;
        private string _BookName;

        public string Author
        {
            get { return _Author; }
            set { _Author = value; }
        }

        public string BookName
        {
            get { return _BookName; }
            set { _BookName = value; }
        }
    }

    public class Employee
    {
        private int _EId;
        private string _EName;
        private string _EAddress;

        public int EId
        {
            get { return _EId;  }
            set { _EId = value; }
        }

        public string EName
        {
            get { return _EName; }
            set { _EName = value; }
        }

        public string EAddress
        {
            get { return _EAddress; }
            set { _EAddress = value; }
        }
    }
}
