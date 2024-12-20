package oops;

public class UseStapler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stapler s1=new Stapler();
		s1.setBrand("Natraj");
		s1.setColor("Pink");
		s1.setPrice(500);
		s1.setMaterila("plastic");
		Stapler s2=new Stapler();
		s2.setBrand("Cello");
		s2.setColor("white");
		s2.setPrice(250);
		s2.setMaterila("steel");
		Stapler s3=new Stapler();
		s3.setBrand("Camilin");
		s3.setColor("Yellow");
		s3.setPrice(5000);
		s3.setMaterila("steel+plastic");
		
		Stapler [] staplers= {s1,s2,s3};
		
		s1.display(staplers);
//		System.out.println(s1.getPlastic(staplers));
		System.out.println(s1.reverse(staplers));

	}

}
