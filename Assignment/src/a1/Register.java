package a1;



import java.util.Scanner;

//it is called during registration and it further calls
//registerHospital --> object of class hospital is used
//registerCitizen --> object of class citizen is used

public class Register{
	Scanner scn = new Scanner(System.in);
	public void registerHospital(){
		   System.out.print("Hospital Name:");
		   String name = scn.next();
		   System.out.print("Pincode:");
		   int pincode = scn.nextInt();
		   Hospital h = new Hospital(name,pincode);//composition i.e when registration is done Hospital is created
		   h.printInformation();
		
	}
	public void registerCitizen(){//composition i.e when registration is done Citizen is created
		 System.out.print("Name:");
		   String name = scn.next();
		   System.out.print("Age:");
		   int  age = scn.nextInt();
		   System.out.print("Unique Id:");
		   String  unique_id_number = scn.next(); //aadhar card
		  
		   //System.out.println("Name:"+name+",Age:"+age+",Unique ID "+unique_id_number);
		   
		   Citizen c = new Citizen(name,age,unique_id_number);
		   c.print_Information();
	}
}


