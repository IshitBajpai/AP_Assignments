package a3;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		char id='a';
		while(true) {
			System.out.print("Select option:");
			int input = scn.nextInt();
			
			if(input==1) {
				
				System.out.print("Enter number of rows:");
				int rows = scn.nextInt();
				System.out.print("Enter number of columns:");
				int cols = scn.nextInt();
				
				double[][] matrix = new double[rows][cols];
				for(int i=0;i<rows;i++) {
					for(int j=0;j<cols;j++) {
						System.out.print("Enter elements in matrix:");
						double element = scn.nextDouble();
						matrix[i][j]=element;
						
					}
				}
				
				System.out.println(Arrays.deepToString(matrix));
				System.out.println("Id:"+id);
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
				
				
				
				String type;
				if(sq.check(matrix)) {
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
				
				//storing now
				if(type.contains("Null")) {
					//System.out.println("Null");
					Null.addNull(id, rows, cols,type);
				}
				else if(type.contains("Ones")) {
					//System.out.println("Ones");
					Ones.addOnes(id, rows, cols,type);
				}
				else if(type.contains("Diagonal")) {
					//System.out.println("Diagonal");
					ArrayList<Double> diagonalelements = new ArrayList<>();
					for(int i=0;i<rows;i++) {
						diagonalelements.add(matrix[i][i]);
					}
					Diagonal.addDiagonal(id, diagonalelements, type);
				}
				else if(type.contains("Square")){
					//System.out.println("square");
					sq.addSquare(id, matrix, type);;
				}
				else if(type.contains("Rectangular")){
					//System.out.println("rectangular");
					rect.addRectangular(id, matrix, type);
				}
				else if(type.contains("Singleton")) {
					//System.out.println("Null");
					Singular.addSingular(id, matrix[0][0], type);
				}
				
				
				id++;
				
			}
			if(input==2){
				System.out.print("Choose matrix type:");
				String MatrixType = scn.next();
				
				System.out.print("Choose number of rows");
				int row = scn.nextInt();
				System.out.print("Choose number of colums");
				int col = scn.nextInt();
				
				Matrix m = new Matrix();
				square sq  = new square();
				rectangular rect = new rectangular();
				Null Null = new Null();
				Ones Ones = new Ones();
				Diagonal Diagonal = new Diagonal();
				
				
				if(row==1 && col==1) {
					if(MatrixType.equals("Null") || MatrixType.equals("Singleton") || MatrixType.equals("Square") || MatrixType.equals("Diagonal") || MatrixType.equals("Scalar") || MatrixType.equals("Row") || MatrixType.equals("Column") || MatrixType.equals("LowerTriangular") ||  MatrixType.equals("UpperTriangular") ||  MatrixType.equals("Singular") ||  MatrixType.equals("Symetric") ||  MatrixType.equals("SkewSymetric") ){
						String type = "Null Singleton Square Diagonal Scalar Row Column LowerTriangular LowerTriangular UpperTriangular Singular Symetric SkewSymetric ";
						Null.addNull('i',1,1,type);
						System.out.println("Matrix created with ID:i");
					}
					if(MatrixType.equals("Ones") || MatrixType.equals("Identity")){
						String type = "Ones Identity ";
						Ones.addOnes('j', 1, 1,type);
						System.out.println("Matrix created with ID:j");
					}
				}
				if(row==1 && col==2) {
					if(MatrixType.equals("Null")) {
						String type = "Null Row Rectangular ";
						Null.addNull('k',1,2,type);
						System.out.println("Matrix created with ID:k");
					}
					if(MatrixType.equals("Ones")) {
						String type = "Ones Row Rectangular ";
						Null.addNull('l',1,2,type);
						System.out.println("Matrix created with ID:l");
					}
				}
				if(row==2 && col==1) {
					if(MatrixType.equals("Null")) {
						String type = "Null Column Rectangular ";
						Null.addNull('m',2,1,type);
						System.out.println("Matrix created with ID:m");
					}
					if(MatrixType.equals("Ones")) {
						String type = "Ones Column Rectangular ";
						Null.addNull('n',2,1,type);
						System.out.println("Matrix created with ID:n");
					}
				}
				if(row==1 && col==3) {
					if(MatrixType.equals("Null")) {
						String type = "Null Row Rectangular ";
						Null.addNull('o',1,3,type);
						System.out.println("Matrix created with ID:o");
					}
					if(MatrixType.equals("Ones")) {
						String type = "Ones Row Rectangular ";
						Null.addNull('p',1,3,type);
						System.out.println("Matrix created with ID:p");
					}
				}
				if(row==3 && col==1) {
					if(MatrixType.equals("Null")) {
						String type = "Null Column Rectangular ";
						Null.addNull('q',3,1,type);
						System.out.println("Matrix created with ID:q");
					}
					if(MatrixType.equals("Ones")) {
						String type = "Ones Column Rectangular ";
						Null.addNull('r',3,1,type);
						System.out.println("Matrix created with ID:r");
					}
				}
				if(row==2 && col==2) {
					if(MatrixType.equals("Null")  || MatrixType.equals("Square")   ||  MatrixType.equals("Singular") ||  MatrixType.equals("Symetric") ||  MatrixType.equals("SkewSymetric") ){
						String type = "Null Singleton Square  Singular Symetric SkewSymetric ";
						Null.addNull('s',2,2,type);
						System.out.println("Matrix created with ID:s");
					}
					if(MatrixType.equals("Identity") || MatrixType.equals("Diagonal") || MatrixType.equals("Scalar") || MatrixType.equals("LowerTriangular") ||  MatrixType.equals("UpperTriangular")) {
						ArrayList<Double> diagonalelements = new ArrayList<>();
						String type = "Diagonal Scalar LowerTriangular UpperTriangular  Symetric Square ";
						diagonalelements.add((double)1);
						diagonalelements.add((double) 1);
						Diagonal.addDiagonal('t',diagonalelements,type);
						System.out.println("Matrix created with ID:t");
					}
					if(MatrixType.equals("Ones")){
						String type = "Ones Singular Symetric ";
						Ones.addOnes('u', 2, 2,type);
						System.out.println("Matrix created with ID:u");
					}
				}
				if(row==2 && col==3) {
					if(MatrixType.equals("Null")) {
						String type = "Null  Rectangular ";
						Null.addNull('v',2,3,type);
						System.out.println("Matrix created with ID:v");
					}
					if(MatrixType.equals("Ones")) {
						String type = "Ones  Rectangular ";
						Null.addNull('w',2,3,type);
						System.out.println("Matrix created with ID:w");
					}
				}
				if(row==3 && col==2) {
					if(MatrixType.equals("Null")) {
						String type = "Null  Rectangular ";
						Null.addNull('x',3,2,type);
						System.out.println("Matrix created with ID:x");
					}
					if(MatrixType.equals("Ones")) {
						String type = "Ones  Rectangular ";
						Null.addNull('y',3,2,type);
						System.out.println("Matrix created with ID:y");
					}
				}
				if(row==3 && col==3) {
					if(MatrixType.equals("Null")  || MatrixType.equals("Square")   ||  MatrixType.equals("Singular") ||  MatrixType.equals("Symetric") ||  MatrixType.equals("SkewSymetric") ){
						String type = "Null Singleton Square  Singular Symetric SkewSymetric ";
						Null.addNull('z',3,3,type);
						System.out.println("Matrix created with ID:z");
					}
					if(MatrixType.equals("Identity") || MatrixType.equals("Diagonal") || MatrixType.equals("Scalar") || MatrixType.equals("LowerTriangular") ||  MatrixType.equals("UpperTriangular")) {
						ArrayList<Double> diagonalelements = new ArrayList<>();
						String type = "Diagonal Scalar LowerTriangular UpperTriangular  Symetric Square ";
						diagonalelements.add((double)1);
						diagonalelements.add((double) 1);
						diagonalelements.add((double) 1);
						Diagonal.addDiagonal('1',diagonalelements,type);
						System.out.println("Matrix created with ID:1");
					}
					if(MatrixType.equals("Ones")){
						String type = "Ones Singular Symetric ";
						Ones.addOnes('2', 3, 3,type);
						System.out.println("Matrix created with ID:2");
					}
				}
				
			}
			if(input==3){
				Matrix m = new Matrix();
				square sq = new square();
				Diagonal diagonal = new Diagonal();
				
				System.out.print("Id of  matrix:");
				char id1 = scn.next().charAt(0);
				
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				double[][] arr2 = new double[m.getrows(id1)][m.getcols(id1)];
				arr1 = m.searchbyId(id1);
				arr2 = m.searchbyId(id1);
				String types = m.searchbyIdtypes(id1);
				String[] ty = types.split(" ");
				//System.out.println("types "+types);
				System.out.println("1.Update Single Element");
				System.out.println("2.Update whole Matrix");
				
				int op = scn.nextInt();
				if(op==1) {
					System.out.print("Enter rows number:");
					int r = scn.nextInt();
					System.out.print("Enter column number:");
					int c = scn.nextInt();
					
					System.out.println("Enter element:");
					double newele = scn.nextDouble();
					
					arr2[r][c]=newele;
					String typess = m.gettypes(arr2);
					//System.out.println("typess "+typess);
					if(types.equals(typess)) {
						//replace matrix
						m.changemat(id1, arr2);
						System.out.println("New Matrix "+Arrays.deepToString(arr2));
					}
					else {
						System.out.println("Matrix cannot be changed");
					}
					
				}
				else {
					System.out.print("Enter number of rows:");
					int rows = scn.nextInt();
					System.out.print("Enter number of columns:");
					int cols = scn.nextInt();
					
					double[][] matrix = new double[rows][cols];
					for(int i=0;i<rows;i++) {
						for(int j=0;j<cols;j++) {
							System.out.print("Enter elements in matrix:");
							double element = scn.nextDouble();
							matrix[i][j]=element;
							
						}
					}
					
					String typess = m.gettypes(matrix);
					if(types.equals(typess)) {
						m.changemat(id1, matrix);
						System.out.println("New Matrix "+Arrays.deepToString(matrix));
					}else {
						System.out.println("Matrix cannot be changed");
					}
				}
				
				
			}
			if(input==4) {
				
				Matrix m = new Matrix();
				square sq = new square();
				Diagonal diagonal = new Diagonal();
				
				System.out.print("Id of  matrix:");
				char id1 = scn.next().charAt(0);
				
				String types = m.searchbyIdtypes(id1);
				
				String[] ty = types.split(" ");
				for(String a: ty) {
					System.out.println(a+" matrix");
				}
				
				
			}
			if(input==5){
				Matrix m = new Matrix();
				square sq = new square();
				System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
				int option = scn.nextInt();
				System.out.println("Enter id of matrices:");
				
				System.out.print("Id of first matrix:");
				char id1 = scn.next().charAt(0);
				System.out.print("Id of second matrix:");
				char id2 = scn.next().charAt(0);
				
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				double[][] arr2 = new double[m.getrows(id2)][m.getcols(id2)];
				
				arr1 = m.searchbyId(id1);
				arr2 = m.searchbyId(id2);
				//m.searchbyId(arr1, arr2, id1, id2);
				//System.out.print(m.getrows(id1)+" "++" "+Arrays.toString(m.searchbyId(id1)));
				//System.out.print(Arrays.toString(m.searchbyId(id2)));
				if(option==1) {
					m.addition(arr1, arr2);
				}
				if(option==2) {
					m.subtraction(arr1, arr2);
				}
				if(option==3) {
					System.out.println(Arrays.deepToString(m.multiplication(arr1, arr2)));
				}
				if(option==4) {
					Singular s = new Singular();
					if(s.check(arr2)) {
						System.out.println("Second Matrix is Singular!!");
					}else {
						m.division(arr1, arr2);
					}
					
				}
				
			}
			if(input==6){
				Matrix m = new Matrix();
				System.out.println("Enter id of matrices:");
				
				System.out.print("Id of first matrix:");
				char id1 = scn.next().charAt(0);
				System.out.print("Id of second matrix:");
				char id2 = scn.next().charAt(0);
				
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				double[][] arr2 = new double[m.getrows(id2)][m.getcols(id2)];
				
				arr1 = m.searchbyId(id1);
				arr2 = m.searchbyId(id2);
				
				System.out.println("Enter 1 for multiplication and 2 for division:");
				int option = scn.nextInt();
				if(option==1) {
					m.elementwise1(arr1, arr2);
				}
				if(option==2) {
					m.elementwise2(arr1, arr2);
				}
				//System.out.print(Arrays.deepToString(arr1));
			}
			if(input==7){
				Matrix m = new Matrix();
				System.out.print("Id of  matrix:");
				char id1 = scn.next().charAt(0);
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				arr1 = m.searchbyId(id1);
				System.out.println(Arrays.deepToString(m.transpose(arr1)));
				//System.out.print(Arrays.deepToString(arr1));
			}
			if(input==8){
				//not working
				Matrix m = new Matrix();
				square sq = new square();
				System.out.print("Id of  matrix:");
				char id1 = scn.next().charAt(0);
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				arr1 = m.searchbyId(id1);
				if(sq.determinants(arr1)!=0) {
					System.out.println(Arrays.deepToString(sq.inverse(arr1)));
				}else {
					System.out.println("Inverse doesnot exist!");
				}
				
			}
			if(input==9){
				Matrix m = new Matrix();
				square sq = new square();
				
				System.out.print("Id of  matrix:");
				char id1 = scn.next().charAt(0);
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				arr1 = m.searchbyId(id1);
				
				double[][] rm = m.rowMean(arr1);
				double[][] cm = m.colMean(arr1);
				double mean = m.Mean(arr1);
				
				System.out.println("Row Mean: "+Arrays.deepToString(rm));
				System.out.println("Column Mean: "+Arrays.deepToString(cm));
				System.out.println("Mean: "+mean);
				
				
				
			}
			if(input==10){
				Matrix m = new Matrix();
				square sq = new square();
				Diagonal diagonal = new Diagonal();
				
				System.out.print("Id of  matrix:");
				char id1 = scn.next().charAt(0);
				
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				arr1 = m.searchbyId(id1);
				if(m.getrows(id1)==m.getcols(id1)) {
					double det = 0;
					if(diagonal.check(arr1)) {
						det = diagonal.determinants(arr1);
					}else {
						det = sq.determinants(arr1);
					}
					System.out.println(det);
				}else {
					System.out.println("Not a square Matrix");
				}
				
			}
			if(input==11){
				Matrix m = new Matrix();
				System.out.println("Enter id of matrices:");
				
				System.out.print("Id of Singeleton matrix:");
				char id1 = scn.next().charAt(0);
				System.out.print("Id of second matrix:");
				char id2 = scn.next().charAt(0);
				
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				double[][] arr2 = new double[m.getrows(id2)][m.getcols(id2)];
				
				arr1 = m.searchbyId(id1);
				arr2 = m.searchbyId(id2);
				
				System.out.println("Enter 1 for multiplication and 2 for division:");
				int option = scn.nextInt();
				if(option==1) {
					m.scalarop(arr1, arr2, option);
				}
				if(option==2) {
					m.scalarop(arr1, arr2, option);
				}

				
				
			}
			if(input==12){
				Matrix m = new Matrix();
				square sq = new square();
				Diagonal diagonal = new Diagonal();
				
				System.out.print("Id of  matrix:");
				char id1 = scn.next().charAt(0);
				
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				arr1 = m.searchbyId(id1);
				
				if(m.getrows(id1)==m.getcols(id1)) {
					if(diagonal.check(arr1)) {
						System.out.println(Arrays.deepToString(m.scalarMultiplication(arr1,2)));
					}
					else {
						double[][] arr1Transposed = sq.transpose(arr1);
						m.addition(arr1, arr1Transposed);
					
				}
					}else {
					System.out.println("Matrix is not square");
				}
				
				
			}
			if(input==13){
				Matrix m = new Matrix();
				square sq  = new square();
				double[][] matrix = new double[2][2];
				
				
				System.out.print("Id of  matrix:");
				char id1 = scn.next().charAt(0);
				
				
				matrix = m.searchbyId(id1);
				
				//System.out.println(Arrays.deepToString(matrix));
				double a = matrix[0][0];
				double b = matrix[0][1];
				double c = matrix[1][0];
				double d = matrix[1][1];
				
				
				
				double eigenval1 =( (a+d)+Math.sqrt(  ((a+d)*(a+d)) - 4*((a*d)-(b*c)) ) )/(double)2;
				double eigenval2 =( (a+d)-Math.sqrt(  ((a+d)*(a+d)) - 4*((a*d)-(b*c)) ) )/(double)2;
				
				double[][] vector1 = new double[2][1];
				vector1[0][0]=b;
				vector1[1][0]=eigenval1-a;
				
				double[][] vector2 = new double[2][1];
				vector2[0][0]=b;
				vector2[1][0]=eigenval2-a;
				
				System.out.println("Eigen values and their respective vectors:");
				System.out.println("Eigen values: "+eigenval1+" Eigen vector: "+Arrays.deepToString(vector1));
				System.out.println("Eigen values: "+eigenval2+" Eigen vector: "+Arrays.deepToString(vector2));
				
			}
			if(input==14){
				Matrix m = new Matrix();
				square sq  = new square();
				
				System.out.print("Enter number of rows:");
				int rows = scn.nextInt();
				System.out.print("Enter number of columns:");
				int cols = scn.nextInt();
				
				double[][] matrix = new double[rows][cols];
				double[][] inversematrix = new double[rows][cols];
				
				double[][] res = new double[rows][1];
				double[][] ans = new double[cols][1];
				
				System.out.println("Enter elemtents in A");
				for(int i=0;i<rows;i++) {
					for(int j=0;j<cols;j++) {
						System.out.print("Enter elements in matrix:");
						double element = scn.nextDouble();
						matrix[i][j]=element;
						
					}
				}
				
				System.out.println("A = "+Arrays.deepToString(matrix));
				System.out.println("Enter elemtents in B");
				for(int i=0;i<rows;i++) {
					for(int j=0;j<1;j++) {
						System.out.print("Enter elements in matrix:");
						double element = scn.nextDouble();
						res[i][j]=element;
						
					}
				}
				
			
				System.out.println("b = "+Arrays.deepToString(res));
				
				if(sq.determinants(matrix)!=0) {
					inversematrix = sq.inverse(matrix);
					ans = sq.multiplication(inversematrix, res);
					
					System.out.println("X = "+Arrays.deepToString(ans));
				}
				else {
					
						System.out.println("No Solution");
					
				}
				
			}
			if(input==15){
				System.out.print("Select matrix type:");
				String MatrixType = scn.next();
				
				Matrix m = new Matrix();
				square sq  = new square();
				rectangular rect = new rectangular();
				Null Null = new Null();
				Ones Ones = new Ones();
				Diagonal Diagonal = new Diagonal();
				if(MatrixType.equals("Null")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
					}	 
				}
				if(MatrixType.equals("Ones")) {
					for(int i=0;i<Matrix.onesMatrices.size();i++) {
						 Ones = Matrix.onesMatrices.get(i);
						 //Ones.displayOnes(Ones.getRows(),Ones.getCols());
						 System.out.println(Ones.getId()+":"+Arrays.deepToString(Ones.displayOnes(Ones.getRows(),Ones.getCols())));
					}
				}
				if(MatrixType.equals("Diagonal")){
					
					
					for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
						Diagonal = Matrix.diagonalMatrices.get(i);
//						Diagonal.displayDiagonal(Diagonal.getDiagonalelements());
						System.out.println(Diagonal.getId()+":"+Arrays.deepToString(Diagonal.displayDiagonal(Diagonal.getDiagonalelements())));
						//System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
					}
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()==Null.getCols()) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
					}
				}
				if(MatrixType.equals("Scalar")) {
					for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
						Diagonal = Matrix.diagonalMatrices.get(i);
						int flag=0;
						double num = Diagonal.getDiagonalelements().get(0);
						for(int j=0;j<Diagonal.getDiagonalelements().size();j++) {
							if(num!=Diagonal.getDiagonalelements().get(j)) {
								flag=1;
								break;
							}
						}
						if(flag==0) {
							System.out.println(Diagonal.getId()+":"+Arrays.deepToString(Diagonal.displayDiagonal(Diagonal.getDiagonalelements())));
						}
						
						//System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
					}
					
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()==Null.getCols()) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
					}
				}
				if(MatrixType.equals("Identity")) {
					for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
						Diagonal = Matrix.diagonalMatrices.get(i);
						ArrayList<Integer> arr = new ArrayList<>();
						for(int j=0;j<Diagonal.getDiagonalelements().size();j++) {
							arr.add(1);
						}
						if(arr.equals(Diagonal.getDiagonalelements())) {
							System.out.println(Diagonal.getId()+":"+Arrays.deepToString(Diagonal.displayDiagonal(Diagonal.getDiagonalelements())));
						}		
					}
				}
				if(MatrixType.equals("Row")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()==1) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
						 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
					}
					for(int i=0;i<Matrix.onesMatrices.size();i++) {
						 Ones = Matrix.onesMatrices.get(i);
						 if(Ones.getRows()==1) {
							 System.out.println(Ones.getId()+":"+Arrays.deepToString(Ones.displayOnes(Ones.getRows(),Ones.getCols())));
						 }
						 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
					}

					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 int rows = sq.getMatrices().length;
						 if(rows==1) {
							 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
						 }
						
					}	
					for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
						 rect = Matrix.rectangularMatrices.get(i);
						 int rows = rect.getMatrices().length;
						 if(rows==1) {
							 System.out.println(rect.getId()+":"+Arrays.deepToString(rect.getMatrices()));
						 }
						 
					}
				}
				if(MatrixType.equals("Column")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getCols()==1) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
						 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
					}
					for(int i=0;i<Matrix.onesMatrices.size();i++) {
						 Ones = Matrix.onesMatrices.get(i);
						 if(Ones.getCols()==1) {
							 System.out.println(Ones.getId()+":"+Arrays.deepToString(Ones.displayOnes(Ones.getRows(),Ones.getCols())));
						 }
						 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
					}

					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 int cols = sq.getMatrices()[0].length;
						 if(cols==1) {
							 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
						 }
						
					}	
					for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
						 rect = Matrix.rectangularMatrices.get(i);
						 int cols = rect.getMatrices()[0].length;
						 if(cols==1) {
							 System.out.println(rect.getId()+":"+Arrays.deepToString(rect.getMatrices()));
						 } 
					}
				}
				if(MatrixType.equals("LowerTriangular")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
					}	
					LowerTriangular  LowerTriangular = new LowerTriangular();
					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 
						 if(LowerTriangular.check(sq.getMatrices())) {
							 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
						 }
						
					}
				}
				if(MatrixType.equals("UpperTriangular")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
					}	
					UpperTriangular  UpperTriangular = new UpperTriangular();
					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 if(UpperTriangular.check(sq.getMatrices())) {
							 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
						 }
						
					}
				}
				if(MatrixType.equals("Singular")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()==Null.getCols()) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
						 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
					}
					for(int i=0;i<Matrix.onesMatrices.size();i++) {
						 Ones = Matrix.onesMatrices.get(i);
						 if(Ones.getRows()==Ones.getCols()) {
							 System.out.println(Ones.getId()+":"+Arrays.deepToString(Ones.displayOnes(Ones.getRows(),Ones.getCols())));
						 }
						 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
					}
					for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
						Diagonal = Matrix.diagonalMatrices.get(i);
						if(Diagonal.determinants(Diagonal.getDiagonalelements())==0) {
							System.out.println(Diagonal.getId()+":"+Arrays.deepToString(Diagonal.displayDiagonal(Diagonal.getDiagonalelements())));
						}
					}
					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 if(sq.determinants(sq.getMatrices())==0) {
							 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
						 }
						 
					}	
					
				}
				if(MatrixType.equals("Symetric")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()==Null.getCols()) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
					}
					for(int i=0;i<Matrix.onesMatrices.size();i++) {
						 Ones = Matrix.onesMatrices.get(i);
						 if(Ones.getRows()==Ones.getCols()) {
							 System.out.println(Ones.getId()+":"+Arrays.deepToString(Ones.displayOnes(Ones.getRows(),Ones.getCols())));
						 }
						 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
					}
					for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
						Diagonal = Matrix.diagonalMatrices.get(i);
						if(Diagonal.determinants(Diagonal.getDiagonalelements())==0) {
							System.out.println(Diagonal.getId()+":"+Arrays.deepToString(Diagonal.displayDiagonal(Diagonal.getDiagonalelements())));
						}
					}
					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 if(sq.compare(sq.transpose(sq.getMatrices()),sq.getMatrices())) {
							 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
						 }
						 
					}
					
				}
				if(MatrixType.equals("SkewSymetric")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()==Null.getCols()) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
					}
					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 SkewSymetric SkewSymetric = new SkewSymetric();
						 if(SkewSymetric.check(sq.getMatrices())) {
							 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
						 }
					}
					
				}
				if(MatrixType.equals("Singleton")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()==Null.getCols() && Null.getRows()==1) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
					}
					for(int i=0;i<Matrix.onesMatrices.size();i++) {
						 Ones = Matrix.onesMatrices.get(i);
						 if(Ones.getRows()==Ones.getCols() && Ones.getCols()==1) {
							 System.out.println(Ones.getId()+":"+Arrays.deepToString(Ones.displayOnes(Ones.getRows(),Ones.getCols())));
						 }
						 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
					}
					for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
						Diagonal = Matrix.diagonalMatrices.get(i);
						if(Diagonal.getDiagonalelements().size()==1) {
							System.out.println(Diagonal.getId()+":"+Arrays.deepToString(Diagonal.displayDiagonal(Diagonal.getDiagonalelements())));
						}
						
						//System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
					}
					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 if(sq.getMatrices().length==1) {
							 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
						 }
						 
					}
					
				}
				
				
				if(MatrixType.equals("Square")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()==Null.getCols()) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
						 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
					}
					for(int i=0;i<Matrix.onesMatrices.size();i++) {
						 Ones = Matrix.onesMatrices.get(i);
						 if(Ones.getRows()==Ones.getCols()) {
							 System.out.println(Ones.getId()+":"+Arrays.deepToString(Ones.displayOnes(Ones.getRows(),Ones.getCols())));
						 }
						 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
					}
					for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
						Diagonal = Matrix.diagonalMatrices.get(i);
						System.out.println(Diagonal.getId()+":"+Arrays.deepToString(Diagonal.displayDiagonal(Diagonal.getDiagonalelements())));
						//System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
					}
					for(int i=0;i<Matrix.squareMatrices.size();i++) {
						 sq = Matrix.squareMatrices.get(i);
						 System.out.println(sq.getId()+":"+Arrays.deepToString(sq.getMatrices()));
					}		
				}
				if(MatrixType.equals("Rectangular")) {
					for(int i=0;i<Matrix.nullMatrices.size();i++) {
						 Null = Matrix.nullMatrices.get(i);
						 if(Null.getRows()!=Null.getCols()) {
							 System.out.println(Null.getId()+":"+Arrays.deepToString(Null.displayNull(Null.getRows(),Null.getCols())));
						 }
						 //System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
					}
					for(int i=0;i<Matrix.onesMatrices.size();i++) {
						 Ones = Matrix.onesMatrices.get(i);
						 if(Ones.getRows()!=Ones.getCols()) {
							 System.out.println(Ones.getId()+":"+Arrays.deepToString(Ones.displayOnes(Ones.getRows(),Ones.getCols())));
						 }
						 //System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
					}
					for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
						 rect = Matrix.rectangularMatrices.get(i);
						 System.out.println(rect.getId()+":"+Arrays.deepToString(rect.getMatrices()));
					}	
				
				}
				
				
				
				//retrieving all matrices 
