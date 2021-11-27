package a4;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.print("Enter number of books:");
		 int n = scn.nextInt();
		 System.out.print("Enter number of racks:");
		 int k = scn.nextInt();
		 int slots = n/k;
		 
		 Book B = new Book();
		 for(int i=0;i<n;i++) {
			 scn.nextLine();
			 System.out.print("Enter Title:");
			 String title = scn.nextLine();
			 System.out.print("Enter ISBN:");
			 int isbn = scn.nextInt();
			 System.out.print("Enter Barcode:");
			 int barcode = scn.nextInt();
			 Book b = new Book(title,isbn,barcode);
			 Book.books.add(b);
			 
		}
		//B.dislayBooks();
		Collections.sort(Book.books);
		B.showInRacks(slots,k);
		while(true) {
			 System.out.println("Select options:");
			 System.out.println("1.Search for Book:");
			 System.out.println("2.Exit:");
			 
			 int ip = scn.nextInt();
			
			 if(ip==1) {
				 scn.nextLine();
				 System.out.print("Enter Title :");
				 String title = scn.nextLine();
				 System.out.print("Enter ISBN :");
				 int isbn = scn.nextInt();
				 System.out.print("Enter Barcode:");
				 int barcode = scn.nextInt();
				 B.SearchBook(title, isbn, barcode, slots, k);
				 
			 }
			 else {
				 break;
			 }
			 
			 
			
		}
	}

}
//class Book implements Comparable<Book>{
//	
//	static ArrayList<Book> books= new ArrayList<>();
//	
//	private String Title;
//	private int ISBN;
//	private int Barcode;
//	public Book(){}
//	public Book(String Title,int ISBN,int Barcode) {
//		this.setTitle(Title);
//		this.setISBN(ISBN);
//		this.setBarcode(Barcode);
//	}
//
//	public String getTitle() {return Title;}
//	public void setTitle(String title) {Title = title;}
//	public int getISBN() {return ISBN;}
//	public void setISBN(int iSBN) {ISBN = iSBN;}
//	public int getBarcode() {return Barcode;}
//	public void setBarcode(int barcode) {Barcode = barcode;}
//	public int compareTo(Book o) {
//		if(this.getTitle().equals(o.getTitle())) {
//			if(Compare.compare(this.getISBN(), o.getISBN())==0) {
//				return Compare.compare(this.getBarcode(),o.getBarcode());
//			}else {
//				return Compare.compare(this.getISBN(), o.getISBN());
//			}
//		}
//		else {
//			return Compare.compare(this.getTitle(),o.getTitle());
//		}
//	}
//	
//	public void dislayBooks() {
//		for(int i=0;i<books.size();i++) {
//			System.out.println(Book.books.get(i).getTitle()+" "+Book.books.get(i).getISBN()+" "+Book.books.get(i).getBarcode());
//		}
//	}
//	public void showInRacks(int slots,int racks)
//	{
//		int racknumber=0;
//		int slotpos = 0;
//		for(int i=0;i<books.size();i++) {
//			if(i%slots==0) {
//				slotpos=0;
//				racknumber++;
//				if(racknumber<=racks) {
//					System.out.println("Rack Number:"+racknumber);
//				}
//				
//			}
//			if(racknumber<=racks) {
//				slotpos++;
//				System.out.println("Slot Number:"+slotpos+" Title:"+Book.books.get(i).getTitle()+" ISBN:"+Book.books.get(i).getISBN()+" Barcode:"+Book.books.get(i).getBarcode());
//			}else {
//				System.out.println("Not enough space!!");
//			}
//			
//		}
//	}
//	public void SearchBook(String Title,int ISBN,int Barcode,int slots,int racks) {
//		int racknumber=0;
//		int slotpos = 0;
//		int flag=0;
//		for(int i=0;i<books.size();i++) {
//			if(i%slots==0) {
//				slotpos=0;
//				racknumber++;		
//			}
//			slotpos++;
//			if(Book.books.get(i).getTitle().equals(Title) && Book.books.get(i).getISBN()==ISBN && Barcode==Book.books.get(i).getBarcode()) {
//				flag=1;	
//				break;
//				}
//			
//		}
//		if(flag==1) {System.out.println("Rack Number:"+racknumber +" Slot Number:"+slotpos);}
//		else {System.out.println("Book not found");}
//		
//	}
//		
//}
//class Compare<T,V>{
//	private T t;
//	private V v;
//	public Compare(T t,V v){
//		this.setT(t);
//		this.setV(v);
//	}
//	
//	public static <T,V> int compare(T t,V v) {
//		if(t instanceof String && v instanceof String) {
//			return ((String)t).compareTo((String)v);
//					
//		}
//		else if(t instanceof Integer && v instanceof Integer) {
//			if((int)t>(int)v) {return 1;}
//			if((int)t==(int)v) {return 0;}
//			if((int)t<(int)v) {return -1;}
//		}
//		return 300;
//	}
//	public T getT() {
//		return t;
//	}
//
//	public void setT(T t) {
//		this.t = t;
//	}
//	public V getV() {
//		return v;
//	}
//	public void setV(V v) {
//		this.v = v;
//	}
//	
//}


//class Book implements Comparable<Book>{
//	
//	static ArrayList<Book> books= new ArrayList<>();
//	
//	private String Title;
//	private int ISBN;
//	private int Barcode;
//	public Book(){}
//	public Book(String Title,int ISBN,int Barcode) {
//		this.setTitle(Title);
//		this.setISBN(ISBN);
//		this.setBarcode(Barcode);
//	}
//
//	public String getTitle() {return Title;}
//	public void setTitle(String title) {Title = title;}
//	public int getISBN() {return ISBN;}
//	public void setISBN(int iSBN) {ISBN = iSBN;}
//	public int getBarcode() {return Barcode;}
//	public void setBarcode(int barcode) {Barcode = barcode;}
//	public int compareTo(Book o) {
//		if(this.getTitle().equals(o.getTitle())) {
//			if(this.getISBN()==o.getISBN()) {
//				if(this.getBarcode()>o.getBarcode()) {
//					return 1;
//				}
//				return -1;
//			}else {
//				if(this.getISBN()>o.getISBN()) {
//					return 1;
//				}
//				return -1;
//			}
//		}
//		else {
//			return this.getTitle().compareTo(o.getTitle());
//		}
//	}
