class Employee
{
	public:		
			bool set_Employee(unsigned int e, int age, double hr, double r)
			{
					eID = e;
					Age = age;
					Hr = hr;
					rate = r;
			
					return true;
			}

			double GetIncome()
			{
				return Hr * rate;
			}

			Employee()
			{
				eID = 1;
				Age = 21;
				Hr = 8.0;
				rate = 250;
			}
	private:
			int eID, Age;
			double Hr, rate;
};
				



				
				





