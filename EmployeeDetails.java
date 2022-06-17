package week1.day2;

public class EmployeeDetails {

	public String printEmpName() {
		String name="varshini";
		return name;
		}
	public int printEmpId() {
		int id=25;
		return id;
	}
	public String getEmpAddress() {
		String address="rs puram";
		return address;
	}
	public double printEmpSalary() {
		double salary=40676.8768;
		return salary;
	}
	public long printEmpMobileNumber() {
		long number=9344767479L;
		return number;
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails obj= new EmployeeDetails();
		
		System.out.println(obj.printEmpName()+"&"+obj.printEmpId());
		System.out.println(obj.getEmpAddress());
		System.out.println(obj.printEmpSalary());
		System.out.println(obj.printEmpMobileNumber());
		
	}
}
