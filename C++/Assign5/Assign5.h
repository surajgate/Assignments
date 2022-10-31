#include<iostream>

class Loan
{		
	public:	
		virtual float GetRate()=0;
		
		double GetPrinciple()
		{
			return principle;
		}

		void SetPrinciple(double principle)
		{
			this->principle = principle;
		}

		float GetPeriod()
		{
			return period;
		}

		void SetPeriod(float period)
		{
			this->period = period;
		}
		double EMI()
		{
			double EMI;

			EMI = principle * ( 1 + GetRate() * period / 100 ) / ( 12 * period );
			return EMI;
		}
	
	private:
		double principle;
		float period;

};

class Taxable 
{
	public:
	       double GST()
	       {
			return 1.18;
	       }	       
			
};

class Discountable 
{
	public: 
		double Discount()
		{
			return 0.95;
		}
};

class Personal : public Loan, public Taxable
{
	
	public:
		float GetRate()
		{
			float rate;
			
			if(GetPrinciple() < 500000)
				rate = 15;
			else 
				rate = 16;
			
			return rate;
		}

		Personal(double principle, float period)
		{
			SetPrinciple(principle);
			SetPeriod(period);
		}



};

class Home : public Loan, public Discountable
{
	public:
		float GetRate()
		{
			float rate;
			
			if(GetPrinciple() < 2000000)
				rate = 10;
			else 
				rate = 11;
			
			return rate;
		}
		
		Home(double principle, float period)
		{
			SetPrinciple(principle);
			SetPeriod(period);
		}

};
		



