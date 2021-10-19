package a2;

import java.util.Scanner;

public class Assessment {
	 private coursepage c;
	 private String assessment_type;
	 private String assessment_ques;
	 private String assessment_uploader;
	 private int assessment_marks;
	 private String assessment_status;
	 
	 
	 Assessment(){}
	 Assessment(String assessment_ques,int assessment_marks,String assessment_type,String assessment_uploader,String assessment_status){
		this.setAssessment_type(assessment_type);
		this.setAssessment_ques(assessment_ques);
		this.setAssessment_uploader(assessment_uploader);
		this.setAssessment_marks(assessment_marks);
		this.setAssessment_status(assessment_status);
	 }
	public String getAssessment_type() {
		return assessment_type;
	}
	public void setAssessment_type(String assessment_type) {
		this.assessment_type = assessment_type;
	}
	public String getAssessment_ques() {
		return assessment_ques;
	}
	public void setAssessment_ques(String assessment_ques) {
		this.assessment_ques = assessment_ques;
	}
	public String getAssessment_uploader() {
		return assessment_uploader;
	}

	public void setAssessment_uploader(String assessment_uploader) {
		this.assessment_uploader = assessment_uploader;
	}
	public int getAssessment_marks() {
		return assessment_marks;
	}
	public void setAssessment_marks(int assessment_marks) {
		this.assessment_marks = assessment_marks;
	}
	public String getAssessment_status() {
		return assessment_status;
	}
	public void setAssessment_status(String assessment_status) {
		this.assessment_status = assessment_status;
	}
	 
	 
}