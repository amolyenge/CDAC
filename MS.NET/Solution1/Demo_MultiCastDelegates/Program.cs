namespace Demo_MultiCastDelegates
{
    public delegate void MyEventHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Is Guest arrived?");
            string isGuestArrived = Console.ReadLine();
            CollegeAnnualEvent obj = new CollegeAnnualEvent();
            MyEventHandler handler = obj.WelCome;

            handler += obj.WelSpeech;

            if(isGuestArrived == "y")
            {
                handler += obj.GuestSpeech;
            }
            else
            {
                handler -= obj.GuestSpeech;
            }

            handler += obj.Dance;
            handler += obj.Dinner;
            handler += obj.GoodBye;
            handler += obj.EndEvent;

            handler();
        }
    }

    public class CollegeAnnualEvent
    {
        public void WelCome()
        {
            Console.WriteLine("Welcome Everyone!!");
        }
        public void WelSpeech()
        {
            Console.WriteLine("Host: Speech");
        }
        public void GuestSpeech()
        {
            Console.WriteLine("Guest: Speech");
        }
        public void Dance()
        {
            Console.WriteLine("Lets Dance !");
        }
        public void Dinner()
        {
            Console.WriteLine("Have a Dinner .");
        }
        public void GoodBye()
        {
            Console.WriteLine("Bye bye..");
        }
        public void EndEvent()
        {
            Console.WriteLine("Pack UP...!!");
        }
    }
}
