//this is a demo app that illustrates the association in JAVA
// I tried...
//Company has employee
//Company has address
//employee has education

public class AssociationApp {
	public static void main(String[] args) {
		Education ed=new Education(true,false,false);
		Address addr=new Address("Jarvis","Toronto","Canada");
		Employee emp=new Employee("Subarna",123,ed);
		Company comp=new Company("Something JAVA",addr,emp);
		
		System.out.println("Company Information");
		System.out.println(comp.companyName+" Technologies");
		System.out.println(comp.compAdd.streetName+" Street");
		System.out.println(comp.compAdd.city);
		System.out.println(comp.compAdd.country);
		
		
		System.out.println("\nEmployee Information");
		System.out.println("Employee ID: "+emp.empID);
		System.out.println("Employee Name: "+emp.empName);
		System.out.println("Has Bachelors deree? "+emp.edu.bachelors);
		System.out.println("Has Masters degree? "+emp.edu.masters);
		System.out.println("Has trade certifications? "+emp.edu.trade);
		
		

	}
}
