package myproject;

public class Officer {
	protected String name;
	protected int age;
	protected String gender;
	protected String address;
	
	public Officer(int age, String name, String gender, String address) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}
	public void showInformation() {
		System.out.print(name+" - "+age+" - "+gender+" - "+address+" - ");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
