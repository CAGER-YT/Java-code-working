package placement;

class Emp{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}
public class UseEmp {

	public static void main(String[] args) {
		final Emp e = new Emp(1,"raj");
		e.setName("kumar");
		System.out.println(e);
//		e=new Emp(1,"raj kumar");
		
	}
}
