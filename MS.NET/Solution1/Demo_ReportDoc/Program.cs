namespace Demo_ReportDoc
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Enter your choice: 1. PDF, 2. DOCX, 3. Excel, 4. XML, 5. JSON");
                int choice = Convert.ToInt32(Console.ReadLine());

                ReportFactory factory = new ReportFactory();
                Report report = factory.GetSomeReport(choice);
                report.GenerateReport();

                Console.WriteLine("Do you want to continue? 'y/n'");
                string ynChoice = Console.ReadLine();

                if (ynChoice == "n")
                {
                    break;
                }
            }
        }
    }

    public abstract class Report
    {
        protected abstract void Parse();
        protected abstract void Validate();
        protected abstract void Save();
        public virtual void GenerateReport()
        {
            Parse();
            Validate();
            Save();
            Console.WriteLine("Report Generated..");
        }
    }

    public abstract class SpecialReport : Report
    {
        protected abstract void ReValidate();
        public override void GenerateReport()
        {
            Parse();
            Validate();
            ReValidate();
            Save();
            Console.WriteLine("New Special Report Generated..");
        }
    }

    public class ReportFactory
    {
        public Report GetSomeReport(int choice)
        {
            Report someReport = null;
            switch (choice)
            {
                case 1:
                    someReport = new PDF();
                    break;
                case 2:
                    someReport = new DOCx();
                    break;
                case 3:
                    someReport = new EXCEL();
                    break;
                case 4:
                    someReport = new XML();
                    break;
                case 5:
                    someReport = new JSON();
                    break;
                default:
                    someReport = null;
                    break;
            }
            return someReport;
        }
    }

    public class XML : SpecialReport
    {
        protected override void Parse()
        {
            Console.WriteLine("XML Parsed");
        }

        protected override void ReValidate()
        {
            Console.WriteLine("XML REValidated");
        }

        protected override void Save()
        {
            Console.WriteLine("XML Saved");
        }

        protected override void Validate()
        {
            Console.WriteLine("XML Validated");
        }
    }

    public class JSON : SpecialReport
    {
        protected override void Parse()
        {
            Console.WriteLine("JSON Parsed");
        }

        protected override void ReValidate()
        {
            Console.WriteLine("JSON ReValidated");
        }

        protected override void Save()
        {
            Console.WriteLine("JSON Saved");
        }

        protected override void Validate()
        {
            Console.WriteLine("JSON Validated");
        }
    }

    public class PDF : Report
    {
        protected override void Parse()
        {
            Console.WriteLine("PDF Parsed");
        }

        protected override void Save()
        {
            Console.WriteLine("PDF Saved");
        }

        protected override void Validate()
        {
            Console.WriteLine("PDF Validated");
        }
    }

    public class EXCEL : Report
    {
        protected override void Parse()
        {
            Console.WriteLine("EXCEL Parsed");
        }

        protected override void Save()
        {
            Console.WriteLine("EXCEL Saved");
        }

        protected override void Validate()
        {
            Console.WriteLine("EXCEL Validated");
        }
    }

    public class DOCx : Report
    {
        protected override void Parse()
        {
            Console.WriteLine("DOCx Parsed");
        }

        protected override void Save()
        {
            Console.WriteLine("DOCx Saved");
        }

        protected override void Validate()
        {
            Console.WriteLine("DOCx Validated");
        }
    }
}

