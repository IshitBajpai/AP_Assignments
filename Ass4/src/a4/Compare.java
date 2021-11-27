package a4;

public class Compare<T,V>{
	private T t;
	private V v;
	public Compare(T t,V v){
		this.setT(t);
		this.setV(v);
	}
	
	public static <T,V> int compare(T t,V v) {
		if(t instanceof String && v instanceof String) {
			return ((String)t).compareTo((String)v);
					
		}
		else if(t instanceof Integer && v instanceof Integer) {
			if((int)t>(int)v) {return 1;}
			if((int)t==(int)v) {return 0;}
			if((int)t<(int)v) {return -1;}
		}
		return 300;
	}
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
}