//				square sq  = new square();
//				rectangular rect = new rectangular();
//				Null Null = new Null();
//				Ones Ones = new Ones();
//				Diagonal Diagonal = new Diagonal();
//				
//				
//				for(int i=0;i<Matrix.nullMatrices.size();i++) {
//					 Null = Matrix.nullMatrices.get(i);
//					 System.out.println(Null.getId()+" "+Null.getRows()+" "+Null.getCols()+" "+Null.getType());
//				}
//				for(int i=0;i<Matrix.onesMatrices.size();i++) {
//					 Ones = Matrix.onesMatrices.get(i);
//					 System.out.println(Ones.getId()+" "+Ones.getRows()+" "+Ones.getCols()+" "+Ones.getType());
//				}
//				for(int i=0;i<Matrix.diagonalMatrices.size();i++) {
//					Diagonal = Matrix.diagonalMatrices.get(i);
//					 System.out.println(Diagonal.getId()+" "+Diagonal.getDiagonalelements()+" "+Diagonal.getType());
//				}
//				for(int i=0;i<Matrix.squareMatrices.size();i++) {
//					 sq = Matrix.squareMatrices.get(i);
//					 System.out.println(sq.getId()+" "+Arrays.deepToString(sq.getMatrices())+""+sq.getType());
//				}
//				for(int i=0;i<Matrix.rectangularMatrices.size();i++) {
//					 rect = Matrix.rectangularMatrices.get(i);
//					 System.out.println(rect.getId()+" "+Arrays.deepToString(rect.getMatrices())+""+rect.getType());
//				}
				
