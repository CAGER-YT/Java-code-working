package oops;

public class UseLibrary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book2 b1=new Book2();
		b1.setTitle("Harry Potter");
		b1.setPrice(12000);
		b1.setIsReusable(true);
		Library2 l1=new Library2();
		l1.setLocation("A24");
		l1.setName("James");
		l1.setB(b1);
		System.out.println(l1.getB().getTitle());

//		System.out.println("Price:"+l1.b.price+"\n"+"Title:"+l1.b.title+"\n"+"IsReusable:"+l1.b.isReusable);

	}

}
class Library2{
	private String name;
	private String Location;
	private Book2 b;
	public void setB(Book2 b1){
		b=b1;
	}
	public Book2 getB() {
		return b;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setLocation(String Location) {
		this.Location=Location;
	}
	public String getLocation() {
		return Location;
	}
}
class Book2{
	private String title;
	private int price;
	private Boolean isReusable;
	public void setTitle(String t) {
		title=t;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	public void setIsReusable(boolean p) {
		isReusable=p;
	}
	public boolean getIsReusable() {
		return isReusable;
	}
}