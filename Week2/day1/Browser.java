package Week2.day1;

public class Browser {
	 public String launchBrowser(String Chrome) {
		 System.out.println(Chrome + "is my browser");
		return Chrome;
	}
	 public void loadUrl() {
		 System.out.println("url loaded successfully");
	}

	public static void main(String[] args) {
		Browser b = new Browser();
		b.launchBrowser("Chrome");
		b.loadUrl();

	}

}