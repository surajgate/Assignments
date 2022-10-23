#include<cmath>


class Investment 
{
	private:
		int period;
		double amount;

	public:
		Investment()
		{
			amount = 10000;
			period = 3;
		}
		Investment(double amount, int period)
		{

			this->amount = amount;
			this->period = period;
		}


		double GetAmount()
		{
			return amount;
		}
		void SetAmount()
		{
		
			this->amount = amount;
		
		}
		int GetPeriod()
		{
			return period;
		}
		void SetPeriod()
		{
			this->period = period;
		
		}


	//	void SetData(double amount, int period)
	///	{
	///		amount =amount;
	///		period = period;
	///	}
		
		~Investment()
		{

		}

		double InterestRate()
		{
			double rate = 0.0;

			if(amount < 10000)
				rate = 8.0;
		
			if(amount >= 10000 && amount < 50000)
				rate = 9.0;
		
			if(amount >= 50000)
				rate = 10.0;
			
			if(period > 5)
				rate += 1;

			return rate;
		}

		double GetInterest( bool type)
		{
			double interest = 0.0;
			double amt = 0.0;
			double r = InterestRate();

			if(type==1)
			{
				interest = (amount * period * r) / 100;
				return interest;
			}
			
			else 
			{
				amt = amount * (pow((1 + r / 100) , period));
				interest = amt - amount;
								
			 	return interest;
			}


			

		}

		





};





