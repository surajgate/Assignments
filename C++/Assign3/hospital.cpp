#include "hospital.h"
#include <iostream>
using namespace std;

double GST(Patient& p)
{
	double amount;
	amount = p.GetBillAmount() * 1.18;
	return amount;
}

int main(void)
{
	int patient_ID;
	string patient_name;
	int bedtype;
	int days;
	int choice;
	double discount;
	double amount;
	
	cout << " Enter Patient ID : ";
        cin >> patient_ID;

	cout << " Enter Patient Name :";
	cin >> patient_name;

	cout << " Enter bed type : ";
        cin >> bedtype;

	cout << " Enter number of days : ";
        cin >> days;

	Patient a(patient_ID, patient_name, bedtype, days);

	cout << endl << " Amount = " << a.GetBillAmount() << endl;
	cout <<" Total Amount after GST :" << GST(a)<< endl<<endl;

	cout << " Is patient Employee of Hospital" << endl << " Press 1 for Yes\t ";
	cin >> choice;

	cout << endl << " Enter percent for discount ";
	cin >> discount;


	
	InHousePatient b(patient_ID, patient_name, bedtype, days, discount);
	if(choice == 1 ) 
	{
		cout<< endl << " Amount after Discount = " << b.GetBillAmount() << endl;
	}

	cout << " Total Amount after GST " << GST(b) << endl;




}
