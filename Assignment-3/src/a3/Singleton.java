package a3;

public class Singleton extends square{
	private char id;
	private double element;
	private String type;
	
	public Singleton(){}
	
	public  Singleton(char id,double element,String type) {
		this.setId(id);
		this.setElement(element);
		this.setType(type);
		
		//m.addSingleton(id, element, type);
		//singleton.add(new Singleton(id,element,this.getType()));
	}

	public boolean check(double[][] m1){
		int rows = m1.length;
		int cols = m1[0].length;
		if(rows==1 && cols==1) {
			return true;
		}
		return false;
	}
	public char getId() {
		return id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public double getElement() {
		return element;
	}

	public void setElement(double element) {
		this.element = element;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}