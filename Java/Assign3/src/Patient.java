package hospital;

public class Patient {
	private int patientId;
	private String patientName;
	private int bedType;
	private int noOfDays;

	public Patient(int pId, String pName, int bed, int days){
		patientId= pId;
		patientName= pName;
		bedType= bed;
		noOfDays= days;
	}
	
	public Patient() {
		this(101, "Sujit", 1, 5);
	}
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int ii){
		patientId= ii;
	}

	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String name){
		patientName= name;
	}

	public int getBedType() {
		return bedType;
	}
	public void setBedType(int bed){
		bedType= bed;
	}

	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int days){
		noOfDays= days;
	}

	public void printEmployee(){
		System.out.printf(" Employee ID : %d%n",patientId);
		System.out.printf(" Employee Name : %s%n",patientName);
		System.out.printf(" Employee Bed Type : %d%n",bedType);
		System.out.printf(" Number of days : %d%n",noOfDays);
	}
	public double getBillAmount(){
		double price= 0;
		double amount;
	if(bedType == 1)
		price = 500;
	if(bedType == 2)
		price =350;
	if(bedType == 3)
		price =200;
	amount = noOfDays *price;
	return amount;
	}

}
