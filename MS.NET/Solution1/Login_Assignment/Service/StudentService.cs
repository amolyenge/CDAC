using System;
using Login_Assignment.DAL;

namespace Login_Assignment.Service
{
    internal class StudentService
    {
        StudentDal dal = new StudentDal();
        public void VerifyUser(string username, string password)
        {
            bool result = dal.VerifyUser(username, password);

            if (result)
                Console.WriteLine("Login Successful");
            else
                Console.WriteLine("Invalid Username or Password");
        }

        public void CreateUser(string username, string password)
        {
            bool result = dal.CreateUser(username, password);

            if (result)
                Console.WriteLine("User Created Successfully");
            else
                Console.WriteLine("User Creation Failed");
        }

        public void UpdatePassword(string username, string newPassword)
        {
            bool result = dal.UpdatePassword(username, newPassword);

            if (result)
                Console.WriteLine("Password Updated Successfully");
            else
                Console.WriteLine("Password Update Failed");
        }
    }
}
