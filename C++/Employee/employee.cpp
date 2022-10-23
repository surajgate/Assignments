#include "employee.h"
#include <cstdio>

double GetGrossAnnualIncome(Employee info)
{	
	double GrossIncome;

	GrossIncome = info.GetIncome() * 12 + 0.20 * info.GetIncome() * 12 ;
	return GrossIncome;
}

int main(void)
{
	Employee a;
	unsigned int x;
	int y;
	double HR,RATE;

	printf("Enter Employee ID :\n ");
	scanf("%u",&x);

	printf("Enter age of the Employee :\n");
	scanf("%d",&y);

	printf("Enter the number of hours :\n");
	scanf("%lf",&HR);

	printf("Enter th rate :\n");
	scanf("%lf",&RATE);

	a.set_Employee(x,y,HR,RATE);

	printf("Annual Gross Income of Employee is : %0.2lf \n",GetGrossAnnualIncome(a));

}