//					//students s = coursepage.studentSubmissions.get(i);
//				 s = Matrix.singleton.get(i);
//				 System.out.println(s.getId()+" "+s.getElement()+" "+s.getType());
//			}
				
				
			}
			if(input==16){
				
				System.out.print("Exitting!!");
				break;
			}
			if(input==17) {
				Matrix m = new Matrix();
				System.out.println("Enter id of matrices:");
				
				System.out.print("Id of first matrix:");
				char id1 = scn.next().charAt(0);
				
				double[][] arr1 = new double[m.getrows(id1)][m.getcols(id1)];
				
				arr1 = m.searchbyId(id1);
				System.out.println(Arrays.deepToString(arr1));
				
			}
			
		}
	 }	
}


//matrix type with class and id
//class Matrix{
//	static ArrayList<Singleton> singleton= new ArrayList<>();
//	
//	
//	
//	public void addSingleton(char id,int element,String type) {
//		singleton.add(new Singleton(id,element,type));
//	}
//	
//	
//	
//	public Matrix(){}
//	public Matrix(int[][] mat) {
//		int rows = mat.length;
//		int cols = mat[0].length;
//		
//		if(rows==cols) {
//			square sq  = new square();
//			
//		}else {
//			
//		}
//	}
//	
//	
//	
//	public int[][] transpose(int[][] mat){
//		int rows = mat.length;
//		int cols = mat[0].length;
//		
//		int[][] transposedMatrix = new int[cols][rows];
//		for(int i=0;i<cols;i++) {
//			for(int j=0;j<rows;j++) {
//				transposedMatrix[i][j]=mat[j][i];
//			}
//		}
//		
//		System.out.println(Arrays.deepToString(transposedMatrix));
//		return transposedMatrix;
//	}
//	public void addition(int[][] m1,int[][] m2) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		int[][] addMatrix = new int[rows][cols];
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
//	public void subtraction(int[][] m1,int[][] m2) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		int[][] subMatrix = new int[rows][cols];
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
//	public int[][] multiplication(int[][] m1,int[][] m2){
//		int r1 = m1.length;
//		int r2 = m2.length;
//		int c2 = m2[0].length;
//		int[][] mulMatrix = new int[r1][c2];
//		
//		// if m1 ya m2 type is zero then mission abort!!!
//		for(int i=0;i<r1;i++) {
//			for(int j=0;j<c2;j++) {
//				for(int k=0;k<r2;k++) {
//					mulMatrix[i][j]+=m1[i][k]*m2[i][k];
//				}
//			}
//		}
//		System.out.println(Arrays.deepToString(mulMatrix));
//		return mulMatrix;
//	}
//	public boolean compare(int[][] m1,int[][] m2) {
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
//	public double[][] rowMean(int[][] m1){
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		double[][] rowMean = new double[rows][1];
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				rowMean[i][0]+=m1[i][0];
//				
//			}	
//			rowMean[i][0]=rowMean[i][0]/(double)cols ; 
//		}
//		return rowMean;
//	}
//	public double[][] colMean(int[][] m1){
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		double[][] colMean = new double[1][cols];
//		for(int i=0;i<cols;i++) {
//			for(int j=0;j<rows;j++) {
//				 colMean[i][0]+=m1[i][0];
//				
//			}	
//			 colMean[i][0]= colMean[i][0]/(double)cols ; 
//		}
//		return  colMean;
//	}
//	public double Mean (int[][] m1) {
//		double mean =0;
//		int rows = m1.length;
//		int cols = m1[0].length;
//		for(int i=0;i<cols;i++) {
//			for(int j=0;j<rows;j++) {
//				 mean+=m1[i][0];
//				
//			}	
//		}
//		mean = mean/(rows+cols);
//		return mean;
//		
//	}
//	public double[][] scalarMultiplication(int[][] m1,int scalar){
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
//}
//	
//	

		
		

