
public class EmployeeInfo {

	 String name;
	 String add;
	 String city;
	 String state;
	
	
	public EmployeeInfo() //empty
	{
		name = "";
		add = "";
		city = "";
		state = "";
		
	}
	
	public EmployeeInfo(String n, String a, String c, String s) //non-empty
	{
		name = n;
		add = a;
		city = c;
		state = s;
		
	}
	//getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//toString
	@Override
	public String toString() {
		return "Name: " + this.name + " Address: " + this.add + " City: " + this.city + " State " + this.state;
	}
	
	
}
