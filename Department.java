package week3.day2;
//Multilevel inheritance
public class Department  extends College{
	public void deptName() {
		System.out.println("Maths");
	}
	public void collegeName() {
		System.out.println("Cutn university");
	}
	public void collegeCode() {
		System.out.println("1234");
	}

	public void collegeRank() {
		System.out.println("1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj=new Department();
		obj.deptName();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		

	}

}
