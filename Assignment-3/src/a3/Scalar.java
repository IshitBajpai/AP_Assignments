package a3;

import java.util.ArrayList;

public class Scalar extends Diagonal{
	
	@Override
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		if(rows==cols) {
			int flag=1;
			double ele = m1[0][0];
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(i!=j) {
						if(m1[i][j]!=0) {
							flag=0;
							return false;
							
						}
					}
					if(i==j) {
						if(m1[i][i]!=ele) {
							return false;
						}
					}
					
				}
			}
			return true;	
		}
		return false;
	}
	@Override
	public  double determinants(ArrayList<Double> diagonalelements) {
		int rows =diagonalelements.size();
		double det = 1;
		for(int i=0;i<rows;i++) {
			det*=diagonalelements.get(i);
		}
		return det;
	}
	
}
