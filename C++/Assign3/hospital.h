#include <iostream>
#include <string>
using namespace std;
class Patient
{	
	private: int patient_ID;
		 string patient_name;
		 int bed_type;
		 int days;
	
	public:	
		Patient()
		{
			patient_ID = 100;
			patient_name = "Somnath";
			bed_type = 1;
			days = 2;
		}
		 
		~Patient()
		{

		}

		Patient(int patient_ID, string patient_name, int bed_type, int days)
		{
			 
		 	this->patient_ID = patient_ID; 
			this->patient_name = patient_name;
			this->bed_type = bed_type;
			this->days = days;
		}
		
		int Getpatient_ID()
		{
			return patient_ID;
		}

		string Getpatient_name()
		{
			return patient_name;
		}

		int Getbed_type()
		{
			return bed_type;
		}

		int Getdays()
		{
			return days;
		}

		virtual double GetBillAmount()
		{
			double price;
			double amount;

			if(bed_type == 1)
				price = 500;
			if(bed_type == 2)
				price = 350;
			if(bed_type == 3)
				price = 200;
		
			amount = days * price;
			
			return amount;
		
		}
};

class InHousePatient : public Patient 
{
	private:
		double discount;

	public:
		InHousePatient()
		{
			discount = 0.0;
		}

		InHousePatient(int patient_ID, string patient_name, int bed_type, int days, double discount) : Patient(patient_ID, patient_name,bed_type, days)  
		{
			this->discount = discount;
		}
		~InHousePatient()
		{

		}


		double GetBillAmount()
		{
			double amt = Patient::GetBillAmount();
			if(amt >= 5000)
			{
				discount = 5.0;
			}
				
			return amt - amt * discount / 100;
		}
};








		


