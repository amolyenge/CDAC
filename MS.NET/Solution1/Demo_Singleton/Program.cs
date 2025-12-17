using static Demo_Singleton.Program;

namespace Demo_Singleton
{
    internal class Program
    {
        static void Main(string[] args)
        {

            while (true)
            {
                Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");
                int dbChoice = Convert.ToInt32(Console.ReadLine());

                DataBaseFactory factory = new DataBaseFactory();
                Database someDatabaseObject = factory.GetSomeDataBase(dbChoice);
                Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
                int opChoice = Convert.ToInt32(Console.ReadLine());
                switch (opChoice)
                {
                    case 1:
                        someDatabaseObject.Insert();
                        break;
                    case 2:
                        someDatabaseObject.Update();
                        break;
                    case 3:
                        someDatabaseObject.Delete();
                        break;
                    default:
                        Console.WriteLine("Invalid Db operation Choice");
                        break;
                }

                Console.WriteLine("Do you want to continue? y/n");
                string ynChoice = Console.ReadLine();
                if (ynChoice == "n")
                {
                    break;
                }
            }
        }

        public abstract class Database
        {
            public Logger _logger = null;

            public Database()
            {
                _logger = Logger.GetLogger();
            }

            protected abstract void DoInsert();
            protected abstract void DoUpdate();
            protected abstract void DoDelete();
            protected abstract string GetDataBaseName();

            public void Insert()
            {
                DoInsert();
                _logger.Log($"Insert From {GetDataBaseName()} done.");
            }
            public void Update()
            {
                DoUpdate();
                _logger.Log($"Update From {GetDataBaseName()} done.");
            }
            public void Delete()
            {
                DoDelete();
                _logger.Log($"Delete From {GetDataBaseName()} done.");
            }
        }

        public class DataBaseFactory
        {
           public Database GetSomeDataBase(int dbchoice)
            {
                Database db = null;
                switch (dbchoice)
                {
                    case 1:
                        db = new SqlServer();
                        break;
                    case 2:
                        db = new MySqlServer();
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

        public class MySqlServer : Database
        {
            protected override string GetDataBaseName()
            {
                return "Data Base name : MySqlServer";
            }

            protected override void DoDelete()
            {
                Console.WriteLine("Deleted from MySqlServer Successfully..");
            }
            protected override void DoInsert()
            {
                Console.WriteLine("Inserted in MySqlServer Successfully..");
            }
            protected override void DoUpdate()
            {
                Console.WriteLine("Updated from MySqlServer Successfully..");
            }

        }

        public class SqlServer : Database
        {
            protected override string GetDataBaseName()
            {
                return "Data Base name : SqlServer";
            }

            protected override void DoDelete()
            {
                Console.WriteLine("Deleted from SqlServer Successfully..");
            }
            protected override void DoInsert()
            {
                Console.WriteLine("Inserted in SqlServer Successfully..");
            }
            protected override void DoUpdate()
            {
                Console.WriteLine("Updated from SqlServer Successfully..");
            }
        }

        public class OracleServer : Database
        {
            protected override string GetDataBaseName()
            {
                return "Data Base name : OracleServer";
            }

            protected override void DoDelete()
            {
                Console.WriteLine("Deleted from OracleServer Successfully..");
            }
            protected override void DoInsert()
            {
                Console.WriteLine("Inserted in OracleServer Successfully..");
            }
            protected override void DoUpdate()
            {
                Console.WriteLine("Updated from OracleServer Successfully..");
            }
        }

        public class Logger
        {
            private static readonly Logger _logger1 = new Logger();


            private Logger()
            {
                Console.WriteLine("Logger Object is created for the first time!..");
            }
            public static Logger GetLogger()
            {
                return _logger1;
            }
            public void Log(string message)
            {

                Console.WriteLine("---Logged at {0}, message : {1}", DateTime.Now.ToString(), message);
            }
        }
    }
}
