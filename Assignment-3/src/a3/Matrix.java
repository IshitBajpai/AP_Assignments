package a3;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix{
	public Matrix(){}
	
	public double[][] transpose(double[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		double[][] transposedMatrix = new double[cols][rows];
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				transposedMatrix[i][j]=mat[j][i];
			}
		}
		
		//System.out.println(Arrays.deepToString(transposedMatrix));
		return transposedMatrix;
	}
	public void addition(double[][] m1,double[][] m2) {
		int rows = m1.length;
		int cols = m1[0].length;
		
		double[][] addMatrix = new double[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				addMatrix[i][j]=m1[i][j]+m2[i][j];
				
			}
		}
		
		System.out.println(Arrays.deepToString(addMatrix));
	}
	public void subtraction(double[][] m1,double[][] m2) {
		int rows = m1.length;
		int cols = m1[0].length;
		
		double[][] subMatrix = new double[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				subMatrix[i][j]=m1[i][j]-m2[i][j];
				
			}
		}
		
		System.out.println(Arrays.deepToString(subMatrix));
		
	}
	
	public double[][] multiplication(double[][] m1,double[][] m2){
		int r1 = m1.length;
		int r2 = m2.length;
		int c2 = m2[0].length;
		double[][] mulMatrix = new double[r1][c2];
		Null Null = new Null();
		if(Null.check(m1) || Null.check(m2)) {
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					mulMatrix[i][j]=0;
				}
			}
		}else {
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					for(int k=0;k<r2;k++) {
						mulMatrix[i][j]+=m1[i][k]*m2[k][j];
					}
				}
			}
		}
		// if m1 ya m2 type is zero then mission abort!!!
		
		return mulMatrix;
		}
		public double[][] multiplication(int[][] m1,double[][] m2){
			int r1 = m1.length;
			int r2 = m2.length;
			int c2 = m2[0].length;
			double[][] mulMatrix = new double[r1][c2];
			
			
			// if m1 ya m2 type is zero then mission abort!!!
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					for(int k=0;k<r2;k++) {
						mulMatrix[i][j]+=m1[i][k]*m2[i][k];
					}
				}
			}
