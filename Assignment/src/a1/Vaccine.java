package a1;


import java.util.ArrayList;
import java.util.Scanner;


//print Information --> prints required information
//add Vaccine --> initializes second constructor which add required values to static array

public class Vaccine{
	public String vaccine_name;
	int number_of_doses;
	int gap_bw_doses;
	
	static ArrayList<String> vaccines = new ArrayList<>();     //they store name of vaccine
	static ArrayList<Integer> doses = new ArrayList<>();	    //they store number of dosed
	static ArrayList<Integer> gaps = new ArrayList<>();		//they store gap bw vaccines
	
	public Vaccine(){
		
	}
	
	public Vaccine(String Vaccine_name,int number_of_doses,int gap_bw_doses)
	{
		this.vaccine_name=Vaccine_name;
		this.number_of_doses=number_of_doses;
		this.gap_bw_doses=gap_bw_doses;
		vaccines.add(Vaccine_name);
		doses.add(number_of_doses);
		gaps.add(gap_bw_doses);
	}
	Scanner scn = new Scanner(System.in);
	public void printInformation(){
		 System.out.println("Vaccine Name: "+this.vaccine_name+",Number of doses required: "+this.number_of_doses+",Gap between doses: "+this.gap_bw_doses);
	}
	public ArrayList<String> VaccineNames(){
		return this.vaccines;
	}
	public void addVaccine() {
		   System.out.print("Vaccine Name:");
		   String name = scn.next();
		   
		   System.out.print("Number of doses required:");
		   int doses = scn.nextInt();
		   int gap=0;
		   
		   if(doses!=1) {
			   System.out.print("Gap between doses:");
			   gap  = scn.nextInt();
		   }
		   
		  
		   Vaccine v = new  Vaccine(name,doses,gap);
		   v.printInformation();
		   
	}
	
	
	
	
	}
