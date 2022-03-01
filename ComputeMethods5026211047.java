import java.util.Random;
public class ComputeMethods5026211047 {

	public double fToC(double degreesF) {
		return (5.0/ 9) * (degreesF - 32);
	}

	public double hypotenuse(int a, int b) {
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
	}

	public int roll() {

		Random random = new Random();

		int dice1 = random.nextInt(6) + 1;
		int dice2 = random.nextInt(6) + 2;

		return dice1 + dice2;
	}
}