using Microsoft.AspNetCore.Mvc;

namespace _04_A_ConventionalRouting.Controllers
{
    public class AdminController : Controller
    {
        // URL: /Admin/Index?nm=Hugh Jackman
        public ActionResult <string> Index(string nm)
        {
            return nm;
        }
    }
}
