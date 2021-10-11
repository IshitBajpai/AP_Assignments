package a1;


import java.util.ArrayList;
import java.util.Random;


//This is created with help of Registration class as every hospital is registered in our case (composition type relation)
//never called in main programm
//print Information --> prints required information
public class Hospital{
	String hospital_name;
	int pincode;
	int unique_id;
	
	static ArrayList<String> hospitals = new ArrayList<>();          //they store name of hospitals
	static ArrayList<Integer> pincodes  = new ArrayList<>();	    //they store number of dosed
	static ArrayList<Integer> Ids = new ArrayList<>();		       //they store gap bw vaccines

	
	public Hospital(){
		
	}
	public Hospital(String hospital_name,int pincode) {
		this.hospital_name=hospital_name;
		this.pincode=pincode;
		hospitals.add(hospital_name);
		pincodes.add(pincode);
		int id;
		while(true){
			   id = new Random().nextInt(89999)+100000;
			   if(Ids.contains(id)==false)
			   {
				   Ids.add(id);
				   break;
			   }
		   }
		this.unique_id=id;
		
		
		
	}
	public void printInformation() 
	{
		System.out.println("Hospital Name:"+this.hospital_name+",Pincode:"+this.pincode+",Unique ID "+this.unique_id);
	}

	
	
	
	}

