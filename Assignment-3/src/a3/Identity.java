package a3;

public class Identity extends Scalar{
	public boolean check(double[][] m1) {
		int rows = m1.length;
		int cols = m1[0].length;
		if(rows==cols) {
			int flag=1;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(m1[i][j]!=0 && i!=j) {
						flag=0;
						break;
					}
				}
			}
			int ele = 1;
			for(int i=0;i<rows;i++) {
				if(m1[i][i]!=ele) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
	}
}
