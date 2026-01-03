using Microsoft.AspNetCore.Mvc;

namespace _09_A_TagHelpers.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult GetNewUserDetails(NewUser newuser)
        {
            return View(newuser);
        }
    }
}
