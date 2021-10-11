package a1;

import java.util.ArrayList;
import java.util.Scanner;


//This is created with help of Registration class as every citizen is registered in our case (composition type relation) 
//addNameToVaccinated-->it adds name,type of vaccine,increments dose,day to the static arrays
//nextDueDate-->calculates next due date
//checkVaccinationStatus
public class Citizen{
	String citizen_name;
	int age;
	String  unique_id;
	
	Register Reg = new Register();
	
	static ArrayList<String> name_array = new ArrayList<>();         
	static ArrayList<Integer> age_array = new ArrayList<>();	    
	static ArrayList<String> id_array = new ArrayList<>();		   
	
	static ArrayList<String> vaccinated_citizens = new ArrayList<>();
	static ArrayList<String> typeOfVaccination = new ArrayList<>(); 
	static ArrayList<Integer> numberofdoses = new ArrayList<>();
	static ArrayList<Integer> dayOfVaccination = new ArrayList<>();
	
	
	public Citizen(){
		
	}
	
	public Citizen(String citizen_name,int age,	String  unique_id) {
		this.citizen_name=citizen_name;
		this.age=age;
		this.unique_id=unique_id;
		
		if( this.age < 18 ) {
			System.out.println("You are not eligible for registeration");
		}
		else {

			name_array.add(citizen_name);
			age_array.add(age);
			id_array.add(unique_id);
			}

		
		
	
	}
	Scanner scn = new Scanner(System.in);
	public void  print_Information(){
		
		 System.out.println("Name:"+this.citizen_name+",Age:"+this.age+",Unique ID "+this.unique_id);

	}
	public void addNameToVaccinated(String name,String vaccine_name,int day) {
		if(vaccinated_citizens.contains(name)==false) {
			vaccinated_citizens.add(name);
			typeOfVaccination.add(vaccine_name);
			dayOfVaccination.add(day);
			Citizen.numberofdoses.add(1);
		}
		else {
			int idx = Citizen.vaccinated_citizens.indexOf(name);
			dayOfVaccination.set(idx,day);
			int dose = Citizen.numberofdoses.get(idx)+1;
    		Citizen.numberofdoses.set(idx,dose);
		}
		
	}

	
	public int nextDueDate(String name,String vaccine_name){
		if(Citizen.vaccinated_citizens.contains(name)) {
			int prevdate = dayOfVaccination.get(vaccinated_citizens.indexOf(name));
			int reqGap  = Vaccine.gaps.get(Vaccine.vaccines.indexOf(vaccine_name));
			return prevdate+reqGap;
		}else {
			return -1;
		}
		
	}
	public void checkVaccinationStatus() {
		System.out.print("Enter patient Unique ID:");
		   String patientuniqueid = scn.next();
		   // first look up for id and identify name and then look into vaccinated people >> citizen class to know vaccination status
		   Citizen c1 = new Citizen();
		   String nameOfPerson =Citizen.name_array.get(Citizen.id_array.indexOf(patientuniqueid));
	  
		   if(Citizen.vaccinated_citizens.contains(nameOfPerson)==false) { //name not in vaccinated people
			   System.out.println("Registered!!");
		   }
		   
		   else {
			   
			   int idx = Citizen.vaccinated_citizens.indexOf(nameOfPerson);
			   String vaccine_given = Citizen.typeOfVaccination.get(idx);
	
			   int dosesGiven = Citizen.numberofdoses.get(idx);
			   
			   int requiredDoses =  Vaccine.doses.get(Vaccine.vaccines.indexOf(vaccine_given));
			   
			   if(dosesGiven==requiredDoses) {
				   System.out.println("FULLY VACCINATED!!");
				   System.out.println("Vaccine Given: "+vaccine_given);
				   System.out.println("Number of Doses given: "+dosesGiven);
				   
			   }
			   else {
				   System.out.println("PARTIALLY VACCINATED!!");
				   System.out.println("Vaccine Given: "+vaccine_given);
 			       System.out.println("Number of Doses given: "+dosesGiven);
 			       System.out.println("Next Dose due date :"+c1.nextDueDate(nameOfPerson, vaccine_given));
			   }
			   
			   
			   
			   
			  
		   }
	 }
	
	
}
