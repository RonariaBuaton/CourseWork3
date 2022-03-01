public class TestClass5026211047 {

	public static void main(String[] args) {

		ComputeMethods5026211047 cn = new ComputeMethods5026211047();

		double celcius = cn.fToC(100);
		System.out.printf("Temp in celsius is %f\n", celcius);

		double hypotenuse = cn.hypotenuse(6,8);
		System.out.println("Hypotenuse is " + hypotenuse);

		int rollDice = cn.roll();
		System.out.println("The sum of the dice values is " + rollDice);
	}

}