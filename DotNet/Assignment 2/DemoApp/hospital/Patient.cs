namespace hospital;

class Patient
{
    public int PatientId { get; set;}
    public string PatientName { get; set;}
    public int BedType { get; set;}
    public int NoOfdays { get; set;}

    public Patient()
    {
        this.PatientId = 1;
        this.PatientName = "Sujit";
        this.BedType = 1;
        this.NoOfdays = 5;
	}
   public Patient(int PatientId, string PatientName, int BedType, int NoOfdays)
   {
        this.PatientId = PatientId;
        this.PatientName = PatientName;
        this.BedType = BedType;
        this.NoOfdays = NoOfdays;
   } 

   	public virtual double GetBillAmount(){
		double price= 0;
		double amount;
	if(BedType == 1)
		price = 500;
	if(BedType == 2)
		price =350;
	if(BedType == 3)
		price =200;
	amount = NoOfdays *price;
	return amount;
	}
    


}