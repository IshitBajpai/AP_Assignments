package a3;

public class Singular extends square{
	@Override
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		if(super.determinants(m1)==0 && rows==cols) {
			return true;
		}
		return false;
	}
	
}
