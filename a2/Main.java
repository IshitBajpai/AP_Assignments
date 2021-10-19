package a2;

import java.util.*;

public class Main{
	
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		
		instructor I0 = new instructor("I0");
		instructor I1 = new instructor("I1");
		
		students S0 = new students("S0");
		students S1 = new students("S1");
		students S2 = new students("S2");
		
		System.out.println("Welcome to Backpack");
		while(true) {
			
			System.out.println("1.Enter as instructor");
			System.out.println("2.Enter as student");
			System.out.println("3.Exit");
			
			System.out.print("choose:");
			int input = scn.nextInt();
		
			if(input==1) {
				//instructor
				System.out.println("Instructors:");
				for(int i=0;i<instructor.instructor_names.size();i++) {
					System.out.println(i+" "+instructor.instructor_names.get(i));
				}
				System.out.print("choose id:");
				int id = scn.nextInt();//pos of name in arraylist
				
				System.out.println("welcome "+instructor.instructor_names.get(id));
				
				
				while(true) {
					
					System.out.println("1.Add Class Material");
					System.out.println("2.Add assessments");
					System.out.println("3.View Lecture Materials");
					System.out.println("4.View Assessments");
					System.out.println("5.Grade Assessments");
					System.out.println("6.Close Assessments");
					System.out.println("7.View Comments");
					System.out.println("8.Add Comments");
					System.out.println("9.Logout");
					
					
					
					System.out.print("instructor choose option:");
					int option = scn.nextInt();
					
					if(option==1) {
						
						instructor I = new instructor();
						coursepage cp = new coursepage(); 
						I.addclassmaterial(id,cp);  
						
					}
					if(option==2) {
						
						instructor I = new instructor();
						coursepage cp = new coursepage(); 
						I.addAssessments(id,cp);	
					}
					
					if(option==3) {
						instructor I = new instructor(); 
						I.viewLectureMaterials();  
						I.printName(id);
						
					}
					if(option==4) {
						instructor I = new instructor();
						I.viewAssessments();
						I.printName(id);
						
					}
					if(option==5) {
						//only show ungraded assessments
						instructor I = new instructor();
				    	I.gradeAssessments(id);;					  
					}
				    if(option==6){
				    	//close assessments which are open
				    	instructor I = new instructor();
				    	I.closeAssessments(id);
				    }				    
				    if(option==7){
				    	instructor I  = new instructor();
				    	I.viewComments();
				    	I.printName(id);
				    }
				    if(option==8){
				    	coursepage c = new coursepage();
				    	instructor I = new instructor();
				    	I.addComments(c,id);
				    	I.printName(id);
				    }
				    
					if(option==9) {
						instructor I = new instructor();
						I.logout(id);
						break;
					}
				
				}
				
				
			}
			
			if(input==2) {
				System.out.println("Students:");
				for(int i=0;i<students.student_names.size();i++) {
					System.out.println(i+" "+students.student_names.get(i));
				}
				System.out.print("choose id:");
				int id = scn.nextInt();//pos of name in arraylist
				
				System.out.println("welcome "+students.student_names.get(id));
				
				while(true) {
					
					System.out.println("1.View lecture materials");
					System.out.println("2.View assessments");
					System.out.println("3.Submit asessments");
					System.out.println("4.View grades");
					System.out.println("5.View comments");
					System.out.println("6.Add comments");
					System.out.println("7.Logout");
					
					System.out.print("student choose option:");
					int option = scn.nextInt();
					if(option==1) {
						students S = new students(); 
						S.viewLectureMaterials();
						S.printName(id);
					}
					if(option==2) {
						students S = new students();
						S.viewAssessments();
						S.printName(id);
					}
					if(option==3) {
						students S = new students();
						S.submitAssessment(id);
									
					}
					if(option==4) {
						students S = new students();
						S.viewGrades(id);
					}
					
					if(option==5) {
						students S = new students();
						S.viewComments();
						S.printName(id);
					}
					if(option==6) {
						students S = new students();
						coursepage c = new coursepage();
						S.addComments(c,id);
						S.printName(id);
					}
					if(option==7) {
						students S = new students();
						S.logout(id);
						break;
						
					}
					
				}
			}
			
			if(input==3) {
				break;
			}		
		}
	}
}

