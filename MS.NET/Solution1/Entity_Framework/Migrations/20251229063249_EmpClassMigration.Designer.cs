using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using Entity_Framework.DAL;

namespace Entity_Framework.Migrations
{
    [DbContext(typeof(IETDbContext))]
    [Migration("20251229063249_EmpClassMigration")]
    partial class EmpClassMigration
    {
        /// <inheritdoc />
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "8.0.22")
                .HasAnnotation("Relational:MaxIdentifierLength", 128);

            SqlServerModelBuilderExtensions.UseIdentityColumns(modelBuilder);

            modelBuilder.Entity("Entity_Framewrok.Models.Emp", b =>
            {
                b.Property<int>("Id")
                    .ValueGeneratedOnAdd()
                    .HasColumnType("int")
                    .HasColumnName("Id");

                SqlServerPropertyBuilderExtensions.UseIdentityColumn(b.Property<int>("Id"));

                b.Property<string>("Address")
                    .HasColumnType("varchar(50)")
                    .HasColumnName("Address");

                b.Property<string>("Name")
                    .HasColumnType("varchar(50)")
                    .HasColumnName("Name");

                b.HasKey("Id");

                b.ToTable("Emp");
            });
           #pragma warning restore 612, 618
        }
    }
}