//class rectangular extends Matrix{
//	
//}
//class square extends Matrix{
//	//ArrayList<square> sqmatrix = new ArrayList<>();
//	public square() {}
//	public square(int[][] mat) {
//		int rows = mat.length;
//		int cols = mat[0].length;
//		
//		
//		}
//
//	public int determinants(int[][] mat) {
//		int res;
//		int rows = mat.length;
//		int cols = mat[0].length;
//		if(rows==cols && rows==2){
//			res=(mat[0][0]*mat[1][1])-(mat[0][1]*mat[1][0]);
//		}
//		else if(rows==cols && rows==3) {
//		int a = mat[0][0]*((mat[2][2]*mat[1][1])-(mat[2][1]*mat[1][2]));
//		int b = mat[0][1]*((mat[1][0]*mat[2][2])-(mat[1][2]*mat[2][0]));
//		int c = mat[0][2]*((mat[1][0]*mat[2][1])-(mat[1][1]*mat[2][0]) );
//		res = a-b+c;	
//		}
//		else {
//			res=mat[0][0];
//		}
//		System.out.println("determinant of matrix: "+res);
//		return res;
//	}
////	public int[][] division(int[][] m1,int[][] m2) {
////	double[][] inv_m2 = inverse(m2);
////	int[][] divMatrix = super.multiplication(m1, inv_m2);
////	return divMatrix;
////	}
//	public double[][] inverse(int[][] mat){
//		int rows = mat.length;
//		int cols = mat[0].length;
//		double[][] invertedMatrix = new double[mat.length][mat.length];
//		int determinant = determinants(mat);
//		if(rows ==1) {
//			invertedMatrix[0][0]=1/(double)mat[0][0];
//	
//		}
//		else if(rows==2) {
//			invertedMatrix[0][0]=mat[1][1]/determinant;
//			invertedMatrix[1][1]=mat[0][0]/determinant;
//			invertedMatrix[0][1]=-mat[0][1]/determinant;
//			invertedMatrix[1][0]=-mat[1][0]/determinant;
//		}
//		else if(rows==3) {
//			for(int i = 0;i<3;i++) {
//				for(int j=0;j<3;j++) {
//					invertedMatrix[i][j]=(mat[(j+1)%3][(i+1)%3] * mat[(j+2)%3][(i+2)%3]) - (mat[(j+1)%3][(i+2)%3] * mat[(j+2)%3][(i+1)%3])/ determinant;
//					}
//				}
//		}
//			
//		return invertedMatrix;
//	}
//	
//	
//}

