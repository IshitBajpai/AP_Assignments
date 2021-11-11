package a3;

public class square extends Matrix{
	private double[][] matrices;
	private char id;
	private String type;
	
	public square() {}
	public square(char id,double[][] matrices,String type) {
		this.setId(id);
		this.setMatrices(matrices);
		this.setType(type);
	}
		

	public double determinants(double[][] mat) {
		double res=0;
		int rows = mat.length;
		int cols = mat[0].length;
		if(rows==cols && rows==2){
			res=(mat[0][0]*mat[1][1])-(mat[0][1]*mat[1][0]);
		}
		else if(rows==cols && rows==3) {
		double a = mat[0][0]*((mat[2][2]*mat[1][1])-(mat[2][1]*mat[1][2]));
		double b = mat[0][1]*((mat[1][0]*mat[2][2])-(mat[1][2]*mat[2][0]));
		double c = mat[0][2]*((mat[1][0]*mat[2][1])-(mat[1][1]*mat[2][0]) );
		res = a-b+c;	
		}
		else if(rows==cols && rows==1) {
			res=mat[0][0];
		}
		//System.out.println("determinant of matrix: "+res);
		return res;
	}

	public double[][] inverse(double[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		double[][] invertedMatrix = new double[mat.length][mat.length];
		double determinant = determinants(mat);
		if(rows ==1) {
			invertedMatrix[0][0]=1/(double)mat[0][0];
	
		}
		else if(rows==2) {
			invertedMatrix[0][0]=mat[1][1]/determinant;
			invertedMatrix[1][1]=mat[0][0]/determinant;
			invertedMatrix[0][1]=-mat[0][1]/determinant;
			invertedMatrix[1][0]=-mat[1][0]/determinant;
		}
		else if(rows==3) {
			for(int i = 0;i<3;i++) {
				for(int j=0;j<3;j++) {
					invertedMatrix[i][j]=(mat[(j+1)%3][(i+1)%3] * mat[(j+2)%3][(i+2)%3]) - (mat[(j+1)%3][(i+2)%3] * mat[(j+2)%3][(i+1)%3])/ determinant;
					}
				}
		}
			
		return invertedMatrix;
	}
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		if(rows==cols) {
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