//		System.out.println(Arrays.deepToString(mulMatrix));
		return mulMatrix;
	}
	public double[][] division(double[][] m1,double[][] m2) {
		square sq = new square();
		double[][] divMatrix = multiplication(m1,sq.inverse(m2));
		System.out.println(Arrays.deepToString(divMatrix));
		return divMatrix;
	}
	public boolean compare(double[][] m1,double[][] m2) {
		int rows = m1.length;
		int flag=0;
		for(int i=0;i<rows;i++) {
			if(Arrays.equals(m1[i],m2[i])==false) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			return false;
		}else {
			return true;
		}
	}
	
	public double[][] rowMean(double[][] m1){
		int rows = m1.length;
		int cols = m1[0].length;
		
		double[][] rowMean = new double[rows][1];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				rowMean[i][0]+=m1[i][j];
				
			}	
			rowMean[i][0]=rowMean[i][0]/(double)cols ; 
		}
		return rowMean;
	}
	public double[][] colMean(double[][] m1){
		int rows = m1.length;
		int cols = m1[0].length;
		
		double[][] colMean = new double[1][cols];
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				 colMean[0][i]+=m1[j][i];
				
			}	
			 colMean[0][i]= colMean[0][i]/(double)cols ; 
		}
		return  colMean;
	}
	public double Mean (double[][] m1) {
		double mean =0;
		int rows = m1.length;
		int cols = m1[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				 mean+=m1[i][j];
				
			}	
		}
		mean = mean/(double)(rows*cols);
		return mean;
		
	}
	public double[][] scalarMultiplication(double[][] m1,int scalar){
		int rows = m1.length;
		int cols = m1[0].length;
		double[][] mularr = new double[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				 mularr[i][j]=m1[i][j]*scalar;
				
			}	
		}
		return mularr;
	}
	public void elementwise1(double[][] m1,double[][] m2) {
		int rows1 = m1.length;
		int cols1 = m1[0].length;
		int rows2 = m2.length;
		int cols2 = m2[0].length;
		
		if(rows1==rows2 && cols1==cols2) {
			double[][] arr = new double[rows1][cols1];
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols1;j++) {
					 arr[i][j]=m1[i][j]*m2[i][j];
					
				}	
			}
		System.out.println(Arrays.deepToString(arr));
		}else {
			System.out.println("Cant do element wise operations");
		}
		
	}
	public void elementwise2(double[][] m1,double[][] m2) {
		int rows1 = m1.length;
		int cols1 = m1[0].length;
		int rows2 = m2.length;
		int cols2 = m2[0].length;
		
		if(rows1==rows2 && cols1==cols2) {
			double[][] arr = new double[rows1][cols1];
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols1;j++) {
					 arr[i][j]=m1[i][j]/(double)m2[i][j];
					
				}	
			}
		System.out.println(Arrays.deepToString(arr));
		}else {
			System.out.println("Cant do element wise operations");
		}
		
	}
	public void scalarop(double[][] sing,double[][] m1,int code) {
		int rows1 = m1.length;
		int cols1 = m1[0].length;
		double scalar = sing[0][0];
		if(sing.length==1 && sing[0].length==1) {
			double[][] arr = new double[rows1][cols1];
			if(code==1) {
				for(int i=0;i<rows1;i++) {
					for(int j=0;j<cols1;j++) {
							arr[i][j]=m1[i][j]*scalar ;
						}
					}
				System.out.println(Arrays.deepToString(arr));
			}
			if(code==2) {
				for(int i=0;i<rows1;i++) {
					for(int j=0;j<cols1;j++) {
							arr[i][j]=m1[i][j]/(double)scalar ;
						}
					}
				System.out.println(Arrays.deepToString(arr));
			}
		}else {
			System.out.println("First one is not Singleton!!");
		}
	
		
	}
	static ArrayList<Null> nullMatrices= new ArrayList<>();
	static ArrayList<Ones> onesMatrices= new ArrayList<>();
	static ArrayList<Diagonal> diagonalMatrices = new ArrayList<>();
	static ArrayList<square> squareMatrices = new ArrayList<>();
	static ArrayList<rectangular> rectangularMatrices = new ArrayList<>();
	static ArrayList<Singleton> SingularMatrices = new ArrayList<>();
	
	
	public void addNull(char id,int rows,int cols,String type) {
		nullMatrices.add(new Null(id,rows,cols,type));
	}
	public void addOnes(char id,int rows,int cols,String type) {
		onesMatrices.add(new Ones(id,rows,cols,type));
	}
	public void addDiagonal(char id,ArrayList<Double> diagonalelements,String type) {
		diagonalMatrices.add(new Diagonal(id,diagonalelements,type));
	}
	public void addSquare(char id,double[][] matrices,String type) {
		squareMatrices.add(new square(id,matrices,type));
	}
	
	public void addRectangular(char id,double[][] matrices,String type) {
		rectangularMatrices.add(new rectangular(id,matrices,type));
	}
	public void addSingular(char id,double ele,String type) {
		SingularMatrices.add(new Singleton(id,ele,type));
	}
	public int getcols(char id) {
		
		square sq  = new square();
		rectangular rect = new rectangular();
		Null Null = new Null();
		Ones Ones = new Ones();
		Diagonal Diagonal = new Diagonal();
		
		for(int i=0;i<Matrix.nullMatrices.size();i++) {
			 Null = Matrix.nullMatrices.get(i);
			 if(id==Null.getId()) {
				return Null.getCols();
			 }
			 
			 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
		}
		for(int i=0;i<Matrix.onesMatrices.size();i++) {
			 Ones = Matrix.onesMatrices.get(i);
			 if(id==Ones.getId()) {
				 return Ones.getCols();
			 }
			 
			 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
		}
		for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
			Diagonal = Matrix.diagonalMatrices.get(i);
			if(id==Diagonal.getId()) {
				 return Diagonal.getDiagonalelements().size();
			 }
			

			 //System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
		}
		for(int i=0;i<Matrix.squareMatrices.size();i++) {
			 sq = Matrix.squareMatrices.get(i);
			 if(id==sq.getId()) {
				return sq.getMatrices()[0].length;
			 }
			 
			 //System.out.println(sq.getId()+" "+Arrays.deepToString(sq.getMatrices())+""+sq.getType());
		}
		for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
			 rect = Matrix.rectangularMatrices.get(i);
			 if(id==rect.getId()) {
				 return rect.getMatrices()[0].length;
			 }
			 			 //System.out.println(rect.getId()+" "+Arrays.deepToString(rect.getMatrices())+""+rect.getType());
		}
		return 0;
	}
