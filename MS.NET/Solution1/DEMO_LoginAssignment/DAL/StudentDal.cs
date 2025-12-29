using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Data.SqlTypes;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _42Demo_ConnectedAdoNet.DAL
{
    public class StudentDal
    {
        string connection =@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=LoginDB;Integrated Security=True;";

        public bool VerifyUser(string username, string password)
        {
            bool isValid = false;

            using (SqlConnection con = new SqlConnection(connection))
            {
                string query = "SELECT COUNT(*) FROM studentinfo WHERE Username=@u AND Password=@p";
                SqlCommand cmd = new SqlCommand(query, con);

                cmd.Parameters.AddWithValue("@u", username);
                cmd.Parameters.AddWithValue("@p", password);

                con.Open();
                int count = (int)cmd.ExecuteScalar();

                if (count > 0)
                    isValid = true;
            }
            return isValid;
        }

        public bool CreateUser(string username, string password)
        {
            using (SqlConnection con = new SqlConnection(connection))
            {
                string query = "INSERT INTO studentinfo (Username, Password) VALUES (@u, @p)";
                SqlCommand cmd = new SqlCommand(query, con);

                cmd.Parameters.AddWithValue("@u", username);
                cmd.Parameters.AddWithValue("@p", password);

                con.Open();
                return cmd.ExecuteNonQuery() > 0;
            }
        }

        public bool UpdatePassword(string username, string newPassword)
        {
            using (SqlConnection con = new SqlConnection(connection))
            {
                string query = "UPDATE studentinfo SET Password=@p WHERE Username=@u";
                SqlCommand cmd = new SqlCommand(query, con);

                cmd.Parameters.AddWithValue("@u", username);
                cmd.Parameters.AddWithValue("@p", newPassword);

                con.Open();
                return cmd.ExecuteNonQuery() > 0;
            }
        }

    }
}
