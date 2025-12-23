using System.ComponentModel.DataAnnotations.Schema;
using System.Reflection;
using System.IO;

namespace Demo_MyORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string asmPath = @"C:\Users\IET\Desktop\250845920005\MS.NET\Solution1\Demo_EmpLib\bin\Debug\net8.0\Demo_EmpLib.dll";

            Assembly asm = Assembly.LoadFrom(asmPath);
            Type[] allTypes = asm.GetTypes();

            foreach (Type type in allTypes)
            {
                string createTableQuery = "CREATE TABLE ";

                // Look for [Table] attribute
                foreach (var attr in type.GetCustomAttributes())
                {
                    if (attr is TableAttribute tableAttr)
                    {
                        createTableQuery += tableAttr.Name + " ( ";
                    }
                }

                // Look for [Column] attributes
                foreach (PropertyInfo prop in type.GetProperties())
                {
                    foreach (var pAttr in prop.GetCustomAttributes())
                    {
                        if (pAttr is ColumnAttribute col)
                        {
                            createTableQuery += col.Name + " " + col.TypeName + ",";
                        }
                    }
                }

                // Trim trailing comma and close bracket
                createTableQuery = createTableQuery.TrimEnd(',') + " )";
                Console.WriteLine(createTableQuery);

                string filePath = @"C:\Users\IET\Desktop\250845920005\MS.NET\Solution1\Demo_MyORM\SQLQuery\CreateTableQueries.sql";
                File.WriteAllText(filePath, createTableQuery);

                Console.WriteLine("Done.");
            }
        }
    }
}
