package oops;

public class UseLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		name location
//		book title price isReusable
		Book b1=new Book();
		b1.title="Harry Potter";
		b1.price=12000;
		b1.isReusable=true;
		Book b2=new Book();
		b2.title="Witcher";
		b2.price=2000;
		b2.isReusable=false;
		Library l1=new Library();
		l1.Location="A24";
		l1.name="James";
		l1.b=b1;
		Book[] books= {b1,b2};
		for(int i=0;i<books.length;i++) {
			System.out.println("Price:"+books[i].price+"\n"+"Title:"+books[i].title+"\n"+"IsReusable:"+books[i].isReusable+"MAXPRICE IS:"+b1.max(books));
		}
//		System.out.println("Price:"+l1.b.price+"\n"+"Title:"+l1.b.title+"\n"+"IsReusable:"+l1.b.isReusable);

	}

}
class Library{
	String name;
	String Location;
	Book b;
	
}
class Book{
	String title;
	int price;
	Boolean isReusable;
	public int max(Book[] books) {
		int max=books[0].price;
		for(int i=0;i<books.length;i++) {
			if(books[i].price>max) {
				max=books[i].price;
			}
		}
		return max;
	}
}