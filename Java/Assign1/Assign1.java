class Assign1 {

	public static void main(String [] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double d = Double.parseDouble(args[3]);
		
		Employee emp = new Employee(a,b,c,d);
		emp.printEmployee();
		System.out.printf("Income =  %.2f%n",emp.getIncome(c,d));  
	}


}
