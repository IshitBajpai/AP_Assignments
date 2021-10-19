package a2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class instructor implements common_functions{
    private String name;
    private coursepage c;//Associativity of instructor with course page
    private Assessment A;
    
    static  ArrayList<String>  instructor_names= new ArrayList<>();
    
    
   
	public instructor(){}
	
	public instructor(String name){
		setname(name);
		
	}
	
	public void setname(String name){
		this.name=name;
		instructor_names.add(name);
	}
	
	Scanner scn = new Scanner(System.in);
	
	public void addclassmaterial(int id,coursepage c){		
		    this.c = c;
			System.out.println("1.Add Lecture Slide");
			System.out.println("2.Add Lecture Video");
			System.out.print("select:");
			int choice = scn.nextInt();
			scn.nextLine();
			
			if(choice==1) {
				System.out.print("Enter topic of slides:");
				String slidetopic = scn.nextLine();
				
				
				System.out.print("Enter number of slides:");
				int slideno = scn.nextInt();
				scn.nextLine();
				
				System.out.println("Enter content of slides");
				
				Date date = new Date();
				String time = date.toString();
				
				for(int i=0;i<slideno;i++) {
					System.out.print("content of slide "+(i+1)+":");
					String content = scn.nextLine();
					c.addclassmaterials(slidetopic,"slides",time,instructor.instructor_names.get(id),content,slideno);
				}
				

				System.out.println("welcome "+instructor.instructor_names.get(id));
				
			}
			
	
			if(choice==2) {
				System.out.print("Enter topic of video:");
				String videotopic = scn.nextLine();
				System.out.print("Enter filename of video:");
				String filename = scn.nextLine();
				int start_idx=filename.length()-4;
				if(start_idx>=1 && filename.substring(start_idx).equals(".mp4")) {
					Date date = new Date();
					String time = date.toString();
					
					c.addclassmaterials(videotopic,"videos",time,instructor.instructor_names.get(id),filename,-1);
					
				}else {
					System.out.println("Enter file in mp4 format!!");
				}
				
				System.out.println("welcome "+instructor.instructor_names.get(id));	
			}
			
		}
	public void addAssessments(int id, coursepage c) {
		this.c=c;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("1.Add Assignment");
		System.out.println("2.Add Quiz");
		System.out.print("select:");
		int choice = scn.nextInt();
		scn.nextLine();
		if(choice==1) {
			System.out.print("Enter problem statement:");
			String ques = scn.nextLine();
			System.out.print("Enter max marks:");
			int marks = scn.nextInt();
			scn.nextLine();
			
			c.addAssessment(ques, marks,"Assignment",instructor.instructor_names.get(id),"open");
			System.out.println("welcome "+instructor.instructor_names.get(id));

		}
		if(choice==2) {
			System.out.print("Enter quiz question:");
			String ques = scn.nextLine();
			c.addAssessment(ques,1,"Question",instructor.instructor_names.get(id),"open");
			System.out.println("welcome "+instructor.instructor_names.get(id));
		}
		
	}	
	public void gradeAssessments(int id) {
		int indicator = 0;
		System.out.println("List of Assessments");
		for(int i=0;i<coursepage.assessments.size();i++) {
			Assessment A = coursepage.assessments.get(i);
			System.out.println("ID:"+i+" "+A.getAssessment_type()+":"+A.getAssessment_ques()+" Max Marks:"+A.getAssessment_marks());
			System.out.println("------------------------------");
			indicator=1;
		}
		
		if(indicator==0) {
			System.out.println("No Assessments");
		}else {
			System.out.print("Enter ID of assessment to view submission:");
			int assessment_id = scn.nextInt();
			int flag=0;
			

			System.out.println("Choose id from these ungraded submission:");
			for(int i=0;i<coursepage.studentSubmissions.size();i++) {
				students s = coursepage.studentSubmissions.get(i);
				if(s.getMarks_obtained()==-1 && s.getAssessment_index()==assessment_id) {
					
					
					
					System.out.println(i+" "+s.getName());
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("No ungraded assignment");
			}else {
				System.out.print("Select ID:");
				int submission_id = scn.nextInt();
				
				students s = coursepage.studentSubmissions.get(submission_id);
				Assessment A = coursepage.assessments.get(s.getAssessment_index());
				if(A.getAssessment_type()=="Assignment") {
					System.out.println("Submission: "+s.getZipfile());
					System.out.println("------------------------------");
					System.out.println();
					System.out.println("Max Marks: "+A.getAssessment_marks());
					System.out.print("Marks scored:");
					int marksScored = scn.nextInt();
					s.setMarks_obtained(marksScored);
					s.setGradedby(instructor.instructor_names.get(id));
					
				}
				else {
					System.out.println("Answer given: "+s.getZipfile());
					System.out.println("------------------------------");
					System.out.println();
					System.out.println("Max Marks: "+A.getAssessment_marks());
					System.out.print("Marks scored:");
					int marksScored = scn.nextInt();
					s.setMarks_obtained(marksScored);
					s.setGradedby(instructor.instructor_names.get(id));
				}
			}
		}
		
		
		
		System.out.println("welcome "+instructor.instructor_names.get(id));
		
		  
	}

	public void closeAssessments(int id){
		int flag=0;
		System.out.println("List of open assessments:");
    	for(int i=0;i<coursepage.assessments.size();i++) {
    		Assessment A = coursepage.assessments.get(i);
    		if(A.getAssessment_status().equals("open")){
    			System.out.println("ID:"+i+" "+A.getAssessment_type()+":"+A.getAssessment_ques()+" Max Marks:"+A.getAssessment_marks());
    			flag=1;
    		}
    	}
    	if(flag==0) {
    		System.out.println("All assignments are closed");
    	}
    	else {
    		System.out.print("Enter ID of assessment to close:");
    		int assessment_id = scn.nextInt();
    		Assessment A = coursepage.assessments.get(assessment_id);
    		A.setAssessment_status("closed");
    	}
    	System.out.println("welcome "+instructor.instructor_names.get(id));
	}
		
	public void addComments(coursepage c,int id){
		System.out.print("Enter comment:");
		String comment = scn.nextLine();
		Date date = new Date();
		String time = date.toString();
		c.addComments(comment,instructor.instructor_names.get(id),time);
		
	}	
	public void logout(int id) {
		System.out.println("Instructor " + instructor.instructor_names.get(id)+ " logged out");

	}

	public void printName(int id){
		 System.out.println("welcome "+instructor.instructor_names.get(id));
	}
	
	
}
