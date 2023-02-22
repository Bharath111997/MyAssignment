package week5.day1;

public class Desktop extends Computer {
	
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computerModel("Lenovo");
		desk.desktopSize(16);
	}
	public void desktopSize(int size) {
		System.out.println("Desktop size is "+size+" inch.");
	}

}
