using Microsoft.AspNetCore.Mvc;

namespace _05_A_AttributeBasedRouting.Controllers
{
    [Route("[controller]")]
    public class DashBoardController1 : Controller
    {
        [Route("[action]")]
        public int GetNumber()
        {
            return 100;
        }

        [Route ("[action]/{Id?}/{nm?}")]
        public string GetSomething(int Id , string nm)
        {
            return $"Id : {Id} , name : {nm}";
        }
    }
}
