package a4_2;

import java.util.ArrayList;

public class Color
{
	static ArrayList<Color> colImg= new ArrayList<>();
	
	private int[][] Red;
	private int[][] Green;
	private int[][] Blue;
	private int id;
	public Color() {}
	public Color(int[][] Red,int[][] Green,int[][] Blue,int id) 
	{
		
		this.setRed(Red);
		this.setGreen(Green);
		this.setBlue(Blue);
		this.setId(id);
		
	}
	
	public int[][] getRed() {
		return Red;
	}
	public void setRed(int[][] red) {
		Red = red;
	}
	public int[][] getGreen() {
		return Green;
	}
	public void setGreen(int[][] green) {
		Green = green;
	}
	public int[][] getBlue() {
		return Blue;
	}
	public void setBlue(int[][] blue) {
		Blue = blue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 
	
}
