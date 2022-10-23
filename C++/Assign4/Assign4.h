#include<iostream>

class Loan
{		
	public:	
		virtual float GetRate()=0;
		
		double EMI(double principle, float period)
		{
			double EMI;

			EMI = principle * ( 1 + GetRate() * period / 100 ) / ( 12 * period );
			return EMI;
		}
	
/*	private:
		double principle;
		float period;
*/
};

class Personal : public Loan
{
	private:
		double principle;
		float period;
	
	public:
		float GetRate()
		{
			float rate;
			
			if(0 > principle < 500000)
				rate = 15;
			else 
				rate = 16;
			
			return rate;
		}

		Personal(double principle, float period)
		{
			this->principle = principle;
			this->period = period;
		}



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
};

class Home : public Loan
{
	private:
		double principle;
		float period;
	
	public:
		float GetRate()
		{
			float rate;
			
			if(0 > principle < 2000000)
				rate = 10;
			else 
				rate = 11;
			
			return rate;
		}
		
		Home(double principle, float period)
		{
			this->principle = principle;
			this->period = period;
		}
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

};
		




