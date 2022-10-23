#include "money.h"
#include <cstdio>
int main(void)
{
	int r, p;
	printf("First Money : ");
	scanf("%d%d", &r, &p);
	Money a(r, p);
	printf("Second Money: ");
	scanf("%d%d", &r, &p);
	Money b(r, p);
	Money c = a + b;
	Money d = a - b;
	printf("Total Money = ");
	c.Print();

	printf("Total Money = ");
	d.Print();

}
