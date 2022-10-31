#include "Assign5.h"
#include <iostream>
using namespace std;

double compute(Loan* l)
{
	return l->EMI();
}

double taxcompute(Loan* l)
{	
	double rate;

	auto tax = dynamic_cast<Taxable*>(l);
	auto tax1 = dynamic_cast<Discountable*>(l);
	if(tax)
		rate = tax->GST();
	
	if(tax1)	
		rate = tax1->Discount();

	return l->EMI() * rate;

}

int main(void)
{	
	double prin;
	float peri;


	cout << " Enter the Principle Amount :";
       	cin >> prin;

	cout << " Enter the Period :";
	cin >> peri;
	
	Personal a(prin, peri);
	Home b(prin, peri);

	cout << " EMI for Personal Loan = " << compute(&a) << endl;
	cout << " EMI for Home Loan = " << compute(&b) << endl << endl;

	cout << " EMI for Personal Loan With GST = " << taxcompute(&a) << endl;
	cout << " EMI for Home Loan With Discount  = " << taxcompute(&b) << endl;

}
	
		
