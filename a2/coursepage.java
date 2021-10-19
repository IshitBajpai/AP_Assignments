package a2;

import java.util.ArrayList;

public class coursepage{
	
	static  ArrayList<classmaterial> classMaterials= new ArrayList<>();
	static  ArrayList<Assessment> assessments= new ArrayList<>();
	static  ArrayList<Comment> comments= new ArrayList<>();
	static ArrayList<students> studentSubmissions = new ArrayList<>();
	coursepage(){
		
	}
	public void addclassmaterials(String title,String type,String time,String class_material_uploader,String content,int slidenumber){
		classMaterials.add(new classmaterial(title,type,time,class_material_uploader,content,slidenumber));
	}

	public void addAssessment(String ques,int marks,String type,String uploader,String assessment_status){
		assessments.add(new Assessment(ques,marks,type,uploader,assessment_status));
	}
	public void addComments(String com,String commentedby,String date) {
		comments.add(new Comment(com,commentedby,date));
		
	}
	public void addSubmissions(String name,int marks_obtained,int assignment_index,int graded,String zipfile,String gradedby) {
		studentSubmissions.add(new students(name,marks_obtained,assignment_index,graded,zipfile,gradedby));
	}
	
	
}
