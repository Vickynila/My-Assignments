package week3.day1;

public class Students {
	
	public void getStudentInfo(String id) {
		System.out.println("Student ID is : " + id );
	}

	public void getStudentInfo(String id, String name) {
		System.out.println("Student ID is :" + id);
		System.out.println("Student Name is :" + name);
	}

	public void getStudentInfo(String email, long num) {
		System.out.println("Student E-mail is :" + email);
		System.out.println("Student Phone number is:" + num);
	}

	public static void main(String[] args) {
		Students stu = new Students();
		stu.getStudentInfo("1099");
		stu.getStudentInfo("1099", "Vijay");
		stu.getStudentInfo("Vijay@gmail.com", "9600167014");

}
}
