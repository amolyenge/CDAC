namespace Demo_GenericCollections
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();
            emp.Eid = 101;
            emp.Ename = "Amol";
            emp.EAddress = "Pune";

            Employee emp1 = new Employee();
            emp1.Eid = 102;
            emp1.Ename = "Akshay";
            emp1.EAddress = "Nagpur";

            Employee emp2 = new Employee();
            emp2.Eid = 103;
            emp2.Ename = "Om";
            emp2.EAddress = "Akola";

            Employee emp3 = new Employee();
            emp3.Eid = 104;
            emp3.Ename = "Revati";
            emp3.EAddress = "Latur";


            #region List<T>
            List<Employee> elist = new List<Employee>();
            elist.Add(emp);
            elist.Add(emp1);
            elist.Add(emp2);
            elist.Add(emp3);

            foreach (Employee e in elist)
            {
                Console.WriteLine($"Id: {e.Eid}, Name: {e.Ename}, Address : {e.EAddress}");
            }
            #endregion

            #region Dictionary<TKey, TValue>
            //Dictionary<int, Employee> empDict = new Dictionary<int, Employee>();
            //empDict.Add(emp.Eid, emp);
            //empDict.Add(emp1.Eid, emp1);
            //empDict.Add(emp2.Eid, emp2);
            //empDict.Add(emp3.Eid, emp3);
            //foreach (KeyValuePair<int, Employee> element in empDict)
            //{
            //    Employee e = element.Value;
            //    //element.Key
            //    Console.WriteLine($"Id: {e.Eid}, Name: {e.Ename}, Address : {e.EAddress}");
            //}
            //foreach (int key in empDict.Keys)
            //{
            //    Employee e = empDict[key] as Employee;
            //    Console.WriteLine($"Key = {key}, Id: {e.Eid}, Name: {e.Ename}, Address : {e.EAddress}");
            //}
            //foreach (Emp emp in empDict.Values)
            //{

            //    Console.WriteLine($"Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            //}
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
