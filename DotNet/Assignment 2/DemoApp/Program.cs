using hospital;

class Program 
{
    public static void Main(string[] args)
    {
        int PatientId = int.Parse(args[0]);
        string PatientName = args[1];
        int BedType = int.Parse(args[2]);
        int NoOfdays = int.Parse(args[3]);
        double Discount = double.Parse(args[4]);   
    
        var p = new Patient(PatientId, PatientName, BedType, NoOfdays);
        var s = new InHousePatient(PatientId, PatientName, BedType, NoOfdays,Discount);

        Console.WriteLine("\nPatient Id = {0}",PatientId);
        Console.WriteLine("Patient Name = {0}",PatientName);
        Console.WriteLine("Bed Type = {0}",BedType);
        Console.WriteLine("Number Of Days = {0}\n",NoOfdays);

        Console.WriteLine("Amount Before Discount = {0}",p.GetBillAmount());
        Console.WriteLine("Amount After Discount = {0}",s.GetBillAmount());    
    }
}