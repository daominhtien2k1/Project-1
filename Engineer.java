package myproject;

public class Engineer extends Officer {
	private String trainingIndustry;
	
	public Engineer(int age, String name, String gender, String address,String trainingIndustry) {
		super(age, name, gender, address);
		this.trainingIndustry=trainingIndustry;
	}

	public void showInformation() {
		super.showInformation();
		System.out.print(trainingIndustry+"\n");
	}
}
