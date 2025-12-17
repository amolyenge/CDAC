namespace Inheritance__New
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter your Db choice. 1. MySqlServer, 2.  SqlServer, 3. Oracle Server");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            DataBaseFactory factory = new DataBaseFactory();
            IDatabase someDatabaseObject = factory.GetsomeDatabase(dbChoice);
            Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
            int opChoice = Convert.ToInt32(Console.ReadLine());
            switch (opChoice)
            {
                case 1:
                    someDatabaseObject.insert();
                    break;
                case 2:
                    someDatabaseObject.update();
                    break;
                case 3:
                    someDatabaseObject.delete();
                    break;
                default:
                    Console.WriteLine("Invalid Db operation Choice");
                    break;
            }
        }
    }

    public interface IDatabase
    {
        void insert();
        void update();
        void delete();
    }
    public class DataBaseFactory
    {
        public IDatabase GetsomeDatabase(int dbchoice)
        {
            IDatabase db = null;

            switch (dbchoice)
            {
                case 1:
                    db = new MySqlServer();
                    break;
                case 2:
                    db = new SqlServer();
                    break;
                case 3:
                    db = new OracleServer();
                    break;
                default:
                    db = null;
                    break;
            }
            return db;
        }
    }

    public class MySqlServer : IDatabase
    {
        void IDatabase.delete()
        {
            Console.WriteLine("Record deleted from mysqlServer.");
        }

        void IDatabase.insert()
        {
            Console.WriteLine("Record inserted in mysqlServer.");
        }

        void IDatabase.update()
        {
            Console.WriteLine("Record updated in mysqlServer.");
        }
    }

    public class SqlServer : IDatabase
    {
        void IDatabase.delete()
        {
            Console.WriteLine("Record deleted from sqlServer.");
        }

        void IDatabase.insert()
        {
            Console.WriteLine("Record inserted in sqlServer.");
        }

        void IDatabase.update()
        {
            Console.WriteLine("Record updated in sqlServer.");
        }
    }

    public class OracleServer : IDatabase
    {
        void IDatabase.delete()
        {
            Console.WriteLine("Record deleted from OracleServer.");
        }

        void IDatabase.insert()
        {
            Console.WriteLine("Record inserted in OracleServer.");
        }

        void IDatabase.update()
        {
            Console.WriteLine("Record updated in  OracleServer.");
        }
    }
}
