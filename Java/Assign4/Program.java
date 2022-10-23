import banner.*;

class Program {

	public static double bannerPrice(Banner info, int copies) {
		float rate = copies < 5 ? 0.8f : 0.75f;

		return copies * rate * info.area();
	}

	
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);

		Banner a = new Banner(20,15);

		Curvedbanner b = new Curvedbanner(20,15,0.1f);

		System.out.printf("Total price for regular banner = %.2f%n",Program.bannerPrice(a,n));

		System.out.printf("Total price for regular banner = %.2f%n",Program.bannerPrice(b,n));
	}

}	