//class coursepage{
//	
//	static  ArrayList<classmaterial> classMaterials= new ArrayList<>();
//	static  ArrayList<Assessment> assessments= new ArrayList<>();
//	static  ArrayList<Comment> comments= new ArrayList<>();
//	coursepage(){
//		
//	}
//	public void addclassmaterials(String title,String type,String time,String class_material_uploader,String content,int slidenumber){
//		classMaterials.add(new classmaterial(title,type,time,class_material_uploader,content,slidenumber));
//	}
//
//	public void addAssessment(String ques,int marks,String type,String uploader){
//		assessments.add(new Assessment(ques,marks,type,uploader));
//	}
//	public void addComments(String com,String commentedby,String date) {
//		comments.add(new Comment(com,commentedby,date));
//		
//	}
//	
//}
	
//class Comment {
//	private String comments;
//	private String commented_by;
//	private String comments_time;
//	Comment(String com,String commentedby,String date){
//		this.setComments(com);
//		this.setCommented_by(commentedby);
//		this.setComments_time(date);
//	}
//	public String getComments() {
//		return comments;
//	}
//	public void setComments(String comments) {
//		this.comments = comments;
//	}
//	public String getCommented_by() {
//		return commented_by;
//	}
//	public void setCommented_by(String commented_by) {
//		this.commented_by = commented_by;
//	}
//	public String getComments_time() {
//		return comments_time;
//	}
//	public void setComments_time(String comments_time) {
//		this.comments_time = comments_time;
//	}
//}

