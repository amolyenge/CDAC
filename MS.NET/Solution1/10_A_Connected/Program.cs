using _10_A_Connected.Models;

namespace _10_A_Connected
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            builder.Services.AddScoped<IETDbContext>();
            var app = builder.Build();
            if (!app.Environment.IsDevelopment()) 
            { 
                app.UseExceptionHandler("/Home/Error"); 
                app.UseHsts(); 
            }

        }
    }
}
