using Microsoft.AspNetCore.Mvc;

namespace _04_A_ConventionalRouting.Controllers
{
    public class DemoController1 : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
