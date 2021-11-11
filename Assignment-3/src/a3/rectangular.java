package a3;

public class rectangular extends Matrix{
	private double[][] matrices;
	private char id;
	private String type;
	
	public rectangular(){}
	public rectangular(char id,double[][] matrices,String type) {
		this.setId(id);
		this.setMatrices(matrices);
		this.setType(type);
	}
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		if(rows!=cols) {
			return true;
		}
		return false;
	}
	
	
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public double[][] getMatrices() {
		return matrices;
	}
	public void setMatrices(double[][] matrices) {
		this.matrices = matrices;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
