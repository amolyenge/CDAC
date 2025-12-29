using System.Collections.Specialized;

namespace Observer_Pattern
{
    public delegate void NotifyEventHandler(string message);
    internal class Program
    {
        static void Main(string[] args)
        {
            Publisher publisher = new Publisher();
            Subscriber subscriber = new Subscriber();

            publisher.Notify += subscriber.MethodA;
            publisher.Notify += subscriber.MethodB;

            publisher.NotifySubscribers("Hello Sale is Up get 50% OFF");

            publisher.Notify -= subscriber.MethodB;

            publisher.NotifySubscribers("Sale is Agian live for Electronics");

        }
    }

 
    public class Subscriber
    {
        public void MethodA(string message)
        {
            Console.WriteLine($"MethodA recieved {message} via sms");
        }

        public void MethodB(string message)
        {
            Console.WriteLine($"MethodB recieved {message} via mail");
        }
    }

    public class Publisher
    {
        public event NotifyEventHandler Notify;
        public void NotifySubscribers(string message)
        {
            Notify?.Invoke(message);
        }
    }
}
