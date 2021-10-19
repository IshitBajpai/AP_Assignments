package a2;

public class classmaterial{
	private String class_material_title;
	private String class_material_type;
	private String class_material_timestamp;
	private String class_material_uploader;
	private String class_material_content;
	private int class_material_numberofslides;
	
	classmaterial(String class_material_title,String class_material_type,String class_material_timestamp,String class_material_uploader,String class_material_content,int class_material_numberofslides){
		this.setClass_material_title(class_material_title);
		this.setClass_material_type(class_material_type);
		this.setClass_material_timestamp(class_material_timestamp);
		this.setClass_material_uploader(class_material_uploader);
		this.setClass_material_content(class_material_content);
		this.setClass_material_numberofslides(class_material_numberofslides);
	}
	public String getClass_material_title() {
		return class_material_title;
	}
	public void setClass_material_title(String class_material_title) {
		this.class_material_title = class_material_title;
	}
	public String getClass_material_type() {
		return class_material_type;
	}
	public void setClass_material_type(String class_material_type) {
		this.class_material_type = class_material_type;
	}
	public String getClass_material_timestamp() {
		return class_material_timestamp;
	}
	public void setClass_material_timestamp(String class_material_timestamp) {
		this.class_material_timestamp = class_material_timestamp;
	}
	public String getClass_material_uploader() {
		return class_material_uploader;
	}
	public void setClass_material_uploader(String class_material_uploader) {
		this.class_material_uploader = class_material_uploader;
	}
	public String getClass_material_content() {
		return class_material_content;
	}
	public void setClass_material_content(String class_material_content) {
		this.class_material_content = class_material_content;
	}
	public int getClass_material_numberofslides() {
		return class_material_numberofslides;
	}
	public void setClass_material_numberofslides(int class_material_numberofslides) {
		this.class_material_numberofslides = class_material_numberofslides;
	}
	
}