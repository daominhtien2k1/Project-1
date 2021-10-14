package myproject;

public class Staff extends Officer {
	private String job;
	
	public Staff(int age, String name, String gender, String address, String job) {
		super(age, name, gender, address);
		this.job=job;
	}

	public void showInformation() {
		super.showInformation();
		System.out.print(job+"\n");
	}

}
