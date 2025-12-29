using _42Demo_ConnectedAdoNet.DAL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _42Demo_ConnectedAdoNet.BLL_Business_Logic_Layer_
{
    public class StudentService
    {
        StudentDal dal = new StudentDal();
        public void VerifyUser(string username, string password)
        {
            bool result = dal.VerifyUser(username, password);

            if (result)
                Console.WriteLine("✅ Login Successful");
            else
                Console.WriteLine("❌ Invalid Username or Password");
        }

        public void CreateUser(string username, string password)
        {
            bool result = dal.CreateUser(username, password);

            if (result)
                Console.WriteLine("✅ User Created Successfully");
            else
                Console.WriteLine("❌ User Creation Failed");
        }

        public void UpdatePassword(string username, string newPassword)
        {
            bool result = dal.UpdatePassword(username, newPassword);

            if (result)
                Console.WriteLine("✅ Password Updated Successfully");
            else
                Console.WriteLine("❌ Password Update Failed");
        }
    }
}
