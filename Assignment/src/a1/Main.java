package a1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
      
       
       System.out.println("CoWin Portal initialized...");
       while(true){
    	   System.out.println("----------------------------------");
    	   System.out.println("1. Add Vaccine");
    	   System.out.println("2. Register Hospital");
    	   System.out.println("3. Register Citizen");
    	   System.out.println("4. Add Slot for Vaccination");
    	   System.out.println("5. Book Slot for Vaccination");
    	   System.out.println("6. List all slots for a hospital");
    	   System.out.println("7. Check Vaccination Status ");
    	   System.out.println("8. Exit");
    	   System.out.println("----------------------------------");
    	   
    	   System.out.print("Menu option:");
    	   String input = scn.next();
    	   
    	   if(input.equals("8")){
    		   System.out.print("exitting!!");
    		   break;
    	   }
    	   
    	   
    	   
    	   if(input.equals("1")){
    		   Vaccine v = new Vaccine();
    		   v.addVaccine();
    		  
  	   }
    	   
    	   
    	   
    	   if(input.equals("2")) {
    		   Register reg = new Register();
    		   reg.registerHospital();
    		   }
    	   
    	   
    	   
    	   if(input.equals("3")) {
    		  Register reg = new Register();
    		  reg.registerCitizen();
    		 
    	   }
    	   
    	   
    	   if(input.equals("4")) {
    		   Slots s = new Slots();
    		   s.addSlots();
    	   }
    	   
    	   
    	   
    	   
    	   if(input.equals("5")){
    		   Slots s = new Slots();
    		   s.bookSlots();  
    	   }
    		   
    		   
    		   
    	   if(input.equals("6")) {
    		  Slots s = new Slots();
    		  s.listSlots();
 			  
    		   
    	   }
    	   
    	   
    	   
    	   
    	   
    	   if(input.equals("7")) {
    		   
    		   Citizen c1 = new Citizen();
    		   c1.checkVaccinationStatus();  
    	   }
    	     
       }
   } 
}

