package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("My Desktop Size is 32 inches");
	}

	
	public static void main(String[] args) {
		
		Desktop dp=new Desktop();
		dp.computerModel();
		dp.desktopSize();
	}
}
