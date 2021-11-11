package a3;

public class RowMatrix extends Matrix{
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		if(rows==1) {
			return true;
		}
		return false;
	}
}
