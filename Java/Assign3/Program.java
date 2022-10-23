import hospital.Patient;

class Program {
	 public static void main (String[] args) {
		 Patient p = new Patient();
		 p.setPatientId(101);
		 p.setPatientName("Sujit");
		 p.setBedType(1);
		 p.setNoOfDays(20);

		 var inp = new hospital.InhousePatient(101, "sujit", 1, 20, 5.0);
		 p.printEmployee();
		 System.out.printf("Amount after discount is %.2f%n", p.getBillAmount());

		 System.out.printf("Amount after discount is %.2f%n", inp.getBillAmount());
	 }
}
