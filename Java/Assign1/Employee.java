class Employee {
	
	private int id;
	private int hours;
	private int age;
	private double rate;

	public Employee(int eid, int a, int hrs, double r) {

		id = eid;
		age = a;
		hours = hrs;
		rate = r;
	}

	public void printEmployee() {
		System.out.println("----- EMPLOYEE DETAILS ----- ");
		System.out.printf(" Employee ID = %d%n",id);
		System.out.printf(" Employee Age = %d%n",age);
		System.out.printf(" Number of hours = %d%n",hours);
		System.out.printf(" Rate = %.2f%n",rate);
	}

	public double getIncome(int hrs, double rate) {
		
		return hrs * rate;	
	
	}



}