public int getrows(char id) {
		
		square sq  = new square();
		rectangular rect = new rectangular();
		Null Null = new Null();
		Ones Ones = new Ones();
		Diagonal Diagonal = new Diagonal();
		
		for(int i=0;i<Matrix.nullMatrices.size();i++) {
			 Null = Matrix.nullMatrices.get(i);
			 if(id==Null.getId()) {
				return Null.getRows();
			 }
			 
			 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
		}
		for(int i=0;i<Matrix.onesMatrices.size();i++) {
			 Ones = Matrix.onesMatrices.get(i);
			 if(id==Ones.getId()) {
				 return Ones.getRows();
			 }
			 
			 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
		}
		for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
			Diagonal = Matrix.diagonalMatrices.get(i);
			if(id==Diagonal.getId()) {
				 return Diagonal.getDiagonalelements().size();
			 }
			

			 //System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
		}
		for(int i=0;i<Matrix.squareMatrices.size();i++) {
			 sq = Matrix.squareMatrices.get(i);
			 if(id==sq.getId()) {
				return sq.getMatrices().length;
			 }
			 
			 //System.out.println(sq.getId()+" "+Arrays.deepToString(sq.getMatrices())+""+sq.getType());
		}
		for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
			 rect = Matrix.rectangularMatrices.get(i);
			 if(id==rect.getId()) {
				 return rect.getMatrices().length;
			 }
			 			 //System.out.println(rect.getId()+" "+Arrays.deepToString(rect.getMatrices())+""+rect.getType());
		}
		return 0;
	}
	public void changemat(char Id1,double[][] mat) {
		double[][] id1 = new double[getrows(Id1)][getcols(Id1)];
		square sq  = new square();
		rectangular rect = new rectangular();
		Null Null = new Null();
		Ones Ones = new Ones();
		Diagonal Diagonal = new Diagonal();
		
		
		for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
			Diagonal = Matrix.diagonalMatrices.get(i);
			if(Id1==Diagonal.getId()) {
				 ArrayList<Double> de = new ArrayList<>();
				 for(int j=0;j<mat.length;j++) {
					 de.add(mat[j][j]);
				 }
				 Diagonal.setDiagonalelements(de);
			 }
			

			 //System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
		}
		for(int i=0;i<Matrix.squareMatrices.size();i++) {
			 sq = Matrix.squareMatrices.get(i);
			 if(Id1==sq.getId()) {
				 sq.setMatrices(mat);
			 }
			 
			 //System.out.println(sq.getId()+" "+Arrays.deepToString(sq.getMatrices())+""+sq.getType());
		}
		for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
			 rect = Matrix.rectangularMatrices.get(i);
			 if(Id1==rect.getId()) {
				rect.setMatrices(mat);
			 }
			 
			 //System.out.println(rect.getId()+" "+Arrays.deepToString(rect.getMatrices())+""+rect.getType());
		}
		
	}
	public double[][] searchbyId(char Id1) {
		//searching in null
		double[][] id1 = new double[getrows(Id1)][getcols(Id1)];
		square sq  = new square();
		rectangular rect = new rectangular();
		Null Null = new Null();
		Ones Ones = new Ones();
		Diagonal Diagonal = new Diagonal();
		
		for(int i=0;i<Matrix.nullMatrices.size();i++) {
			 Null = Matrix.nullMatrices.get(i);
			 if(Id1==Null.getId()) {
				 id1 = Null.displayNull(Null.getRows(),Null.getCols());
			 }
			 
			 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
		}
		for(int i=0;i<Matrix.onesMatrices.size();i++) {
			 Ones = Matrix.onesMatrices.get(i);
			 if(Id1==Ones.getId()) {
				 id1 = Ones.displayOnes(Ones.getRows(),Ones.getCols());
			 }
			 
			 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
		}
		for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
			Diagonal = Matrix.diagonalMatrices.get(i);
			if(Id1==Diagonal.getId()) {
				 id1 = Diagonal.displayDiagonal(Diagonal.getDiagonalelements());
			 }
			

			 //System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
		}
		for(int i=0;i<Matrix.squareMatrices.size();i++) {
			 sq = Matrix.squareMatrices.get(i);
			 if(Id1==sq.getId()) {
				 id1 =sq.getMatrices();
			 }
			 
			 //System.out.println(sq.getId()+" "+Arrays.deepToString(sq.getMatrices())+""+sq.getType());
		}
		for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
			 rect = Matrix.rectangularMatrices.get(i);
			 if(Id1==rect.getId()) {
				 id1 =rect.getMatrices();
			 }
			 
			 //System.out.println(rect.getId()+" "+Arrays.deepToString(rect.getMatrices())+""+rect.getType());
		}
		return id1;
	}
	public String searchbyIdtypes(char Id1) {
		//searching in null
		String t = "";
		square sq  = new square();
		rectangular rect = new rectangular();
		Null Null = new Null();
		Ones Ones = new Ones();
		Diagonal Diagonal = new Diagonal();
		
		for(int i=0;i<Matrix.nullMatrices.size();i++) {
			 Null = Matrix.nullMatrices.get(i);
			 if(Id1==Null.getId()) {
				t=Null.getType();
			 }
			 
			 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
		}
		for(int i=0;i<Matrix.onesMatrices.size();i++) {
			 Ones = Matrix.onesMatrices.get(i);
			 if(Id1==Ones.getId()) {
				 t=Ones.getType();
			 }
			 
			 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
		}
		for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
			Diagonal = Matrix.diagonalMatrices.get(i);
			if(Id1==Diagonal.getId()) {
				 t=Diagonal.getType();
			 }
			

			 //System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
		}
		for(int i=0;i<Matrix.squareMatrices.size();i++) {
			 sq = Matrix.squareMatrices.get(i);
			 if(Id1==sq.getId()) {
				t=sq.getType();
			 }
			 
			 //System.out.println(sq.getId()+" "+Arrays.deepToString(sq.getMatrices())+""+sq.getType());
		}
		for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
			 rect = Matrix.rectangularMatrices.get(i);
			 if(Id1==rect.getId()) {
				 t=rect.getType();
			 }
			 
			 //System.out.println(rect.getId()+" "+Arrays.deepToString(rect.getMatrices())+""+rect.getType());
		}
		return t;
	}
	public double[][] displayNull(int row,int col) {
		double[][] nullarr = new double[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				nullarr[i][j]=0;
			}
		}
		//System.out.println(Arrays.deepToString(nullarr));
		return nullarr;
	} 
	public double[][] displayOnes(int row,int col) {
		double[][] Onesarr = new double[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Onesarr[i][j]=1;
			}
		}
		//System.out.println(Arrays.deepToString(Onesarr));
		return Onesarr;
	} 
	public double[][] displayDiagonal(ArrayList<Double> diagonalelements) {
		int row = diagonalelements.size();
		int col = row;
		int count = 0;
		double[][] Diagonalarr = new double[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					Diagonalarr[i][j]=diagonalelements.get(count);
					count++;
				}else {
					Diagonalarr[i][j]=0;
				}
				
			}
		}
		//System.out.println(Arrays.deepToString(Diagonalarr));
		return Diagonalarr;
	} 
	
