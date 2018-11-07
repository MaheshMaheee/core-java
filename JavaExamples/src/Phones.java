class Mobiles {
	// instance varible
	String model = "iphoneX";
	String color = "Grey";
	String capacity = "128gb";
	int year = 2017;
	// static varible

	static String companyName = "Apple";

	void info() // instance method
	{
		System.out.println("new phone=" + model);
		System.out.println("phone color=" + color);
		System.out.println("phone memory=" + capacity);
		System.out.println("year of make=" + year);
	}

	void deatiles() {
		String operativeSystem = "IOS 12";
		System.out.println("Latest Version:" + operativeSystem);
	}

	public static void main(String[] args) {
		Mobiles m = new Mobiles();
		m.info();
		m.deatiles();
		System.out.println("Phone Make=" + Mobiles.companyName);

	}
}
