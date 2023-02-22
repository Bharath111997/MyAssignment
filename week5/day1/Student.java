package week5.day1;

public class Student extends Department {
	public static void main(String[] args) {
		Student std=new Student();
		std.collegeName("A.M.Jain");
		std.collegeCode(1906);
		std.collegeRank(15);
		std.deptName("BCA");
		std.studentName("Bharath");
		std.studentDept("Computer Application");
		std.studentId(333);
		
					}
	public void studentName(String name) {
		System.out.println("Student name is "+name);
	}
	public void studentDept(String name) {
		System.out.println("Student department is "+name);
	}
	public void studentId(int id) {
		System.out.println("Student id is "+id);
	}
	
		
	}

