package a3;

import java.util.ArrayList;

public class LowerTriangular extends square{
	@Override
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		int flag = 0;
		if(rows==cols && rows!=1) {
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(j>i) {
						if(m1[i][j]!=0  ) {
							flag=1;
							break;
						}
					}
					
					
				}
			}
			if(flag==0) {
				return true;
			}
			return false;
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
}	

