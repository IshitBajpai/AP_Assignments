package a3;

import java.util.ArrayList;

public class Diagonal extends square{
	private char id;
	private ArrayList<Double> diagonalelements;
	private String type;
	
	public Diagonal() {}
	public Diagonal(char id,ArrayList<Double> diagonalelements,String type) 
	{
		this.setId(id);
		this.setType(type);
		this.setDiagonalelements(diagonalelements);
		
	}
	@Override
	public boolean check(double[][] m1) {

		
		
		int rows = m1.length;
		int cols = m1[0].length;
		if(rows==cols) {
			int flag=1;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(m1[i][j]!=0 && i!=j) {
						flag=0;
						break;
					}
				}
			}
			if(flag==1) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
	}
	
	@Override
	public double determinants(double[][] m1) {
		
		ArrayList<Double> diagonalelements = new ArrayList<>();
		double det = 1;
		for(int i=0;i<m1.length;i++) {
			det*=m1[i][i];
		}
		return det;
	}
	
	
	public  double determinants(ArrayList<Double> diagonalelements) {
		int rows =diagonalelements.size();
		double det = 1;
		for(int i=0;i<rows;i++) {
			det*=diagonalelements.get(i);
		}
		return det;
	}
	public ArrayList<Double> getDiagonalelements() {
		return diagonalelements;
	}
	public void setDiagonalelements(ArrayList<Double> diagonalelements) {
		this.diagonalelements = diagonalelements;
	}
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
