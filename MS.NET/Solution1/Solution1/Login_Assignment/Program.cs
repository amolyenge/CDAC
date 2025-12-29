using Login_Assignment.Service;

namespace Login_Assignment
{
    internal class Program
    {
        static void Main(string[] args)
        {
            StudentService service = new StudentService();
            int choice = 0;
            do
            {
                Console.WriteLine("----------Welcome to Login Page----------");
                Console.WriteLine("1. Login User " + "2. Create User" + "3. Update Password " + "0. Exit");
                Console.WriteLine("ENTER your Choice...");
                choice = Convert.ToInt32(Console.ReadLine());
                switch (choice)
                {
                    case 1:
                        Console.WriteLine("Enter your Username ->");
                        string? name = Console.ReadLine().ToString();
                        Console.WriteLine("Enter Password ->");
                        string? password = Console.ReadLine().ToString();
                        service.VerifyUser(name, password);
                        break;
                    case 2:
                        Console.Write("Enter New Username: ");
                        string newname = Console.ReadLine();
                        Console.Write("Enter New Password: ");
                        string newpassword = Console.ReadLine();
                        service.CreateUser(newname, newpassword);
                        break;

                    case 3:
                        Console.Write("Username: ");
                        string user = Console.ReadLine();
                        Console.Write("New Password: ");
                        string newPwd = Console.ReadLine();
                        service.UpdatePassword(user, newPwd);
                        break;

                    case 0:
                        Console.WriteLine("Exiting...");
                        break;

                    default:
                        Console.WriteLine("Invalid Choice");
                        break;
                }

            } while (choice != 0);
        }
    }
}
