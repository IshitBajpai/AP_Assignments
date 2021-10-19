package a2;

import java.util.Date;
import java.util.Scanner;

public interface common_functions{
	
	public void printName(int id);
	public void logout(int id);
	public void addComments(coursepage c,int id);
	
	Scanner scn = new Scanner(System.in);
	
	 default void viewLectureMaterials(){
		 
		coursepage c = new coursepage();
		
		
	if(c.classMaterials.size()==0) {
		System.out.println("No material posted yet");
	}else {
		int i = 0;
		String type;
		String title;
		String content;
		String time;
		while(i<c.classMaterials.size()) {
      	    classmaterial cm = c.classMaterials.get(i);
			type =cm.getClass_material_type();
			title =cm.getClass_material_title();
			time = cm.getClass_material_timestamp();
			if(type.equals("slides")){
				
				System.out.println("Title: "+title);
				int count = 1 ;
				for(int j=i;j<i+cm.getClass_material_numberofslides();j++) {
					classmaterial cm1 = c.classMaterials.get(j);
					content = cm1.getClass_material_content(); //c.class_material_content.get(j);
					System.out.println("Slide "+count+" :"+content);
					count++;
				}
				System.out.println("Date of upload: "+time);
				System.out.println("Uploaded by "+cm.getClass_material_uploader());
				
				
				
				
				i=i+cm.getClass_material_numberofslides();
				
			}
			else if(type.equals("videos")) {
				time = cm.getClass_material_timestamp();
				
				System.out.println("Title of video: "+title);
				System.out.println("Video file: "+cm.getClass_material_content());
				System.out.println("Date of upload: "+time);
				System.out.println("Uploaded by "+cm.getClass_material_uploader());
				
				
				
				
				
				i++;
			}
			System.out.println();
		}
		
	}
		
		
	}

	default void viewAssessments(){
		if(coursepage.assessments.size()==0) {
			System.out.println("No assessments posted");
		}else {
			for(int i=0;i<coursepage.assessments.size();i++) {
				Assessment a = coursepage.assessments.get(i);
				String type =a.getAssessment_type();
				if(type=="Assignment") {
					System.out.println("ID:"+i+" "+a.getAssessment_type()+": "+a.getAssessment_ques()+"  Max marks: "+a.getAssessment_marks());
					System.out.println("----------------------");
				}else {
					System.out.println("ID:"+i+" "+a.getAssessment_type()+": "+a.getAssessment_ques());
					System.out.println("----------------------");
				}
				
			}
		}
	}
	
	default void viewComments(){
		if(coursepage.comments.size()==0) {
			System.out.println("No comments till now!!");
		}else {
			for(int i=0;i<coursepage.comments.size();i++) {
				Comment c = coursepage.comments.get(i);
				String comment = c.getComments();
				String user    = c.getCommented_by();
				String time    = c.getComments_time();
				System.out.println(comment+"-"+user);
				System.out.println(time);
				System.out.println();
				
				
			}
		}
	}
	
}
