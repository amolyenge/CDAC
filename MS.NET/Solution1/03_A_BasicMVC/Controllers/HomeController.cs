using Microsoft.AspNetCore.Mvc;

namespace _03_A_BasicMVC.Controllers
{
    // home
    public class HomeController : Controller
    {
        // action method
        public IActionResult Index()
        {
            return View();
        }
    }
}
