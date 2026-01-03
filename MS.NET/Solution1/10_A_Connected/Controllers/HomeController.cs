using System.Diagnostics;
using _10_A_Connected.Models;
using Microsoft.AspNetCore.Mvc;

namespace _10_A_Connected.Controllers
{
    // Buissness Logic Layer
    public class HomeController : Controller
    {
        private readonly IETDbContext _DbContext;

        public HomeController(IETDbContext context)
        {
            _DbContext = context;
        }

        public IActionResult Index()
        {
            var allEmps = _DbContext.GetAllEmps();
            return View(allEmps);
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
