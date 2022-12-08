import java.util.Random;

public class Internship extends Staff implements IDNumber {
//variables
	protected double IntPay ;
	private String name;
	private String add;
	private int sYear;
	private String city;
	private String state;
	private String pos;
	
	
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
	
	public int getsYear() {
		return sYear;
	}

	public void setsYear(int sYear) {
		this.sYear = sYear;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
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
		int DOG = R.nextInt(1999)+2000;
		int CAT = R.nextInt(549)+150;
		String ID = "COL" + DOG + initials + CAT;
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
		IntPay = (2019-sYear)*(7*365);
		return IntPay;
	}

	@Override
	public String toString() {
		return "Internship: Pay: $" + calculatePay() + " Name: " + name + " City: "
	    + city + " Address: " + add   + " State: " + state + " Start Year: " + sYear + " Position: " + pos + " ID Number: " + genIdNumber();
	}
	public void printInfo() {
		System.out.println(toString());
	}
}
