package a3;

public class ColumnMatrix extends Matrix{
	
	
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		if(cols==1) {
			return true;
		}
		return false;
	}
}
