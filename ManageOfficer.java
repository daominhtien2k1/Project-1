package myproject;
import java.util.ArrayList;

public class ManageOfficer {
	private ArrayList<Officer> officers;
	public ManageOfficer() {
		officers=new ArrayList<Officer>();
	}
	public void addOfficer(Officer officer) {
		officers.add(officer);
	}
	public ArrayList<Officer> searchOfficer(String name) {
		ArrayList<Officer> searchOfficer =new ArrayList<Officer>();
		for(Officer x:officers) {
			if(x.getName().equals(name)) {
				searchOfficer.add(x);
			}		
		}
		return searchOfficer;
	}
	public void display() {
		for(Officer x:officers) {
			x.showInformation();
		}
	}
	public void breakProgram() {
		
	}
}
