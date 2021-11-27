package a4_2;

import java.util.Arrays;

public class Negatives
{
	
	public static <E> void computeNegative(E e) {
		if (e instanceof Gray) {
			Gray g = (Gray)e;
			int rows = g.getGreyMat().length;
			int cols = g.getGreyMat()[0].length;
			int[][] negMat = new int[rows][cols];

			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					negMat[i][j] = 255 - (int)g.getGreyMat()[i][j]; 	
				}
			}
			System.out.println("Negative :"+Arrays.deepToString(negMat));
		}
		else if(e instanceof Color) {
			Color c = (Color)e;
			int rows = c.getBlue().length;
			int cols =c.getBlue()[0].length;
			int[][] Img1 = new int[rows][cols];
			int[][] Img2 = new int[rows][cols];
			int[][] Img3 = new int[rows][cols];	
			for(int i=0;i<rows;i++) {
					for(int j=0;j<cols;j++) {
						Img1[i][j]=255-c.getRed()[i][j];
						Img2[i][j]=255-c.getGreen()[i][j];
						Img3[i][j]=255-c.getBlue()[i][j];
						
					}
			}
			System.out.println("Negative :");
			System.out.println("Red:"+Arrays.deepToString(Img1)+" Green:"+Arrays.deepToString(Img2)+" Blue:"+Arrays.deepToString(Img3));
			
			
			
		}
	}
}
