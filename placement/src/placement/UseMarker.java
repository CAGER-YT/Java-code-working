package placement;

interface MarkerTest{}

class MarkerUse implements MarkerTest{}
class MarkerUse1 {}
public class UseMarker {

	public static void main(String[] args) {
		MarkerUse m=new MarkerUse();
		MarkerUse1 m1=new MarkerUse1();
		
		if(m1 instanceof MarkerTest) {
			System.out.println("It is a Marker");
		}
	}
}
