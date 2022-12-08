import java.util.Random;

public class Hourly extends Staff implements IDNumber{
//variables
	protected double baseHourlyPay;
	private String name;
	private String pos;
	private String add;
	private String city;
	private String state;
	private int sYear;
	
	//setters and getters
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
	
	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public int getsYear() {
		return sYear;
	}

	public void setsYear(int sYear) {
		this.sYear = sYear;
	}


	@Override
	public String genIdNumber() {
		String p = getName();
		String[] tokens = p.split(" ");
		String initials = "";
		for(int i = 0; i < tokens.length; i++) {
			initials += tokens[i].charAt(0);
		}
		Random R = new Random();
		int RTJ = R.nextInt(1999)+2000;
		int HQU = R.nextInt(549)+150;
		String ID = "COL" + RTJ + initials + HQU;
		return ID;
	}
	

	@Override
	public void setPosition(String pos) {
		
	}

	@Override
	public void setStartYear(int sYear) {
		
	}

	@Override
	public void addEmployeeInfo(String name, String add, String city, String state, String pos, int sYear) {
		this.name = name;
		this.add = add;
		this.city = city;
		this.state = state;
		this.pos = pos;
		this.sYear = sYear;
	
	}

	@Override
	public double calculatePay() {
		baseHourlyPay= ((2019 - sYear)*.50 + 15 );
		return baseHourlyPay;
	}
	
	@Override
	public String toString() {
		return "Hourly: Pay: $" + calculatePay() + " Name: " + name + " City: " + city +
				" Address: " + add + " State: " + state + " Start Year: " + sYear + " Position: " + pos + " ID Number: " + genIdNumber();
	}
	
	public void printInfo() {
		System.out.println(toString());
	}
	
	
}
