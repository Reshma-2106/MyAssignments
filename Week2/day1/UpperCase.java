package Week2.day1;

public class UpperCase {

	public static void main(String[] args) {
		String text = "changeme"; // input String
		for (int i = 0; i < text.length(); i++) { // loop through each char by index
			char ch = text.charAt(i); // get the char from current index
			if (i % 2 == 1) { // condition to check if the index is odd
				System.out.print(Character.toUpperCase(ch)); // convert and print odd index char to upper case
			} else {
				System.out.print(ch); // print the even index as it is
			}
		}
	}
}
