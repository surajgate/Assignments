#include "interest.h"
#include<cstdio>

int main(void)
{
	int period;
	double amount;
	int choice;
	bool type;

	printf("Enter the Principle Amount \n");
	scanf("%lf",&amount);

	printf("Enter the period in years \n");
	scanf("%d",&period);

	Investment a(amount, period);
	//a.investment(amount, period);
	
	printf(" 1. Simple Interest\n 2. Compound Interest \n\n Enter your choice \n");
	scanf("%d",&choice);

	if(choice == 1 )
	{
		type = true ;
	}
	else if(choice == 2)
	{
		type = false;
	}
	else 
	{
		printf("Enter valid choice ");
	}


	printf("Interest = %0.2lf \n",a.GetInterest(type));
}


	




