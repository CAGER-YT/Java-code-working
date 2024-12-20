package placement;

public class UseGeneric {

public static void main(String[] args) {
	Generic<String> g=new Generic();
	
	g.setItem("San");
	
	String item=g.getItem();
			
	System.out.println(item);
}
	
	
}
class Generic<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}