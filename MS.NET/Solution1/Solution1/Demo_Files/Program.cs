using System.Collections.Generic;
using System.Security.Cryptography;
using System.Timers;

namespace Demo_Files
{
    internal class Program
    {
        static void Main(string[] args)
        {

            string filePath = "C:\\Users\\IET\\Desktop\\250845920005\\MS.NET\\Solution1\\Demo_Files\\Files\\demo1.txt";

            #region StreamWriter 
            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //StreamWriter writer = new StreamWriter(fs);
            //writer.WriteLine(" Hugh Jackman");
            //writer.Flush();
            //writer.Close();
            //Console.WriteLine("Done.");
            #endregion

            #region StreamReader
            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File doest not exists !");
            //}

            //StreamReader reader = new StreamReader(fs);
            //string content = reader.ReadToEnd();
            //reader.Close();
            //fs.Close();
            //Console.WriteLine(content);
            #endregion

            #region
            Employee emp = new Employee();
            emp.Eid = 101;
            emp.Ename = "Amol";
            emp.EAddress = "Pune";

            FileStream fs = null;

            if (File.Exists(filePath))
            {
                fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            }

            StreamWriter writer = new StreamWriter(fs);
            writer.Write(emp);
            writer.Flush();
            writer.Close();
            fs.Close();
            Console.WriteLine("Done.");

            #endregion
        }
    }

    public class Employee
    {
        private int _Eid;
        private string _Ename;
        private string _EAddress;

        public int Eid
        {
            get { return _Eid; }
            set { _Eid = value; }
        }

        public string Ename
        {
            get { return _Ename; }
            set { _Ename = value; }
        }

        public string EAddress
        {
            get { return _EAddress; }
            set { _EAddress = value; }
        }
    }
}