//class Slots{
//	int hospital_id;
//	//int no_of_slots;
//	int day_number;
//	int quantity;
//	
//	
//	//need to create a data structure to store objects(idea might create an array with ids no not ids they are created already in hospital)
//	 static ArrayList<Integer> slots_hospitals_id = new ArrayList<>();  //will store ids and may be used to map with doses available
//	// static ArrayList<Integer> NumberOfSlots = new ArrayList<>();  //will
//	 static ArrayList<Integer> dayNumber = new ArrayList<>();  //will
//	 static ArrayList<Integer> quantities = new ArrayList<>();  //will
//	 static ArrayList<Integer> selectedNumber = new ArrayList<>();  //will
//	 static ArrayList<String> vaccineType = new ArrayList<>();
//	 
//	 Slots(){}
//	 Slots(int hospital_id,int day_number,int quantity){
//		this.hospital_id=hospital_id;
//		//this.no_of_slots=no_of_slots;
//		this.day_number=day_number;
//		this.quantity=quantity;
//		ArrayList<String> names = Vaccine.vaccines;
//		for(int i=0;i<names.size();i++) {
//			 System.out.println(i+". "+names.get(i));
//		}
//		slots_hospitals_id.add(hospital_id);
//		//NumberOfSlots.add(no_of_slots);
//		dayNumber.add(day_number);
//		quantities.add(quantity);
//		//need to show vaccine types availables
//	
//	}
//	Scanner scn = new Scanner(System.in);
//	public void addSlots() {
//		   
//	       System.out.print("Enter Hospital ID: ");//need to check if this exists
//		   int id = scn.nextInt();
//		   
//		  
//		   
//		   if((Hospital.Ids).contains(id)==false) {
//			   System.out.println("Incorrect Hospital Id!!!");
//		   }
//		   
//		   else {
//			   
//			   System.out.print("Enter number of Slots to be added:");//need to check that slots are not outnumbered 
//  		       int  slots = scn.nextInt();
//  		   
//  		       for(int i=0;i<slots;i++) {
//  			   System.out.print("Enter Day Number:");
//      		   int  day_number = scn.nextInt();
//      		   
//      		   System.out.print("Enter Quantity:");
//      		   int  quantity = scn.nextInt();
//      		   
//      		   System.out.println("Select Vaccine:");
//      		   Slots s = new Slots(id,day_number,quantity);
//      		   
//      		   int vaccine_number_selected=scn.nextInt();
//      		  
//      		   
//      		   System.out.println("Slots added by Hospital "+id+" for Day: "+day_number+",Available Quantity: "+quantity+" of vaccine "+Vaccine.vaccines.get(vaccine_number_selected));
//      		   Slots.selectedNumber.add(vaccine_number_selected);
//      		   Slots.vaccineType.add(Vaccine.vaccines.get(vaccine_number_selected));
//  		   }
//  		   
//		   } 
//	}
//	public void  bookSlots(){
//		   Slots s = new Slots();
//    	   System.out.print("Enter patient Unique ID:");
//		   String uniqueid = scn.next();
//		   
//		   System.out.println("1.Search by area");
//		   System.out.println("2.Search by vaccine");
//		   System.out.println("3.Exit");
//		   
//		   System.out.print("Enter option:");
//		   int option = scn.nextInt();
//		   
//		   
//		   Citizen c = new Citizen();
//		   
//		   
//		   if(option==1) {
//			   System.out.print("Enter Pincode:");
//			   int pcode = scn.nextInt();
//			   //now i will have to print all hospital with pincodes
//			   ArrayList<Integer> indexofpcode = new ArrayList<>();
//			   
//			   for(int i=0;i<Hospital.pincodes.size();i++) {
//				  if(pcode==Hospital.pincodes.get(i)) {
//					  indexofpcode.add(i);
//				  }
//			    }
//			   
//			 for(int i=0;i<indexofpcode.size();i++) {
//				 System.out.println(Hospital.Ids.get(i)+" "+Hospital.hospitals.get(i));
//			 }
//			 
//			 //now i have to show slots available for a particular hospital
//			 System.out.print("Enter hospital id:");
//		     int id = scn.nextInt();
//		     
//		     
//		      
//		     
//		     
//		     int index_of_Id = Citizen.id_array.indexOf(uniqueid);
//			 String nameOfCitizen = Citizen.name_array.get(index_of_Id);
//			 
//			 
//			 if(c.vaccinated_citizens.contains(nameOfCitizen)==false) {
//				 //first time
//				    if(Slots.slots_hospitals_id.contains(id)==false) {
//				    	System.out.println("No slots available!!");
//				     }
//				     else {
//				    	 //if slots are available
//				    	ArrayList<Integer> indexofslots = new ArrayList<>();
//				    	for(int i=0;i<Slots.slots_hospitals_id.size();i++) {
//						  if(id==Slots.slots_hospitals_id.get(i)) {
//							  indexofslots.add(i);
//						  }
//				        }
//				    	
//				    	
//				    	for(int i=0;i<indexofslots.size();i++) {
//				    		System.out.println(indexofslots.get(i)+"-> Day:"+Slots.dayNumber.get(i)+" Available Qty:"+Slots.quantities.get(i)+" "+Slots.vaccineType.get(i));
//				    		}
//				    	
//				    	
//				    	System.out.print("Choose slot:");
//		 			    int slotnumber= scn.nextInt();       
//		 			   
//		 			    
//		                System.out.println(nameOfCitizen+" vaccinated with "+Slots.vaccineType.get(slotnumber));		             
//		                c.addNameToVaccinated(nameOfCitizen,Slots.vaccineType.get(slotnumber),Slots.dayNumber.get(slotnumber));
//		                Slots.quantities.set(slotnumber,Slots.quantities.get(slotnumber)-1);
//				 
//				 
//			        }
//		     
//		
//		    	
//		    	}
//			 else {
//				 int dueDate = c.nextDueDate(nameOfCitizen,Citizen.typeOfVaccination.get(Citizen.vaccinated_citizens.indexOf(nameOfCitizen)));
//				 if(Slots.slots_hospitals_id.contains(id)==false) {
//				    	System.out.println("No slots available!!");
//				     }
//				 else {
//					 ArrayList<Integer> indexofslots = new ArrayList<>();
//					 for(int i=0;i<Slots.slots_hospitals_id.size();i++) {
//						 if(Slots.slots_hospitals_id.get(i)==id && Slots.quantities.get(i)>0 &&  Slots.dayNumber.get(i)>=dueDate) {
//							 indexofslots.add(i);//elements are index slot
//						 }
//					 }
//					 if(indexofslots.size()==0) {
//						 System.out.println("No slots available");
//						 
//					 }else {
//						 for(int i=0;i<indexofslots.size();i++) {
//					    		System.out.println(indexofslots.get(i)+"-> Day:"+Slots.dayNumber.get(i)+" Available Qty:"+Slots.quantities.get(i)+" "+Slots.vaccineType.get(i));
//					    		}
//						    System.out.print("Choose slot:");
//			 			    int slotnumber= scn.nextInt();       
//			 			   
//			 			    
//			                System.out.println(nameOfCitizen+" vaccinated with "+Slots.vaccineType.get(slotnumber));		             
//			                c.addNameToVaccinated(nameOfCitizen,Slots.vaccineType.get(slotnumber),Slots.dayNumber.get(slotnumber));
//			                Slots.quantities.set(slotnumber,Slots.quantities.get(slotnumber)-1);
//					 }
//					 
//					 
//					 
//					 
//					 
//				 }
//			 
//				   
//			 }
//		    	
//			   
//		   }
//		   
//		   
//		   
//		   if(option==2) {
//			  System.out.print("Enter Vaccine name:");
//			  String vaccine_to_search = scn.next();
//			  
//			  
//			  
//			  
//			  //list all hospitals having this vaccine
//			  
//			  
//			  //stores index of Slots.vaccineType
//			  int flag=0;
//			  ArrayList<Integer> indexOfVaccine = new ArrayList<>();
//			  for(int i=0;i<Slots.vaccineType.size();i++) {
//			     if(Slots.vaccineType.get(i).equals(vaccine_to_search)) {
//			    	 	indexOfVaccine.add(i);
//			    	 	flag=1;
//	             }
//		      }
//			  
//			  if(flag==0) {
//				  System.out.println("No hospitals have this vaccine!!");
//			  
//			  }
//			  else {
//				  //printing those hospitals
//				  for(int i=0;i<indexOfVaccine.size();i++) {
//					  int id = Slots.slots_hospitals_id.get(indexOfVaccine.get(i));
//					  String hospname = Hospital.hospitals.get(Hospital.Ids.indexOf(id));
//					  System.out.println(id+" "+hospname);
//					  
//				  }
//				  System.out.print("Enter Hospital ID:");
//				  int hospitalID = scn.nextInt();
//				  
//				  //2 cases pehle kabhi use nhi kiya aur i
//				
//				  
//				  int index_of_Id = Citizen.id_array.indexOf(uniqueid);
//	 			  String nameOfCitizen = Citizen.name_array.get(index_of_Id);
//	 			  
//	 			  int dueDate = c.nextDueDate(nameOfCitizen, vaccine_to_search);
//	 			  
//	 			  
//	 			  ArrayList<Integer> indexofpossibleHospitals = new ArrayList<>();
//	 			  for(int i=0;i<Slots.slots_hospitals_id.size();i++) {
//	 				  if(Slots.slots_hospitals_id.get(i)==hospitalID && Slots.quantities.get(i)>0 && Slots.vaccineType.get(i).equals(vaccine_to_search) && Slots.dayNumber.get(i)>=dueDate) {
//	 					                  indexofpossibleHospitals.add(i);
//	 				  }
//	 			  }
//	 			  if(indexofpossibleHospitals.size()==0) {
//	 				 System.out.println("No slots available");
//	 			  }
//	 			  else {
//	 				 for(int i=0;i<indexofpossibleHospitals.size();i++) {
//	 					int idx = indexofpossibleHospitals.get(i);
//	 					System.out.println(idx+"-> Day:"+Slots.dayNumber.get(idx)+"Available Quantity:"+Slots.quantities.get(idx)+"Vaccine: "+Slots.vaccineType.get(idx));
//	 				 }
//	 				 System.out.print("Choose Slot:");
//	 				 int slotnumber = scn.nextInt();
//	 				
//	 				 System.out.println(nameOfCitizen+" vaccinated with "+Slots.vaccineType.get(slotnumber));
//	 				 if(dueDate==-1) {
//	 			
//	 					c.addNameToVaccinated(nameOfCitizen, vaccine_to_search,Slots.dayNumber.get(slotnumber));
//	 					int qty = Slots.quantities.get(slotnumber);
//	 					Slots.quantities.set(slotnumber,qty-1);
//	 					
//	 				 }else {
//	 					
//	 					c.addNameToVaccinated(nameOfCitizen, vaccine_to_search,Slots.dayNumber.get(slotnumber));
//	 					int qty = Slots.quantities.get(slotnumber);
//	 					Slots.quantities.set(slotnumber,qty-1);
//	 				 }
//	 					 
//	 				 }
//	 				 
//	 				 
//	 			  }
//	 		  
//				  
//				  
//			  
//			  
//			  
//			  		  
//	
//		   }
//		   
//		   
//		   if(option==3) {
//			   System.out.println("Exitting!");
//		   }
//		 
//	 }
//	public void listSlots() {
//		  System.out.print("Enter Hospital ID:");
//		  int hospitalID = scn.nextInt();
//		  ArrayList<Integer> indexofhospitals = new ArrayList<>();//hospitals having same id as hospita id
//		  for(int i=0;i<Slots.slots_hospitals_id.size();i++) {
//			 if(Slots.slots_hospitals_id.get(i)==hospitalID) {
//				indexofhospitals.add(i);
//			 }
//		  }
//		  for(int i=0;i<indexofhospitals.size();i++) {
//			 System.out.println("Day:"+Slots.dayNumber.get(indexofhospitals.get(i))+" Vaccine:"+Slots.vaccineType.get(indexofhospitals.get(i))+" Available Qty:"+Slots.quantities.get(indexofhospitals.get(i)));
//		 }
//	}
//}



