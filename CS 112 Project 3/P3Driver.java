//assisted by Nick Grovich, Joseph To, and Michael Waldo
public class P3Driver {

	public static void main(String[] args) {
		
		Staff [] Employees = new Staff [7];
		//welcome
		System.out.println("Welcome to Colonel Coding!");
		System.out.println();
	
		
		//hard coded info
		Employees[0] = new Salaried();
		Employees[0].addEmployeeInfo("Ethan Zawada", "226 Sycamore Ln", "Madison", "MS", "CEO", 2012);
		Employees[1] = new Salaried();
		Employees[1].addEmployeeInfo("Zach Zawada", "226 Sycamore Ln", "Madison", "MS", "Manager", 2010);
		Employees[2] = new Salaried();
		Employees[2].addEmployeeInfo("Enzo Zawada", "226 Sycamore Ln", "Madison", "MS", "Manager", 2017);
		Employees[3] = new Hourly();
		Employees[3].addEmployeeInfo("Tyler Gray", "567 Blackwood Dr", "Oxford", "MS", "Janitor", 2006);
		Employees[4] = new Hourly();
		Employees[4].addEmployeeInfo("Joseph Barrow", "983 Indigo Rd", "Atlanta", "GA", "Cashier", 2009);
		Employees[5] = new Hourly();
		Employees[5].addEmployeeInfo("Patrick Saliba", "342 Blackwater St", "New Orleans", "LA", "Lifeguard", 2013);
		Employees[6] = new Internship();
		Employees[6].addEmployeeInfo("Jack Dellinger", "827 Angelwood Dr", "Los Angeles", "CA", "Intern", 2017);
	
		for( int i = 0; i < 7; i++) {
			Employees[i].printInfo();
		}

		//goodbye
		System.out.println();
		System.out.println("Thank you for visiting!");
		
	}

}
