namespace _02_A_EmptyTemplate
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();

            // Middlewares
            #region app.Map- GET , POST, PUT, DELETE
            //app.MapGet("/",()=> "Hello World !");
            //app.MapGet("/a", () => "Hello Amol!");
            //app.MapPost("/", () => "Post Method");
            //app.MapPost("/p", () => "Post Method 1");
            //app.MapPut("/", () => "Put Method");
            //app.MapDelete("/", () => "Delete Method");

            #endregion

            #region app.Run() can not pass http context reference to next app.Run() method .

            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync("Hello Amol");
            //    await context.Response.WriteAsync("\nHow are you");
            //});

            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync("\nBye Amol");
            //});
            #endregion

            app.Use(async (context,next) =>
            {
                await context.Response.WriteAsync("Amol Yenge");
                await context.Response.WriteAsync("\nI am from Latur");
                next(context);
            });

            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("\nLiving in Pune");
                next(context);
                await context.Response.WriteAsync("\n To Study");
            });

            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("\nThis is Last .........");
            });


            app.Run();
        }
    }
}
