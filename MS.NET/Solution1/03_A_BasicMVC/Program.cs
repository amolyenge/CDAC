namespace _03_A_BasicMVC
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();
            // URL: "/" : /Home/Index
            // URL : "/Home": /Home/Index
            // URL : /Home/Index : Default Route
            //Conventional Based Routing

            app.MapDefaultControllerRoute();


            app.Run();
        }
    }
}
