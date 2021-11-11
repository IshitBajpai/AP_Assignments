package a3;

import java.util.Arrays;

public class SkewSymetric extends square{
	@Override
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		double[][] transposedm1 = super.transpose(m1);
		double[][] mularr = super.scalarMultiplication(transposedm1, -1);
		//System.out.println("ske"+Arrays.deepToString(mularr));
		int flag=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(mularr[i][j]!=m1[i][j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	
}