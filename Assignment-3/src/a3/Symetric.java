package a3;

import java.util.Arrays;

public class Symetric extends square{
	
	@Override
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		int flag = 0;
		if(rows==cols) {
			//System.out.print(Arrays.deepToString(super.transpose(m1)));
			if(super.compare(m1,super.transpose(m1))) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}

