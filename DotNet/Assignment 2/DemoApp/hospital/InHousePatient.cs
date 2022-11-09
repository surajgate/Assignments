namespace hospital;

class InHousePatient : Patient
{
    public double Discount {get; set;}

    public InHousePatient(int PatientId, string PatientName, int BedType, int NoOfdays, double Discount)
    {
        base.PatientId = PatientId;
        base.PatientName = PatientName;
        base.BedType = BedType;
        base.NoOfdays = NoOfdays;
        this.Discount = Discount;        
    }

    public override double GetBillAmount() {
		
        double amount = base.GetBillAmount();
		
        Discount = amount >= 5000 ? 5.0 : 0;
		
		return amount-amount * Discount /100;
	}
}