package a3;

public class Null extends Matrix{
	private char id;
	private int rows;
	private int cols;
	private String type;
	
	public Null(){}
	public Null(char id,int rows,int cols,String type) {
		this.setId(id);
		this.setRows(rows);
		this.setCols(cols);
		this.setType(type);
	}
	
	
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		
		int flag = 0;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(m1[i][j]!=0) {
					flag=1;
					break;
				}
				
			}
		}
		if(flag==0) {
			return true;
		}
		return false;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getCols() {
		return cols;
	}
	public void setCols(int cols) {
		this.cols = cols;
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
