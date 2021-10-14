package myproject;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		ManageOfficer manageOfficer=new ManageOfficer();
		showMenu();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Please choose a number: 1-2-3-4");
			int x=sc.nextInt();
			sc.nextLine();
			if(x==1) {
				System.out.println("------Add a new officer------");
				
				System.out.println("Choose the type job of officer: 1.Engineer - 2.Employee - 3.Staff ");
				System.out.println("Type:");
				int type=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Please enter information following: Name-Age-Gender-Address");
				
				System.out.println("Name:");
				String name=sc.next();
				sc.nextLine();
				System.out.println("------Name: "+name+"------");
				
				System.out.println("Age:");
				int age=sc.nextInt();
				sc.nextLine();
				System.out.println("------Age: "+age+"------");
				
				System.out.println("Gender:");
				String gender=sc.next();
				sc.nextLine();
				System.out.println("------Gender: "+gender+"------");
				
				System.out.println("Address:");
				String address=sc.nextLine();
				System.out.println("------Address: "+address+"------");
				
				if(type==1) {
					System.out.println("Training industry ");
					String trainingIndustry=sc.nextLine();
					Officer officer=new Engineer(age, name, gender, address,trainingIndustry);
					manageOfficer.addOfficer(officer);
				}
				else if(type==2) {
					System.out.println("Degree: ");
					int degree=sc.nextInt();
					Officer officer=new Employee(age, name, gender, address,degree);
					manageOfficer.addOfficer(officer);
				}
				else if(type==3) {
					System.out.println("Job: ");
					String job=sc.nextLine();
					Officer officer=new Staff(age, name, gender, address,job);
					manageOfficer.addOfficer(officer);
				}
			}
			else if(x==2) {
				System.out.println("------Search by name------");
				String name=sc.next();
				sc.nextLine();
				ArrayList<Officer> search= manageOfficer.searchOfficer(name);
				for(Officer officer:search) {
					officer.showInformation();
				}
				
			}
			else if(x==3) {
				manageOfficer.display();
			}
			else if(x==4) {
				break;
			}
			
				
		}while(true);
	}

	
	public static void showMenu() {
		System.out.println("Officer Management Application: ");
		System.out.println("1. Add a new officer");
		System.out.println("2. Search by name");
		System.out.println("3. Display the list of officers");
		System.out.println("4. Exit");
		System.out.println("--------------------------------");
	}

}
