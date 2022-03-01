import java.util.Scanner;
public class ProcessAName5026211047{

	public static void main (String [] args){
		Scanner nm = new Scanner (System.in);
			System.out.println("Enter your name:");

		String name = nm.nextLine();
		int indexspace = name.indexOf(' ');
		String firstName = name.substring(0,indexspace);
			System.out.println(firstName.length());

		String lastName = name.substring(indexspace+1);
			System.out.println("Your name is: " + lastName + ", " + firstName.charAt(0) + ".");

	}
}