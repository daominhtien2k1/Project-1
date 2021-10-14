package myproject;

public class Employee extends Officer{
	private int degree;
	
	public Employee(int age, String name, String gender, String address,int degree) {
		super(age, name, gender, address);
		this.degree=degree;
	}

	public void showInformation() {
		super.showInformation();
		System.out.print(degree+"\n");
	}

}
