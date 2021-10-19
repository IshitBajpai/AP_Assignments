package a2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class students implements common_functions{
	private String name;
	private coursepage c;
	private instructor I;
	
	private int graded;                // 0 for ungraded 1 for graded
	private int marks_obtained;        //-1 is the initial value
	private int assessment_index;
	private String zipfile;
	private String gradedby;

	static  ArrayList<String>  student_names= new ArrayList<>();
	
	
	public students(){}
	
	public students(String name){
		this.setName(name);
		student_names.add(name);
	}
	
	public  students(String name,int marks_obtained,int assessment_index,int graded,String zipfile,String gradedby){
		this.setName(name);
		this.setMarks_obtained(marks_obtained);
		this.setAssessment_index(assessment_index);
		this.setGraded(graded);
		this.setZipfile(zipfile);
		this.setGradedby(gradedby);
	}
	
	Scanner scn = new Scanner(System.in);
	
	

	public void submitAssessment(int id) {
		 coursepage c = new coursepage();
		
		String name = students.student_names.get(id);
		ArrayList<Integer> storingAssessmentId = new ArrayList<>(); //indexes of assessment 
		
		
		for(int i=0;i<coursepage.studentSubmissions.size();i++) {
			students s = coursepage.studentSubmissions.get(i);
			if(s.getName().equals(name)) {
				storingAssessmentId.add(s.getAssessment_index());
			}
		}
		
		for(int i=0;i<coursepage.assessments.size();i++) {
			Assessment a = coursepage.assessments.get(i);
			if(storingAssessmentId.contains(i)==false && a.getAssessment_status().equals("closed")) {
				storingAssessmentId.add(i);
			}
		}
		
		if(storingAssessmentId.size()==coursepage.assessments.size()) {
			System.out.println("No Pending assignments");
		}
		
		else {
			System.out.println("Pending assignments");
			
			int flag=0;
			for(int i=0;i<coursepage.assessments.size();i++) {
				Assessment a = coursepage.assessments.get(i);
				if(storingAssessmentId.contains(i)==false) {
					if(a.getAssessment_type().equals("Assignment")) {
						System.out.println("ID:"+i+" "+a.getAssessment_type()+": "+a.getAssessment_ques()+"  Max marks: "+a.getAssessment_marks());
						flag=1;
					}else {
						System.out.println("ID:"+i+" "+a.getAssessment_type()+": "+a.getAssessment_ques());
						flag=1;
					}
				}
			}
			
			
				System.out.print("Enter ID of assessment:");
				int assessment_id = scn.nextInt();
				scn.nextLine();
				Assessment a = coursepage.assessments.get(assessment_id);
				if(a.getAssessment_type().equals("Assignment")){
					System.out.print("Enter file name of assignment:");
					String filename = scn.nextLine();
					int start_idx=filename.length()-4;
					if(start_idx>=1 && filename.substring(start_idx).equals(".zip")) {
						c.addSubmissions(students.student_names.get(id),-1,assessment_id,0,filename,"");
					}else {
						System.out.print("file not in .zip format !!");
					}
				}
				else if(a.getAssessment_type().equals("Question")){
					System.out.print(a.getAssessment_ques()+" :");
					String answer = scn.nextLine();
					c.addSubmissions(students.student_names.get(id),-1,assessment_id,0,answer,"");
					
				}
		}	
	   System.out.println("welcome "+students.student_names.get(id));
	}
	public  void addComments(coursepage c,int id){
		System.out.print("Enter comment:");
		String comment = scn.nextLine();
		Date date = new Date();
		String time = date.toString();
		c.addComments(comment,students.student_names.get(id),time);
		
	}
	public void viewGrades(int id) {
		String name = students.student_names.get(id);
		ArrayList<Integer> graded = new ArrayList<>(); //indexes of submission 
		ArrayList<Integer> ungraded = new ArrayList<>();//indexes of submission 
		for(int i=0;i<coursepage.studentSubmissions.size();i++) {
				students s = coursepage.studentSubmissions.get(i);
				if(s.getName().equals(name) && s.getMarks_obtained()>=0) {
					graded.add(i);
				}
				if(s.getName().equals(name) && s.getMarks_obtained()==-1) {
					ungraded.add(i);
				}
		}
		
		System.out.println("Graded Submission");
		for(int i=0;i<graded.size();i++){
			int submission_idx = graded.get(i);
			students s = coursepage.studentSubmissions.get(submission_idx);
			System.out.println("Submission:"+s.getZipfile());
			System.out.println("Marks scored:"+s.getMarks_obtained());
			System.out.println("Graded by:"+s.getGradedby());		
		}	
		System.out.println("-----------------");
		System.out.println("Ungraded Submission");
		for(int i=0;i<ungraded.size();i++){
			int submission_idx = ungraded.get(i);
			students s = coursepage.studentSubmissions.get(submission_idx);
			System.out.println("Submission:"+s.getZipfile());
					
		}
		System.out.println("welcome "+students.student_names.get(id));
	}
	public void logout(int id) {
		System.out.println("Student " +students.student_names.get(id)+ " logged out");

	}
	public void printName(int id){
		 System.out.println("welcome "+students.student_names.get(id));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGraded() {
		return graded;
	}
	public void setGraded(int graded) {
		this.graded = graded;
	}
	public int getMarks_obtained() {
		return marks_obtained;
	}
	public void setMarks_obtained(int marks_obtained) {
		this.marks_obtained = marks_obtained;
	}
	public String getZipfile() {
		return zipfile;
	}

	public void setZipfile(String zipfile) {
		this.zipfile = zipfile;
	}

	public int getAssessment_index() {
		return assessment_index;
	}

	public void setAssessment_index(int assessment_index) {
		this.assessment_index = assessment_index;
	}

	public String getGradedby() {
		return gradedby;
	}

	public void setGradedby(String gradedby) {
		this.gradedby = gradedby;
	}
	
	

	

	
	
}
