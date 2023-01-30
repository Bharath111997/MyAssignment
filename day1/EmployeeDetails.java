package week2.day1;

public class EmployeeDetails {
	public void printEmployeeName (String empName , int empId) {
		System.out.println("EMPLOYEE NAME          -  "+ empName+     "   &   EMPLOYEE ID  -  "+ empId);
	}
	
     public void getEmployeeAddress (String empAddress) {
    	 System.out.println("EMPLOYEE ADDRESS       - "+ empAddress);
     }
     
     public void printEmployeeSalary (double empSalary) {
    	 System.out.println("EMPLOYEE SALARY        -"+ empSalary);
     }
     
     public void printEmployeeMobileNumber (long empMobNum) {
    	 System.out.println("EMPLOYEE MOBILE NUMBER -"+  empMobNum);
     }
     
public static void main(String[] args) {
	EmployeeDetails employee=new EmployeeDetails ();
	employee.printEmployeeName("BHARATH", 41140);
	employee.getEmployeeAddress("CHENNAI");
	employee.printEmployeeSalary(35.200);
	employee.printEmployeeMobileNumber(6380687835l);
}
	
	

}
