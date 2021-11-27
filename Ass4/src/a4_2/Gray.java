package a4_2;

import java.util.ArrayList;

public class Gray
{
	static ArrayList<Gray> greyImg= new ArrayList<>();
	private int[][] greyMat;
	private int id;
	public Gray() {}
	public Gray(int[][] greyMat,int id) {
		this.setGreyMat(greyMat);
		this.setId(id);
	}
	public int[][] getGreyMat() {
		return greyMat;
	}
	public void setGreyMat(int[][] greyMat) {
		this.greyMat = greyMat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}