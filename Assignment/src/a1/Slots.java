package a1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//updated
// add slot   ->initializes second constructor
// book slot  ->books slot (in this function object of citizen is created and used)
// list slots ->this just lists all slots 

//for every hospital slot may/may not be created

public class Slots{
	int hospital_id;
	int day_number;
	int quantity;
	
	
	
	 static ArrayList<Integer> slots_hospitals_id = new ArrayList<>();  
	 static ArrayList<Integer> dayNumber = new ArrayList<>(); 
	 static ArrayList<Integer> quantities = new ArrayList<>();  
	 static ArrayList<Integer> selectedNumber = new ArrayList<>();  
	 static ArrayList<String> vaccineType = new ArrayList<>();
	 
	 Slots(){}
	 Slots(int hospital_id,int day_number,int quantity){
		this.hospital_id=hospital_id;
		//this.no_of_slots=no_of_slots;
		this.day_number=day_number;
		this.quantity=quantity;
		ArrayList<String> names = Vaccine.vaccines;
		for(int i=0;i<names.size();i++) {
			 System.out.println(i+". "+names.get(i));
		}
		slots_hospitals_id.add(hospital_id);
		dayNumber.add(day_number);
		quantities.add(quantity);
	
	
	}
	Scanner scn = new Scanner(System.in);
	public void addSlots() {
		   
	       System.out.print("Enter Hospital ID: ");//need to check if this exists
		   int id = scn.nextInt();
		   
		  
		   
		   if((Hospital.Ids).contains(id)==false) {
			   System.out.println("Incorrect Hospital Id!!!");
		   }
		   
		   else {
			   
			   System.out.print("Enter number of Slots to be added:");//need to check that slots are not outnumbered 
  		       int  slots = scn.nextInt();
  		   
  		       for(int i=0;i<slots;i++) {
  			   System.out.print("Enter Day Number:");
      		   int  day_number = scn.nextInt();
      		   
      		   System.out.print("Enter Quantity:");
      		   int  quantity = scn.nextInt();
      		   
      		   System.out.println("Select Vaccine:");
      		   
      		   //if we add slot for the same day,same id,same vaccine then only qty should be incremented
      		   
      		   
      		   
      		   Slots s = new Slots(id,day_number,quantity);
      		   
      		   int vaccine_number_selected=scn.nextInt();
      		  
      		   
      		   System.out.println("Slots added by Hospital "+id+" for Day: "+day_number+",Available Quantity: "+quantity+" of vaccine "+Vaccine.vaccines.get(vaccine_number_selected));
      		   Slots.selectedNumber.add(vaccine_number_selected);
      		   Slots.vaccineType.add(Vaccine.vaccines.get(vaccine_number_selected));
  		   }
  		   
		   } 
	}
	public void  bookSlots(){
		   Slots s = new Slots();
    	   System.out.print("Enter patient Unique ID:");
		   String uniqueid = scn.next();
		   
		   System.out.println("1.Search by area");
		   System.out.println("2.Search by vaccine");
		   System.out.println("3.Exit");
		   
		   System.out.print("Enter option:");
		   int option = scn.nextInt();
		   
		   
		   Citizen c = new Citizen();
		   
		   
		   if(option==1) {
			   System.out.print("Enter Pincode:");
			   int pcode = scn.nextInt();
			   //now i will have to print all hospital with pincodes
			   ArrayList<Integer> indexofpcode = new ArrayList<>();
			   
			   for(int i=0;i<Hospital.pincodes.size();i++) {
				  if(pcode==Hospital.pincodes.get(i)) {
					  indexofpcode.add(i);
				  }
			    }
			   
			 for(int i=0;i<indexofpcode.size();i++) {
				 System.out.println(Hospital.Ids.get(i)+" "+Hospital.hospitals.get(i));
			 }
			 
			 //now i have to show slots available for a particular hospital
			 System.out.print("Enter hospital id:");
		     int id = scn.nextInt();
		     
		     
		      
		     
		     
		     int index_of_Id = Citizen.id_array.indexOf(uniqueid);
			 String nameOfCitizen = Citizen.name_array.get(index_of_Id);
			 
			 
			 if(Citizen.vaccinated_citizens.contains(nameOfCitizen)==false) {
				 //first time
				    if(Slots.slots_hospitals_id.contains(id)==false) {
				    	System.out.println("No slots available!!");
				     }
				     else {
				    	 //if slots are available
				    	ArrayList<Integer> indexofslots = new ArrayList<>();
				    	for(int i=0;i<Slots.slots_hospitals_id.size();i++) {
						  if(id==Slots.slots_hospitals_id.get(i)) {
							  indexofslots.add(i);
						  }
				        }
				    	
				    	
				    	for(int i=0;i<indexofslots.size();i++) {
				    		System.out.println(indexofslots.get(i)+"-> Day:"+Slots.dayNumber.get(indexofslots.get(i))+" Available Qty:"+Slots.quantities.get(indexofslots.get(i))+" "+Slots.vaccineType.get(indexofslots.get(i)));
				    		}
				    	
				    	
				    	System.out.print("Choose slot:");
		 			    int slotnumber= scn.nextInt();       
		 			   
		 			    
		                System.out.println(nameOfCitizen+" vaccinated with "+Slots.vaccineType.get(slotnumber));		             
		                c.addNameToVaccinated(nameOfCitizen,Slots.vaccineType.get(slotnumber),Slots.dayNumber.get(slotnumber));
		                Slots.quantities.set(slotnumber,Slots.quantities.get(slotnumber)-1);
				 
				 
			        }
		     
		
		    	
		    	}
			 else {
				 int dueDate = c.nextDueDate(nameOfCitizen,Citizen.typeOfVaccination.get(Citizen.vaccinated_citizens.indexOf(nameOfCitizen)));
				 if(Slots.slots_hospitals_id.contains(id)==false) {
				    	System.out.println("No slots available!!");
				     }
				 else {
					 ArrayList<Integer> indexofslots = new ArrayList<>();
					 for(int i=0;i<Slots.slots_hospitals_id.size();i++) {
						 if(Slots.slots_hospitals_id.get(i)==id && Slots.quantities.get(i)>0 &&  Slots.dayNumber.get(i)>=dueDate) {
							 indexofslots.add(i);//elements are index slot
						 }
					 }
					 if(indexofslots.size()==0) {
						 System.out.println("No slots available");
						 
					 }else {
						 for(int i=0;i<indexofslots.size();i++) {
					    		System.out.println(indexofslots.get(i)+"-> Day:"+Slots.dayNumber.get(indexofslots.get(i))+" Available Qty:"+Slots.quantities.get(indexofslots.get(i))+" "+Slots.vaccineType.get(indexofslots.get(i)));
					    		}
						    System.out.print("Choose slot:");
			 			    int slotnumber= scn.nextInt();       
			 			   
			 			    
			                System.out.println(nameOfCitizen+" vaccinated with "+Slots.vaccineType.get(slotnumber));		             
			                c.addNameToVaccinated(nameOfCitizen,Slots.vaccineType.get(slotnumber),Slots.dayNumber.get(slotnumber));
			                Slots.quantities.set(slotnumber,Slots.quantities.get(slotnumber)-1);
					 }
					 
					 
					 
					 
					 
				 }
			 
				   
			 }
		    	
			   
		   }
		   
		   
		   
		   if(option==2) {
			  System.out.print("Enter Vaccine name:");
			  String vaccine_to_search = scn.next();
			  
			  
			  
			  
			  //list all hospitals having this vaccine
			  
			  
			  //stores index of Slots.vaccineType
			  int flag=0;
			  ArrayList<Integer> indexOfVaccine = new ArrayList<>();
			  for(int i=0;i<Slots.vaccineType.size();i++) {
			     if(Slots.vaccineType.get(i).equals(vaccine_to_search)) {
			    	 	indexOfVaccine.add(i);
			    	 	flag=1;
	             }
		      }
			  
			  if(flag==0) {
				  System.out.println("No hospitals have this vaccine!!");
			  
			  }
			  else {
				  //printing those hospitals
				  ArrayList<Integer> toprinteachhosponce = new ArrayList<>();
				  for(int i=0;i<indexOfVaccine.size();i++) {
					  
					  int id = Slots.slots_hospitals_id.get(indexOfVaccine.get(i));
					  int occ =Collections.frequency(toprinteachhosponce,id);
					  toprinteachhosponce.add(id);
					  
					  if(occ==0) {
						  String hospname = Hospital.hospitals.get(Hospital.Ids.indexOf(id));
						  System.out.println(id+" "+hospname); 
					  }
					  
					 
					  
				  }
				  System.out.print("Enter Hospital ID:");
				  int hospitalID = scn.nextInt();
				  
				  //2 cases
				
				  
				  int index_of_Id = Citizen.id_array.indexOf(uniqueid);
	 			  String nameOfCitizen = Citizen.name_array.get(index_of_Id);
	 			  
	 			  int dueDate = c.nextDueDate(nameOfCitizen, vaccine_to_search);
	 			  
	 			  
	 			  ArrayList<Integer> indexofpossibleHospitals = new ArrayList<>();
	 			  for(int i=0;i<Slots.slots_hospitals_id.size();i++) {
	 				  if(Slots.slots_hospitals_id.get(i)==hospitalID && Slots.quantities.get(i)>0 && Slots.vaccineType.get(i).equals(vaccine_to_search) && Slots.dayNumber.get(i)>=dueDate) {
	 					                  indexofpossibleHospitals.add(i);
	 				  }
	 			  }
	 			  if(indexofpossibleHospitals.size()==0) {
	 				 System.out.println("No slots available");
	 			  }
	 			  else {
	 				 for(int i=0;i<indexofpossibleHospitals.size();i++) {
	 					int idx = indexofpossibleHospitals.get(i);
	 					System.out.println(idx+"-> Day: "+Slots.dayNumber.get(idx)+" Available Quantity: "+Slots.quantities.get(idx)+" Vaccine: "+Slots.vaccineType.get(idx));
	 				 }
	 				 System.out.print("Choose Slot:");
	 				 int slotnumber = scn.nextInt();
	 				
	 				 System.out.println(nameOfCitizen+" vaccinated with "+Slots.vaccineType.get(slotnumber));
	 				 if(dueDate==-1) {
	 			
	 					c.addNameToVaccinated(nameOfCitizen, vaccine_to_search,Slots.dayNumber.get(slotnumber));
	 					int qty = Slots.quantities.get(slotnumber);
	 					Slots.quantities.set(slotnumber,qty-1);
	 					
	 				 }else {
	 					
	 					c.addNameToVaccinated(nameOfCitizen, vaccine_to_search,Slots.dayNumber.get(slotnumber));
	 					int qty = Slots.quantities.get(slotnumber);
	 					Slots.quantities.set(slotnumber,qty-1);
	 				 }
	 					 
	 				 }
	 				 
	 				 
	 			  }
	 		  
				  
				  
			  
			  
			  
			  		  
	
		   }
		   
		   
		   if(option==3) {
			   System.out.println("Exitting!");
		   }
		 
	 }
	public void listSlots() {
		  System.out.print("Enter Hospital ID:");
		  int hospitalID = scn.nextInt();
		  ArrayList<Integer> indexofhospitals = new ArrayList<>();//hospitals having same id as hospita id
		  for(int i=0;i<Slots.slots_hospitals_id.size();i++) {
			 if(Slots.slots_hospitals_id.get(i)==hospitalID) {
				indexofhospitals.add(i);
			 }
		  }
		  for(int i=0;i<indexofhospitals.size();i++) {
			 System.out.println("Day:"+Slots.dayNumber.get(indexofhospitals.get(i))+" Vaccine:"+Slots.vaccineType.get(indexofhospitals.get(i))+" Available Qty:"+Slots.quantities.get(indexofhospitals.get(i)));
		 }
	}
}