//class Diagonal{
//	
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		if(rows==cols) {
//			int flag=1;
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<cols;j++) {
//					if(m1[i][j]!=0 && i!=j) {
//						flag=0;
//						break;
//					}
//				}
//			}
//			if(flag==1) {
//				return true;
//			}else {
//				return false;
//			}
//			
//		}
//		return false;
//	}
//	public  int determinants(int[][] mat) {
//		int rows = mat.length;
//		int det = 1;
//		for(int i=0;i<rows;i++) {
//			det*=mat[i][i];
//		}
//		return det;
//	}
//	
//}
//class Scalar extends Diagonal{
//	
//	
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		if(rows==cols) {
//			int flag=1;
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<cols;j++) {
//					if(m1[i][j]!=0 && i!=j) {
//						flag=0;
//						break;
//					}
//				}
//			}
//			int ele = m1[0][0];
//			for(int i=0;i<rows;i++) {
//				if(m1[i][i]!=ele) {
//					flag=0;
//					break;
//				}
//			}
//			if(flag==1) {
//				return true;
//			}else {
//				return false;
//			}
//			
//		}
//		return false;
//	}
//	
//}
//class Identity extends Scalar{
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		if(rows==cols) {
//			int flag=1;
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<cols;j++) {
//					if(m1[i][j]!=0 && i!=j) {
//						flag=0;
//						break;
//					}
//				}
//			}
//			int ele = 1;
//			for(int i=0;i<rows;i++) {
//				if(m1[i][i]!=ele) {
//					flag=0;
//					break;
//				}
//			}
//			if(flag==1) {
//				return true;
//			}else {
//				return false;
//			}
//			
//		}
//		return false;
//	}
//}
//class Ones extends Matrix{
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		int flag = 0;
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				if(m1[i][j]!=1) {
//					flag=1;
//					break;
//				}
//				
//			}
//		}
//		if(flag==0) {
//			return true;
//		}
//		return false;
//	}
//}

//class Null extends Matrix{
	
	
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		
//		int flag = 0;
//		
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				if(m1[i][j]!=0) {
//					flag=1;
//					break;
//				}
//				
//			}
//		}
//		if(flag==0) {
//			return true;
//		}
//		return false;
//	}
//}
//class UpperTriangular{
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		int flag = 0;
//		if(rows==cols) {
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<cols;j++) {
//					if(m1[i][j]!=0 && j<i) {
//						flag=1;
//						break;
//					}
//					
//				}
//			}
//			if(flag==0) {
//				return true;
//			}
//			return false;
//		}
//		return false;
//	}
//}
//class LowerTriangular{
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		int flag = 0;
//		if(rows==cols) {
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<cols;j++) {
//					if(m1[i][j]!=0 && j>i) {
//						flag=1;
//						break;
//					}
//					
//				}
//			}
//			if(flag==0) {
//				return true;
//			}
//			return false;
//		}
//		return false;
//	}
//}	

//class Symetric extends square{
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		int flag = 0;
//		if(rows==cols) {
//			if(super.compare(m1,super.transpose(m1))) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		return false;
//	}
//}
//class SkewSymetric extends square{
//	public boolean check(int[][] m1) {
//		int rows = m1.length;
//		int cols = m1[0].length;
//		int[][] transposedm1 = super.transpose(m1);
//		double[][] mularr = super.scalarMultiplication(transposedm1, -1);
//		int flag=0;
//		for(int i=0;i<rows;i++) {
//			if(Arrays.equals(m1[i],transposedm1[i])==false) {
//				flag=1;
//				break;
//			}
//		}
//		if(flag==0) {
//			return true;
//		}
//		return false;
//	}
//	
//	
//}
//
//class Singular extends square{
//	public boolean check(int[][] m1) {
//		if(super.determinants(m1)==0) {
//			return true;
//		}
//		return false;
//	}
//}
//class Singleton extends square{
//	private char id;
//	private int element;
//	private String type;
//	
//	public Singleton(){}
//	
//	public  Singleton(char id,int element,String type) {
//		this.setId(id);
//		this.setElement(element);
//		this.setType(type);
//		
//		//m.addSingleton(id, element, type);
//		//singleton.add(new Singleton(id,element,this.getType()));
//	}
//
//	public boolean check(int[][] m1){
//		int rows = m1.length;
//		int cols = m1[0].length;
//		if(rows==1 && cols==1) {
//			return true;
//		}
//		return false;
//	}
//	public char getId() {
//		return id;
//	}
//
//	public void setId(char id) {
//		this.id = id;
//	}
//
//	public int getElement() {
//		return element;
//	}
//
//	public void setElement(int element) {
//		this.element = element;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//}