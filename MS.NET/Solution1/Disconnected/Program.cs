using Microsoft.Data.SqlClient;
using System.Data;

namespace Disconnected
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string _ConStr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=dac5;Integrated Security=True";

            #region SELECT Query
            //SqlConnection con = new SqlConnection(_ConStr);

            //SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM EMP", con);
            //da.MissingSchemaAction = MissingSchemaAction.AddWithKey;

            //DataSet ds = new DataSet();
            //da.Fill(ds, "Emp"); 

            //foreach (DataRow row in ds.Tables["Emp"].Rows)
            //{
            //    int id = Convert.ToInt32(row["Id"]);
            //    string nm = row["Name"].ToString();
            //    string add = row["Address"].ToString();
            //    Console.WriteLine($"Id: {id}, Name: {nm}, Address: {add}");
            //}
            #endregion

            #region INSERT Query
            SqlConnection con = new SqlConnection(_ConStr);
            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM EMP", con);

            da.MissingSchemaAction = MissingSchemaAction.AddWithKey;

            SqlCommandBuilder builder = new SqlCommandBuilder(da);

            DataSet ds = new DataSet();
            da.Fill(ds, "Emp");
            

            Console.WriteLine("Enter Name:");
            string nm = Console.ReadLine();
            Console.WriteLine("Enter Address:");
            string add = Console.ReadLine();

            DataRow newRow = ds.Tables["Emp"].NewRow();
            newRow["Name"] = nm;
            newRow["Address"] = add;

            ds.Tables["Emp"].Rows.Add(newRow);

            da.Update(ds, "Emp");
            Console.WriteLine("Record inserted!");


            #endregion
        }
    }
}
