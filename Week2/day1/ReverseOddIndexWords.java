package Week2.day1;

public class ReverseOddIndexWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		//split the words and store in array
		String[] words = test.split(" ");
		//Traverse through each word
		for (int i = 0; i < words.length; i++) {
			//find the odd index
			if (i % 2 == 1) {
				//Convert the word into character array
				char[] ch = words[i].toCharArray();
				//reverse using loop
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j]);
				}
				
			}else {
				//Print even position words directly
				 System.out.print(words[i]);
			}
			//Print space between words
			 System.out.print(" ");
		}

	}

}

