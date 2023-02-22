package week5.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student id is "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is "+id+ "and name is "+name);
	}
	public void getStudentInfo(int id, String name, String email, long phoneNumber) {
		System.out.println("Student id is "+id+ ", name is "+name+ ", email is "+email+ "and phone number is "+phoneNumber);
	}
	public static void main(String[] args) {
		Students details=new Students();
		details.getStudentInfo(41140);
		details.getStudentInfo(41140, "Bharath");
		details.getStudentInfo(41140, "Bharath", "bharath0802@gmail.com", 9123456708l);
	}
}
