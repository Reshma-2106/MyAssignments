package Week2.day1;

public class ReverseOddIndexWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i % 2 == 1) {
				char[] ch = words[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j]);
				}
				
			}else {
				 System.out.print(words[i]);
			}
			 System.out.print(" ");
		}

	}

}
