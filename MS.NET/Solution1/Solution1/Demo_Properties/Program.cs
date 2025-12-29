namespace Demo_Properties
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();
            emp.Eid = 101;
            emp.Ename = "Amol";
            emp.Eaddress = "Pune";

            Console.WriteLine(emp.Eaddress);
        }
    }

    public class Employee
    {
        private int _Eid;
        private string _Ename;
        private string _Eaddress;

        public int Eid
        {
            set
            {
                _Eid = value;
            }
            get
            {
                return _Eid;
            }
        }

        public string Ename
        {
            set
            {
                if (value != null)
                {
                    _Ename = value;
                }
                else
                {
                    _Ename =  "Invalid String"; 
                }
            }
            get
            {
                return _Ename;
            }
        }


        public string Eaddress
        {
            set
            {
                if(value != null)
                {
                    _Eaddress = value;
                }
                else
                {
                    _Eaddress = null;
                }
            }
            get
            {
                return _Eaddress;
            }
        }
    }
}