//	public Matrix(){}
//	
//	public double[][] transpose(double[][] mat){
//		int rows = mat.length;
//		int cols = mat[0].length;
//		
//		double[][] transposedMatrix = new double[cols][rows];
//		for(int i=0;i<cols;i++) {
//			for(int j=0;j<rows;j++) {
//				transposedMatrix[i][j]=mat[j][i];
//			}
//		}
//		
//		//System.out.println(Arrays.deepToString(transposedMatrix));
//		return transposedMatrix;
//	}
//	public void addition(double[][] m1,double[][] m2) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		double[][] addMatrix = new double[rows][cols];
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				addMatrix[i][j]=m1[i][j]+m2[i][j];
//				
//			}
//		}
//		
//		System.out.println(Arrays.deepToString(addMatrix));
//	}
//	public void subtraction(double[][] m1,double[][] m2) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		double[][] subMatrix = new double[rows][cols];
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				subMatrix[i][j]=m1[i][j]-m2[i][j];
//				
//			}
//		}
//		
//		System.out.println(Arrays.deepToString(subMatrix));
//		
//	}
//	public double[][] multiplication(double[][] m1,double[][] m2){
//		int r1 = m1.length;
//		int r2 = m2.length;
//		int c2 = m2[0].length;
//		double[][] mulMatrix = new double[r1][c2];
//		Null Null = new Null();
//		if(Null.check(m1) || Null.check(m2)) {
//			for(int i=0;i<r1;i++) {
//				for(int j=0;j<c2;j++) {
//					mulMatrix[i][j]=0;
//				}
//			}
//		}else {
//			for(int i=0;i<r1;i++) {
//				for(int j=0;j<c2;j++) {
//					for(int k=0;k<r2;k++) {
//						mulMatrix[i][j]+=m1[i][k]*m2[k][j];
//					}
//				}
//			}
//		}
//		// if m1 ya m2 type is zero then mission abort!!!
//		
//		return mulMatrix;
//		}
//		public double[][] multiplication(int[][] m1,double[][] m2){
//			int r1 = m1.length;
//			int r2 = m2.length;
//			int c2 = m2[0].length;
//			double[][] mulMatrix = new double[r1][c2];
//			
//			
//			// if m1 ya m2 type is zero then mission abort!!!
//			for(int i=0;i<r1;i++) {
//				for(int j=0;j<c2;j++) {
//					for(int k=0;k<r2;k++) {
//						mulMatrix[i][j]+=m1[i][k]*m2[i][k];
//					}
//				}
//			}
////		System.out.println(Arrays.deepToString(mulMatrix));
//		return mulMatrix;
//	}
//	public double[][] division(double[][] m1,double[][] m2) {
//		square sq = new square();
//		double[][] divMatrix = multiplication(m1,sq.inverse(m2));
//		System.out.println(Arrays.deepToString(divMatrix));
//		return divMatrix;
//	}
//	public boolean compare(double[][] m1,double[][] m2) {
//		int rows = m1.length;
//		int flag=0;
//		for(int i=0;i<rows;i++) {
//			if(Arrays.equals(m1[i],m2[i])==false) {
//				flag=1;
//				break;
//			}
//		}
//		if(flag==1) {
//			return false;
//		}else {
//			return true;
//		}
//	}
//	
//	public double[][] rowMean(double[][] m1){
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		double[][] rowMean = new double[rows][1];
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				rowMean[i][0]+=m1[i][j];
//				
//			}	
//			rowMean[i][0]=rowMean[i][0]/(double)cols ; 
//		}
//		return rowMean;
//	}
//	public double[][] colMean(double[][] m1){
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		double[][] colMean = new double[1][cols];
//		for(int i=0;i<cols;i++) {
//			for(int j=0;j<rows;j++) {
//				 colMean[0][i]+=m1[j][i];
//				
//			}	
//			 colMean[0][i]= colMean[0][i]/(double)cols ; 
//		}
//		return  colMean;
//	}
//	public double Mean (double[][] m1) {
//		double mean =0;
//		int rows = m1.length;
//		int cols = m1[0].length;
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				 mean+=m1[i][j];
//				
//			}	
//		}
//		mean = mean/(double)(rows*cols);
//		return mean;
//		
//	}
//	public double[][] scalarMultiplication(double[][] m1,int scalar){
//		int rows = m1.length;
//		int cols = m1[0].length;
//		double[][] mularr = new double[rows][cols];
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				 mularr[i][j]=m1[i][j]*scalar;
//				
//			}	
//		}
//		return mularr;
//	}
//	public void elementwise1(double[][] m1,double[][] m2) {
//		int rows1 = m1.length;
//		int cols1 = m1[0].length;
//		int rows2 = m2.length;
//		int cols2 = m2[0].length;
//		
//		if(rows1==rows2 && cols1==cols2) {
//			double[][] arr = new double[rows1][cols1];
//			for(int i=0;i<rows1;i++) {
//				for(int j=0;j<cols1;j++) {
//					 arr[i][j]=m1[i][j]*m2[i][j];
//					
//				}	
//			}
//		System.out.println(Arrays.deepToString(arr));
//		}else {
//			System.out.println("Cant do element wise operations");
//		}
//		
//	}
//	public void elementwise2(double[][] m1,double[][] m2) {
//		int rows1 = m1.length;
//		int cols1 = m1[0].length;
//		int rows2 = m2.length;
//		int cols2 = m2[0].length;
//		
//		if(rows1==rows2 && cols1==cols2) {
//			double[][] arr = new double[rows1][cols1];
//			for(int i=0;i<rows1;i++) {
//				for(int j=0;j<cols1;j++) {
//					 arr[i][j]=m1[i][j]/(double)m2[i][j];
//					
//				}	
//			}
//		System.out.println(Arrays.deepToString(arr));
//		}else {
//			System.out.println("Cant do element wise operations");
//		}
//		
//	}
//	public void scalarop(double[][] sing,double[][] m1,int code) {
//		int rows1 = m1.length;
//		int cols1 = m1[0].length;
//		double scalar = sing[0][0];
//		if(sing.length==1 && sing[0].length==1) {
//			double[][] arr = new double[rows1][cols1];
//			if(code==1) {
//				for(int i=0;i<rows1;i++) {
//					for(int j=0;j<cols1;j++) {
//							arr[i][j]=m1[i][j]*scalar ;
//						}
//					}
//				System.out.println(Arrays.deepToString(arr));
//			}
//			if(code==2) {
//				for(int i=0;i<rows1;i++) {
//					for(int j=0;j<cols1;j++) {
//							arr[i][j]=m1[i][j]/(double)scalar ;
//						}
//					}
//				System.out.println(Arrays.deepToString(arr));
//			}
//		}else {
//			System.out.println("First one is not Singleton!!");
//		}
//	
//		
//	}
	public String gettypes(double[][] matrix) {
		
		Matrix m = new Matrix();
		square sq  = new square();
		rectangular rect = new rectangular();
		
		Null Null = new Null();
		Ones Ones = new Ones();
		
		Singular Singular = new Singular();
		Singleton Singleton = new Singleton();
		
		Symetric Symetric = new Symetric();
		SkewSymetric SkewSymetric = new SkewSymetric();
		
		Diagonal Diagonal = new Diagonal();
		Identity Identity = new Identity();
		Scalar Scalar = new Scalar();
		
		LowerTriangular  LowerTriangular = new LowerTriangular();
		UpperTriangular  UpperTriangular = new UpperTriangular();
		
		ColumnMatrix cm = new ColumnMatrix();
		RowMatrix rm = new RowMatrix();
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		String type;
		if(rows==cols) {
			type="Square ";
		}else {
			type="Rectangular ";
		}
		if(Null.check(matrix)) {
			type+="Null ";
		}
		if(Ones.check(matrix)){
			type+="Ones ";
		}
		if(Singular.check(matrix)){
			type+="Singular ";
		}
		if(Singleton.check(matrix)){
			type+="Singleton ";
		}
		if(Symetric.check(matrix)){
			type+="Symetric ";
		}
		if(SkewSymetric.check(matrix)) {
			type+="SkewSymetric ";
		}
		if(Diagonal.check(matrix)) {
			type+="Diagonal ";
		}
		if(Scalar.check(matrix)){
			type+="Scalar ";
		}
		if(Identity.check(matrix)){
			type+="Identity ";
		}
		if(LowerTriangular.check(matrix)) {
			type+="LowerTriangular ";
		}
		if(UpperTriangular.check(matrix)) {
			type+="UpperTriangular ";
		}
		if(cm.check(matrix)) {
			type+="Column ";
		}
		if(rm.check(matrix)) {
			type+="Row ";
		}
		return type;
	}
}
