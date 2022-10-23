#include <cstdio>
class Money
{
public:
	Money(int rup,int pai)
	{
		rupees = rup + pai / 100;
		paise = pai % 100;
		#ifdef TESTING
		puts("Money instance initialized");
		#endif
	}

	Money(const Money& source)
	{
		rupees = source.rupees;
		paise = source.paise;
		#ifdef TESTING
		puts("Money instance copy initialized");
		#endif
	}
	
	int Amount() const
	{
		return 100 * rupees + paise;
	}

	void Print() const
	{
		printf("%d.%02d\n", rupees, paise);
	}

	Money operator+(const Money& rhs) const
	{
		return Money(rupees + rhs.rupees, paise + rhs.paise);
	}

	Money operator-(const Money& rhs) const
	{
		return Money(rupees - rhs.rupees, paise - rhs.paise);
	}

	~Money()
	{
		#ifdef TESTING
		puts("Money instance finalized");
		#endif
	}
private:
	int rupees;
	int paise;
};

