package week3.day2;
// multilevel inheritance
public class College {
	public void collegeName() {
		System.out.println("cutn University");
	}
	public void collegeCode() {
		System.out.println("1234");
	}
	public void collegeRank() {
		System.out.println("1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj=new College();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();

	}

}
