using System.ComponentModel.DataAnnotations.Schema;

namespace Demo_EmpLib
{
    [Table("Employee")]
    public class Emp
    {
        private string _Address;

        [Column("EId", TypeName = "int")]
        public int Id { get; set; }

        [Column("EName", TypeName = "varchar(50)")]
        public string Name { get; set; }

        [Column("EAddress", TypeName = "varchar(50)")]
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }
    }
}
