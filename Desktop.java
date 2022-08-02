package week3.day2;
//single inheritance
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktop size");
		
	}
	public static void main(String[] args) {
		Desktop obj= new Desktop();
		obj.computerModel();
		obj.desktopSize();

}
}
