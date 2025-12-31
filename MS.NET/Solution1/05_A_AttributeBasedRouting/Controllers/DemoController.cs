using Microsoft.AspNetCore.Mvc;

namespace _05_A_AttributeBasedRouting.Controllers
{
    [Route("admin")]
    public class DemoController : Controller
    {
        [Route("Demo")]
        public IActionResult Index()
        {
            return View("~Views/Demo/Data.cshtml");
        }

        [Route("Greet")]
        public string sayHii()
        {
            return "Hello !!";
        }
    }
}
