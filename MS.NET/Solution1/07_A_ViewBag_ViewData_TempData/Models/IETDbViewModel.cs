using Microsoft.AspNetCore.Mvc;

namespace _07_A_ViewBag_ViewData_TempData.Models
{
    public class IETDbViewModel
    {
        public List<Emp> allEmps { get; set; }
        public List<Customer> allCusts { get; set; }
    }
}