//class Hospital{
//	String hospital_name;
//	int pincode;
//	int unique_id;
//	static ArrayList<String> hospitals = new ArrayList<>();     //they store name of hospitals
//	static ArrayList<Integer> pincodes  = new ArrayList<>();	    //they store number of dosed
//	static ArrayList<Integer> Ids = new ArrayList<>();		//they store gap bw vaccines
//
//	
//	public Hospital(){
//		
//	}
//	public Hospital(String hospital_name,int pincode) {
//		this.hospital_name=hospital_name;
//		this.pincode=pincode;
//		hospitals.add(hospital_name);
//		pincodes.add(pincode);
//		int id;
//		while(true){
//			   id = new Random().nextInt(89999)+100000;
//			   if(Ids.contains(id)==false)
//			   {
//				   Ids.add(id);
//				   break;
//			   }
//		   }
//		this.unique_id=id;
//		//this.uniqueid mandatory?
//		
//		
//	}
//	public void printInformation() 
//	{
//		System.out.println("Hospital Name:"+this.hospital_name+",Pincode:"+this.pincode+",Unique ID "+this.unique_id);
//	}
//
//	
//	
//	
//	}
//class Vaccine{
//	public String vaccine_name;
//	int number_of_doses;
//	int gap_bw_doses;
//	
//	static ArrayList<String> vaccines = new ArrayList<>();     //they store name of vaccine
//	static ArrayList<Integer> doses = new ArrayList<>();	    //they store number of dosed
//	static ArrayList<Integer> gaps = new ArrayList<>();		//they store gap bw vaccines
//	
//	public Vaccine(){
//		
//	}
//	
//	public Vaccine(String Vaccine_name,int number_of_doses,int gap_bw_doses)
//	{
//		this.vaccine_name=Vaccine_name;
//		this.number_of_doses=number_of_doses;
//		this.gap_bw_doses=gap_bw_doses;
//		vaccines.add(Vaccine_name);
//		doses.add(number_of_doses);
//		gaps.add(gap_bw_doses);
//	}
//	Scanner scn = new Scanner(System.in);
//	public void printInformation(){
//		 System.out.println("Vaccine Name: "+this.vaccine_name+",Number of doses required: "+this.number_of_doses+",Gap between doses: "+this.gap_bw_doses);
//	}
//	public ArrayList<String> VaccineNames(){
//		return this.vaccines;
//	}
//	public void addVaccine() {
//		   System.out.print("Vaccine Name:");
//		   String name = scn.next();
//		   
//		   System.out.print("Number of doses required:");
//		   int doses = scn.nextInt();
//		   int gap=0;
//		   
//		   if(doses!=1) {
//			   System.out.print("Gap between doses:");
//			   gap  = scn.nextInt();
//		   }
//		   
//		  
//		   Vaccine v = new  Vaccine(name,doses,gap);
//		   v.printInformation();
//		   
//	}
//	
//	
//	
//	
//	}
//class Citizen{
//	String citizen_name;
//	int age;
//	String  unique_id;
//	
//	Register Reg = new Register();
//	
//	static ArrayList<String> name_array = new ArrayList<>();         //they store name of vaccine
//	static ArrayList<Integer> age_array = new ArrayList<>();	    //they store number of dosed
//	static ArrayList<String> id_array = new ArrayList<>();		   //they store gap bw vaccines
//	
//	static ArrayList<String> vaccinated_citizens = new ArrayList<>();
//	static ArrayList<String> typeOfVaccination = new ArrayList<>(); 
//	static ArrayList<Integer> numberofdoses = new ArrayList<>();
//	static ArrayList<Integer> dayOfVaccination = new ArrayList<>();
//	
//	
//	public Citizen(){
//		
//	}
//	
//	public Citizen(String citizen_name,int age,	String  unique_id) {
//		this.citizen_name=citizen_name;
//		this.age=age;
//		this.unique_id=unique_id;
//		
//		if( this.age < 18 ) {
//			System.out.println("You are not eligible for registeration");
//		}
//		else {
////			Reg.Register_Citizen(citizen_name);
//			name_array.add(citizen_name);
//			age_array.add(age);
//			id_array.add(unique_id);
//			}
//		//display vaccination status as registered
//		
//		
//	
//	}
//	Scanner scn = new Scanner(System.in);
//	public void  print_Information(){
//		
//		 System.out.println("Name:"+this.citizen_name+",Age:"+this.age+",Unique ID "+this.unique_id);
//
//	}
//	public void addNameToVaccinated(String name,String vaccine_name,int day) {
//		if(vaccinated_citizens.contains(name)==false) {
//			vaccinated_citizens.add(name);
//			typeOfVaccination.add(vaccine_name);
//			dayOfVaccination.add(day);
//			Citizen.numberofdoses.add(1);
//		}
//		else {
//			int idx = Citizen.vaccinated_citizens.indexOf(name);
//			dayOfVaccination.set(idx,day);
//			int dose = Citizen.numberofdoses.get(idx)+1;
//    		Citizen.numberofdoses.set(idx,dose);
//		}
//		
//	}
//
//	
//	public int nextDueDate(String name,String vaccine_name){
//		if(Citizen.vaccinated_citizens.contains(name)) {
//			int prevdate = dayOfVaccination.get(vaccinated_citizens.indexOf(name));
//			int reqGap  = Vaccine.gaps.get(Vaccine.vaccines.indexOf(vaccine_name));
//			return prevdate+reqGap;
//		}else {
//			return -1;
//		}
//		
//	}
//	public void checkVaccinationStatus() {
//		System.out.print("Enter patient Unique ID:");
//		   String patientuniqueid = scn.next();
//		   // first look up for id and identify name and then look into vaccinated people >> citizen class to know vaccination status
//		   Citizen c1 = new Citizen();
//		   String nameOfPerson =Citizen.name_array.get(Citizen.id_array.indexOf(patientuniqueid));
//	  
//		   if(Citizen.vaccinated_citizens.contains(nameOfPerson)==false) { //name not in vaccinated people
//			   System.out.println("Registered!!");
//		   }
//		   
//		   else {
//			   
//			   int idx = Citizen.vaccinated_citizens.indexOf(nameOfPerson);
//			   String vaccine_given = Citizen.typeOfVaccination.get(idx);
//	
//			   int dosesGiven = Citizen.numberofdoses.get(idx);
//			   
//			   int requiredDoses =  Vaccine.doses.get(Vaccine.vaccines.indexOf(vaccine_given));
//			   
//			   if(dosesGiven==requiredDoses) {
//				   System.out.println("FULLY VACCINATED!!");
//				   System.out.println("Vaccine Given: "+vaccine_given);
//				   System.out.println("Number of Doses given: "+dosesGiven);
//				   
//			   }
//			   else {
//				   System.out.println("PARTIALLY VACCINATED!!");
//				   System.out.println("Vaccine Given: "+vaccine_given);
// 			       System.out.println("Number of Doses given: "+dosesGiven);
// 			       System.out.println("Next Dose due date "+c1.nextDueDate(nameOfPerson, vaccine_given));
//			   }
//			   
//			   
//			   
//			   
//			  
//		   }
//	 }
//	
//	
//}


//class Register{
//	Scanner scn = new Scanner(System.in);
//	public void registerHospital(){
//		   System.out.print("Hospital Name:");
//		   String name = scn.next();
//		   System.out.print("Pincode:");
//		   int pincode = scn.nextInt();
//		   Hospital h = new Hospital(name,pincode);//composition i.e when registration is done Hospital is created
//		   h.printInformation();
//		
//	}
//	public void registerCitizen(){//composition i.e when registration is done Citizen is created
//		 System.out.print("Name:");
//		   String name = scn.next();
//		   System.out.print("Age:");
//		   int  age = scn.nextInt();
//		   System.out.print("Unique Id:");
//		   String  unique_id_number = scn.next(); //aadhar card
//		  
//		   //System.out.println("Name:"+name+",Age:"+age+",Unique ID "+unique_id_number);
//		   
//		   Citizen c = new Citizen(name,age,unique_id_number);
//		   c.print_Information();
//	}
//}

