#include "loan.h"
#include <iostream>
using namespace std;

double compute(Loan& l, double principle, float period)
{
	return l.EMI(principle, period);
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

	cout << " EMI for Personal Loan = " << compute(a,prin,peri) << endl;
	cout << " EMI for Home Loan = " << compute(b,prin, peri) << endl;


}
	
		