//class classmaterial{
//	private String class_material_title;
//	private String class_material_type;
//	private String class_material_timestamp;
//	private String class_material_uploader;
//	private String class_material_content;
//	private int class_material_numberofslides;
//	
//	classmaterial(String class_material_title,String class_material_type,String class_material_timestamp,String class_material_uploader,String class_material_content,int class_material_numberofslides){
//		this.setClass_material_title(class_material_title);
//		this.setClass_material_type(class_material_type);
//		this.setClass_material_timestamp(class_material_timestamp);
//		this.setClass_material_uploader(class_material_uploader);
//		this.setClass_material_content(class_material_content);
//		this.setClass_material_numberofslides(class_material_numberofslides);
//	}
//	public String getClass_material_title() {
//		return class_material_title;
//	}
//	public void setClass_material_title(String class_material_title) {
//		this.class_material_title = class_material_title;
//	}
//	public String getClass_material_type() {
//		return class_material_type;
//	}
//	public void setClass_material_type(String class_material_type) {
//		this.class_material_type = class_material_type;
//	}
//	public String getClass_material_timestamp() {
//		return class_material_timestamp;
//	}
//	public void setClass_material_timestamp(String class_material_timestamp) {
//		this.class_material_timestamp = class_material_timestamp;
//	}
//	public String getClass_material_uploader() {
//		return class_material_uploader;
//	}
//	public void setClass_material_uploader(String class_material_uploader) {
//		this.class_material_uploader = class_material_uploader;
//	}
//	public String getClass_material_content() {
//		return class_material_content;
//	}
//	public void setClass_material_content(String class_material_content) {
//		this.class_material_content = class_material_content;
//	}
//	public int getClass_material_numberofslides() {
//		return class_material_numberofslides;
//	}
//	public void setClass_material_numberofslides(int class_material_numberofslides) {
//		this.class_material_numberofslides = class_material_numberofslides;
//	}
//	
//}
//class instructor implements commonfunctions{
//    private String name;
//    private coursepage c;//Associativity of instructor with course page
//    private Assessment A;
//    
//    static  ArrayList<String>  instructor_names= new ArrayList<>();
//    
//    
//   
//	public instructor(){}
//	
//	public instructor(String name){
//		setname(name);
//		
//	}
//	
//	public void setname(String name){
//		this.name=name;
//		instructor_names.add(name);
//	}
//	
//	Scanner scn = new Scanner(System.in);
//	
//	public void addclassmaterial(int id,coursepage c){		
//		    this.c = c;
//			System.out.println("1.Add Lecture Slide");
//			System.out.println("2.Add Lecture Video");
//			System.out.print("select:");
//			int choice = scn.nextInt();
//			scn.nextLine();
//			
//			if(choice==1) {
//				System.out.print("Enter topic of slides:");
//				String slidetopic = scn.nextLine();
//				
//				
//				System.out.print("Enter number of slides:");
//				int slideno = scn.nextInt();
//				scn.nextLine();
//				
//				System.out.println("Enter content of slides");
//				
//				Date date = new Date();
//				String time = date.toString();
//				
//				for(int i=0;i<slideno;i++) {
//					System.out.print("content of slide "+(i+1)+":");
//					String content = scn.nextLine();
//					c.addclassmaterials(slidetopic,"slides",time,instructor.instructor_names.get(id),content,slideno);
//				}
//				
//
//				System.out.println("welcome "+instructor.instructor_names.get(id));
//				
//			}
//			
//	
//			if(choice==2) {
//				System.out.print("Enter topic of video:");
//				String videotopic = scn.nextLine();
//				System.out.print("Enter filename of video:");
//				String filename = scn.nextLine();
//				int start_idx=filename.length()-4;
//				if(start_idx>=1 && filename.substring(start_idx).equals(".mp4")) {
//					Date date = new Date();
//					String time = date.toString();
//					
//					c.addclassmaterials(videotopic,"videos",time,instructor.instructor_names.get(id),filename,-1);
//					
//				}else {
//					System.out.println("Enter file in mp4 format!!");
//				}
//				
//				System.out.println("welcome "+instructor.instructor_names.get(id));	
//			}
//			
//		}
//	
//	
//	
//	
//	
////	@Override
//	public void viewLectureMaterials(coursepage c,int id) {
////		classmaterial c = coursepage.classMaterials.get(i);
////		System.out.println(c.getClass_material_title()+" "+c.getClass_material_content()+" "+c.getClass_material_timestamp()+c.getClass_material_type()+c.getClass_material_uploader()+c.getClass_material_numberofslides());
//      	this.c = c;
//		int i = 0;
//		String type;
//		String title;
//		String content;
//		String time;
//		while(i<c.classMaterials.size()) {
//      	    classmaterial cm = c.classMaterials.get(i);
//			type =cm.getClass_material_type();
//			title =cm.getClass_material_title();
//			
//			if(type.equals("slides")){
//				
//				System.out.println("Title: "+title);
//				int count = 1 ;
//				for(int j=i;j<i+cm.getClass_material_numberofslides();j++) {
//					content = cm.getClass_material_content(); //c.class_material_content.get(j);
//					System.out.println("Slide "+count+" :"+content);
//					
//					count++;
//				}
//				time = cm.getClass_material_timestamp();
//				System.out.println("Date of upload: "+time);
//				System.out.println("Uploaded by "+cm.getClass_material_uploader());
//				
//				
//				
//				
//				i=i+cm.getClass_material_numberofslides();
//				
//			}
//			else if(type.equals("videos")) {
//				time = cm.getClass_material_timestamp();
//				
//				System.out.println("Title of video: "+title);
//				System.out.println("Video file: "+cm.getClass_material_content());
//				System.out.println("Date of upload: "+time);
//				System.out.println("Uploaded by "+cm.getClass_material_uploader());
//				
//				
//				
//				
//				
//				i++;
//			}
//			System.out.println();
//		}
//		System.out.println("welcome "+instructor.instructor_names.get(id));
//		
//	}
//	
//	public void addAssessments(int id,Assessment A) {
//		this.A=A;
//		coursepage c = new coursepage();
//		this.A.addAssessments(id, c);
//		
//	}
//	public void viewAssessments(){
//		
//	}
//	
//	
//
//	@Override
//	public void addComments(int id,coursepage c) {
//		this.c=c;
//		System.out.print("Enter comment:");
//		String comment = scn.nextLine();
//		Date date = new Date();
//		String time = date.toString();
//		c.addComments(comment,instructor.instructor_names.get(id),time);
//		System.out.println("welcome "+instructor.instructor_names.get(id));
//		
//		
//	}
//
//	@Override
//	public void viewComments() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	@Override
//	public void logout(int id) {
//		// TODO Auto-generated method stub
//		System.out.println("Instructor " + instructor.instructor_names.get(id)+ " logged out");
//		
//	}
//
//	@Override
//	public void viewLectureMaterials(coursepage c) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//	
//}

