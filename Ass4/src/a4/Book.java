package a4;

import java.util.ArrayList;

public class Book implements Comparable<Book>{
	
	static ArrayList<Book> books= new ArrayList<>();
	
	private String Title;
	private int ISBN;
	private int Barcode;
	public Book(){}
	public Book(String Title,int ISBN,int Barcode) {
		this.setTitle(Title);
		this.setISBN(ISBN);
		this.setBarcode(Barcode);
	}

	public String getTitle() {return Title;}
	public void setTitle(String title) {Title = title;}
	public int getISBN() {return ISBN;}
	public void setISBN(int iSBN) {ISBN = iSBN;}
	public int getBarcode() {return Barcode;}
	public void setBarcode(int barcode) {Barcode = barcode;}
	public int compareTo(Book o) {
		if(this.getTitle().equals(o.getTitle())) {
			if(Compare.compare(this.getISBN(), o.getISBN())==0) {
				return Compare.compare(this.getBarcode(),o.getBarcode());
			}else {
				return Compare.compare(this.getISBN(), o.getISBN());
			}
		}
		else {
			return Compare.compare(this.getTitle(),o.getTitle());
		}
	}
	
	public void dislayBooks() {
		for(int i=0;i<books.size();i++) {
			System.out.println(Book.books.get(i).getTitle()+" "+Book.books.get(i).getISBN()+" "+Book.books.get(i).getBarcode());
		}
	}
	public void showInRacks(int slots,int racks)
	{
		int racknumber=0;
		int slotpos = 0;
		for(int i=0;i<books.size();i++) {
			if(i%slots==0) {
				slotpos=0;
				racknumber++;
				if(racknumber<=racks) {
					System.out.println("Rack Number:"+racknumber);
				}
				
			}
			if(racknumber<=racks) {
				slotpos++;
				System.out.println("Slot Number:"+slotpos+" Title:"+Book.books.get(i).getTitle()+" ISBN:"+Book.books.get(i).getISBN()+" Barcode:"+Book.books.get(i).getBarcode());
			}else {
				System.out.println("Not enough space!!");
			}
			
		}
	}
	public void SearchBook(String Title,int ISBN,int Barcode,int slots,int racks) {
		int racknumber=0;
		int slotpos = 0;
		int flag=0;
		for(int i=0;i<books.size();i++) {
			if(i%slots==0) {
				slotpos=0;
				racknumber++;		
			}
			slotpos++;
			if(Book.books.get(i).getTitle().equals(Title) && Book.books.get(i).getISBN()==ISBN && Barcode==Book.books.get(i).getBarcode()) {
				flag=1;	
				break;
				}
			
		}
		if(flag==1) {System.out.println("Rack Number:"+racknumber +" Slot Number:"+slotpos);}
		else {System.out.println("Book not found");}
		
	}
		
}