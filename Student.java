package week3.day2;

public class Student {
	public void getStudentInfo(int id) {
	System.out.println(id);
	}
	public void getStudentInfo(String name) {
	System.out.println(name);
}
   public void getStudentInfo(String email,long phonenumber) {
	System.out.println(email);
	System.out.println(phonenumber);
}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student ();
		obj.getStudentInfo(1223);
		obj.getStudentInfo("Abirami");
		obj.getStudentInfo("sssabi15@gmail.com,7259943560");


	}

}