//class Assessment implements Assessments_Interface {
//	 private coursepage c;
//	 
//	 private String assessment_type;
//	 private String assessment_ques;
//	 private String assessment_uploader;
//	 private int assessment_marks;
//	 
//	 Assessment(){}
//	 Assessment(String assessment_ques,int assessment_marks,String assessment_type,String assessment_uploader){
//		this.setAssessment_type(assessment_type);
//		this.setAssessment_ques(assessment_ques);
//		this.setAssessment_uploader(assessment_uploader);
//		this.setAssessment_marks(assessment_marks);
//	 }
//	
//		
//	 
//	 @Override
//	 public void addAssessments(int id,coursepage c){
//			
//			this.c=c;
//			Scanner scn = new Scanner(System.in);
//			
//			System.out.println("1.Add Assignment");
//			System.out.println("2.Add Quiz");
//			System.out.print("select:");
//			int choice = scn.nextInt();
//			scn.nextLine();
//			if(choice==1) {
//				System.out.print("Enter problem statement:");
//				String ques = scn.nextLine();
//				System.out.print("Enter max marks:");
//				int marks = scn.nextInt();
//				scn.nextLine();
//				
//				c.addAssessment(ques, marks,"Assignment",instructor.instructor_names.get(id));
//				System.out.println("welcome "+instructor.instructor_names.get(id));
//
//			}
//			if(choice==2) {
//				System.out.print("Enter quiz question:");
//				String ques = scn.nextLine();
//				c.addAssessment(ques,1,"Quiz",instructor.instructor_names.get(id));
//				System.out.println("welcome "+instructor.instructor_names.get(id));
//			}
//		}
//
//
//
//	@Override
//	public void viewAssessments() {
//		
//		
//	}
//
//
//
//	
//
//
//
//	@Override
//	public void closeAssessments() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//	public String getAssessment_type() {
//		return assessment_type;
//	}
//
//
//
//	public void setAssessment_type(String assessment_type) {
//		this.assessment_type = assessment_type;
//	}
//
//
//
//	public String getAssessment_ques() {
//		return assessment_ques;
//	}
//
//
//
//	public void setAssessment_ques(String assessment_ques) {
//		this.assessment_ques = assessment_ques;
//	}
//
//
//
//	public String getAssessment_uploader() {
//		return assessment_uploader;
//	}
//
//
//
//	public void setAssessment_uploader(String assessment_uploader) {
//		this.assessment_uploader = assessment_uploader;
//	}
//
//
//
//	public int getAssessment_marks() {
//		return assessment_marks;
//	}
//
//
//
//	public void setAssessment_marks(int assessment_marks) {
//		this.assessment_marks = assessment_marks;
//	}
//	 
//	 
//}

//class students implements commonfunctions{
//	private String name;
//	private coursepage c;
//	
//    static  ArrayList<String>  student_names= new ArrayList<>();
////    static  ArrayList<String>  
//	public students(){}
//	public students(String name){
//		setname(name);
//	}
//	
//	public void setname(String name){
//		this.name=name;
//		student_names.add(name);
//	}
//	
//	
//
//	
//
//	@Override
//	public void logout(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void viewLectureMaterials(coursepage c) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void viewComments() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void addComments(int id, coursepage c) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
