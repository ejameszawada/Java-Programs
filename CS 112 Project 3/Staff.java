

public abstract class Staff {

	public static final int CURRENT_YEAR = 2019;
	EmployeeInfo a = new EmployeeInfo(); //array of 20

	
	public abstract void setPosition(String pos);
	public abstract void setStartYear(int sYear);
	public abstract void addEmployeeInfo(String name, String add, String city, String state, String pos, int sYear);
	
	public void printInfo() {
		System.out.println("The year is currently: " + CURRENT_YEAR);
		System.out.println(a.toString());
		
	}
	public abstract double calculatePay();
	
	
		
}
