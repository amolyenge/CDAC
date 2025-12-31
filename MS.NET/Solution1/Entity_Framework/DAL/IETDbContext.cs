using Entity_Framework.Models;
using Microsoft.Extensions.Configuration;
using System.Data.Entity;


namespace Entity_Framework.DAL
{
    public class IETDbContext : DbContext
    {
        public DbSet<Emp> emps { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            var builder = new ConfigurationBuilder();
            builder.SetBasePath(Directory.GetCurrentDirectory());
            builder.AddJsonFile("appsettings.json");
            IConfiguration config = builder.Build();
            optionsBuilder.UseSqlServer(config.GetConnectionString("IETDb"));
        }
    }
}
