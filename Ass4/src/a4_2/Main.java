package a4_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int id=0;
		while(true) {
			
			System.out.println("1.Input Image:");
			System.out.println("2.Create Image:");
			System.out.println("3.Update Image:");
			System.out.println("4.Display Image:");
			System.out.println("5.Compute Negatives:");
			System.out.println("6.Exit:");
			
			
			int input = scn.nextInt();
			
			if(input==1) {
				System.out.println("1.Color Image");
				System.out.println("2.Gray Image");
				id++;
				int option = scn.nextInt();
				if(option==1) 
				{
					System.out.print("Enter number of rows:");
					int rows = scn.nextInt();
					System.out.print("Enter number of columns:");
					int cols = scn.nextInt();
					ArrayList<int [][]> str = new ArrayList<>();
					String[] colours = {"Red Matrix:","Green Matrix","Blue Matrix"};
					for(int k=0;k<3;k++) {
						System.out.println(colours[k]);
						int[][] Img = new int[rows][cols];
						for(int i=0;i<rows;i++) {
							for(int j=0;j<cols;j++) {
								System.out.print("Enter pixelValue:");
								int pixelValue = scn.nextInt();
								Img[i][j]=pixelValue;
								
							}
						}
						str.add(Img);
					}
					Color ColorImg = new Color(str.get(0),str.get(1),str.get(2),id);
					Color.colImg.add(ColorImg);
				}
				if(option==2) 
				{
					System.out.print("Enter number of rows:");
					int rows = scn.nextInt();
					System.out.print("Enter number of columns:");
					int cols = scn.nextInt();
					
					int[][] Img = new int[rows][cols];
					for(int i=0;i<rows;i++) {
						for(int j=0;j<cols;j++) {
							System.out.print("Enter pixelValue:");
							int pixelValue = scn.nextInt();
							Img[i][j]=pixelValue;
							
						}
					}
					Gray GrayImg = new Gray(Img,id);
					Gray.greyImg.add(GrayImg);
					
					
				}
				
				System.out.println("Image added with ID:"+id);
				
				
			}
			if(input==2) {
				System.out.println("1.Color Image");
				System.out.println("2.Gray Image");
				
				id++;
				int option = scn.nextInt();
				if(option==1) {
					System.out.print("Enter number of rows:");
					int rows = scn.nextInt();
					System.out.print("Enter number of columns:");
					int cols = scn.nextInt();
					ArrayList<int [][]> str = new ArrayList<>();
					for(int k=0;k<3;k++) {
						int[][] Img = new int[rows][cols];
						for(int i=0;i<rows;i++) {
							for(int j=0;j<cols;j++) {
								int pixelValue = (int) ((Math.random() * (255)));
								Img[i][j]=pixelValue;
								
							}
						}
						str.add(Img);
					}
					Color ColorImg = new Color(str.get(0),str.get(1),str.get(2),id);
					Color.colImg.add(ColorImg);
					
					System.out.println("Color Image created with id:"+id);
					
				}else {
					System.out.print("Enter number of rows:");
					int rows = scn.nextInt();
					System.out.print("Enter number of columns:");
					int cols = scn.nextInt();
					
					int[][] Img = new int[rows][cols];
					for(int i=0;i<rows;i++) {
						for(int j=0;j<cols;j++) {
							int pixelValue = (int) ((Math.random() * (255)));
							Img[i][j]=pixelValue;
							
						}
					}
					Gray GrayImg = new Gray(Img,id);
					Gray.greyImg.add(GrayImg);
					System.out.println("Gray Image created with id:"+id);
				}
				
				
			}
			if(input==3) {
				System.out.print("Enter ID of Image:");
				int Imgid = scn.nextInt();
				int flag=1;
				int idx=0;
				for(int i=0;i<Color.colImg.size();i++) {
					if(Color.colImg.get(i).getId()==Imgid) {
						flag=0;
						idx=i;
					}
				}
				for(int i=0;i<Gray.greyImg.size();i++) {
					if(Gray.greyImg.get(i).getId()==Imgid) {
						flag=2;
						idx=i;
					}
				}
				if(flag==0) {
					System.out.println("Enter ImgMatrix to be updated");
					System.out.println("1.Red");
					System.out.println("2.Green");
					System.out.println("3.Blue");
					System.out.println("Enter option:");
					int option = scn.nextInt();
					if(option==1) {
						System.out.print("Enter row:");
						int rows = scn.nextInt();
						System.out.print("Enter column:");
						int cols = scn.nextInt();
						System.out.print("Enter new element:");
						int ele = scn.nextInt();
						Color.colImg.get(idx).getRed()[rows][cols]=ele;
						
					}
					if(option==2) {
						System.out.print("Enter row:");
						int rows = scn.nextInt();
						System.out.print("Enter column:");
						int cols = scn.nextInt();
						System.out.print("Enter new element:");
						int ele = scn.nextInt();
						Color.colImg.get(idx).getGreen()[rows][cols]=ele;
						
					}
					if(option==3){
						System.out.print("Enter row:");
						int rows = scn.nextInt();
						System.out.print("Enter column:");
						int cols = scn.nextInt();
						System.out.print("Enter new element:");
						int ele = scn.nextInt();
						Color.colImg.get(idx).getBlue()[rows][cols]=ele;
					}
				}
				else if(flag==2) {
					System.out.print("Enter row:");
					int rows = scn.nextInt();
					System.out.print("Enter column:");
					int cols = scn.nextInt();
					System.out.print("Enter new element:");
					int ele = scn.nextInt();
					Gray.greyImg.get(idx).getGreyMat()[rows][cols]=ele;
				}else {
					System.out.println("Id not found!!");
				}
				
			}
			if(input==4) {
				System.out.print("Enter ID of Image to be displayed:");
				int Imgid = scn.nextInt();
				int flag=1;
				for(int i=0;i<Color.colImg.size();i++) {
					if(Color.colImg.get(i).getId()==Imgid) {
						
						System.out.println("Red:"+Arrays.deepToString(Color.colImg.get(i).getRed())+" Green:"+Arrays.deepToString(Color.colImg.get(i).getGreen())+" Blue:"+Arrays.deepToString(Color.colImg.get(i).getBlue()));
					}
				}
				for(int i=0;i<Gray.greyImg.size();i++) {
					if(Gray.greyImg.get(i).getId()==Imgid) {
					
						System.out.println("Gray Img:"+Arrays.deepToString(Gray.greyImg.get(i).getGreyMat()));
					}
				}
				
			}
			if(input==5) {
				System.out.print("Enter ID of Image:");
				int Imgid = scn.nextInt();
				for(int i=0;i<Color.colImg.size();i++) {
					if(Color.colImg.get(i).getId()==Imgid) {
						System.out.println("Color Image "+"Red:"+Arrays.deepToString(Color.colImg.get(i).getRed())+" Green:"+Arrays.deepToString(Color.colImg.get(i).getGreen())+" Blue:"+Arrays.deepToString(Color.colImg.get(i).getBlue()));
						Negatives.computeNegative(Color.colImg.get(i));
					}
				}
				for(int i=0;i<Gray.greyImg.size();i++) {
					if(Gray.greyImg.get(i).getId()==Imgid) {
					
						System.out.println("Gray Img:"+Arrays.deepToString(Gray.greyImg.get(i).getGreyMat()));
						Negatives.computeNegative(Gray.greyImg.get(i));
					}
				}
				
				
			}
			if(input==6) {
				break;
			}
			
			
		}
		
	
		
	}
}
//class Color
//{
//	static ArrayList<Color> colImg= new ArrayList<>();
//	
//	private int[][] Red;
//	private int[][] Green;
//	private int[][] Blue;
//	private int id;
//	public Color() {}
//	public Color(int[][] Red,int[][] Green,int[][] Blue,int id) 
//	{
//		
//		this.setRed(Red);
//		this.setGreen(Green);
//		this.setBlue(Blue);
//		this.setId(id);
//		
//	}
//	
//	public int[][] getRed() {
//		return Red;
//	}
//	public void setRed(int[][] red) {
//		Red = red;
//	}
//	public int[][] getGreen() {
//		return Green;
//	}
//	public void setGreen(int[][] green) {
//		Green = green;
//	}
//	public int[][] getBlue() {
//		return Blue;
//	}
//	public void setBlue(int[][] blue) {
//		Blue = blue;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	 
//	
//}
//class Gray
//{
//	static ArrayList<Gray> greyImg= new ArrayList<>();
//	private int[][] greyMat;
//	private int id;
//	public Gray() {}
//	public Gray(int[][] greyMat,int id) {
//		this.setGreyMat(greyMat);
//		this.setId(id);
//	}
//	public int[][] getGreyMat() {
//		return greyMat;
//	}
//	public void setGreyMat(int[][] greyMat) {
//		this.greyMat = greyMat;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//}
//class Negatives
//{
//	
//	public static <E> void computeNegative(E e) {
//		if (e instanceof Gray) {
//			Gray g = (Gray)e;
//			int rows = g.getGreyMat().length;
//			int cols = g.getGreyMat()[0].length;
//			int[][] negMat = new int[rows][cols];
//
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<cols;j++) {
//					negMat[i][j] = 255 - (int)g.getGreyMat()[i][j]; 	
//				}
//			}
//			System.out.println("Negative :"+Arrays.deepToString(negMat));
//		}
//		else if(e instanceof Color) {
//			Color c = (Color)e;
//			int rows = c.getBlue().length;
//			int cols =c.getBlue()[0].length;
//			int[][] Img1 = new int[rows][cols];
//			int[][] Img2 = new int[rows][cols];
//			int[][] Img3 = new int[rows][cols];	
//			for(int i=0;i<rows;i++) {
//					for(int j=0;j<cols;j++) {
//						Img1[i][j]=255-c.getRed()[i][j];
//						Img2[i][j]=255-c.getGreen()[i][j];
//						Img3[i][j]=255-c.getBlue()[i][j];
//						
//					}
//			}
//			System.out.println("Negative :");
//			System.out.println("Red:"+Arrays.deepToString(Img1)+" Green:"+Arrays.deepToString(Img2)+" Blue:"+Arrays.deepToString(Img3));
//			
//			
//			
//		}
//	}
//}
//int flag=0;
//public Negatives(T[][] m1) {
//	flag=1;
//	this.setM1(m1);
//}  
//		public Negatives(T[][] m1,T[][] m2,T[][] m3) {
//		flag=2;
//		this.setM1(m1);
//		this.setM2(m2);
//		this.setM3(m3);
//	}
//		if(m1[0][0] instanceof Integer){int[][] negMat = new int[rows][cols];}
//		else{double[][] negMat = new double[rows][cols];}
//		
		
		
		
		
	

//	public T[][] getM2() {
//		return m2;
//	}
//
//	public void setM2(T[][] m2) {
//		this.m2 = m2;
//	}
//
//	public T[][] getM3() {
//		return m3;
//	}
//
//	public void setM3(T[][] m3) {
//		this.m3 = m3;
//	}

//	public T[][] getM1() {
//		return m1;
//	}
//
//	public void setM1(T[][] m1) {
//		this.m1 = m1;
//	}
//	
	
	
