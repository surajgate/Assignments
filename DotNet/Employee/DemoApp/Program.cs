
    int a = int.Parse(args[0]);
	int b = int.Parse(args[1]);
    int c = int.Parse(args[2]);
    double d=  double.Parse(args[3]);
    Employee emp= new Employee(a, b, c, d);
    Console.WriteLine("----- EMPLOYEE DETAILS ----- ");
	Console.WriteLine(" Employee ID = {0}",a);
    Console.WriteLine(" Employee Age = {0}",b);
	Console.WriteLine(" Number of hours ={0}",c);
    Console.WriteLine(" Rate = {0}",d);
    Console.WriteLine("---------------------------");
    Console.WriteLine("Income =  {0}",emp.GetNetIncome(c,d));
