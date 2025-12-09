package Week2.day1;

public class RemoveDupeWord {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] words=text.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					words[j]=" ";
					count++;
				}
			}
		}
		if(count>1) {
			for(int i=0;i<words.length;i++) {
				System.out.print(words[i]+" ");
			}
		
		}

	}

}
