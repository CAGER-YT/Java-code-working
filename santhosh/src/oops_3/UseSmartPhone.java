package oops_3;

public class UseSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s1=new Samsung();
		System.out.println(s1.camera("tap tap"));
		System.out.println(s1.voicecall(false));
		System.out.println(s1.videocall(true));


	}

}
//class samsung implements smartphone interface
//interface 
//voicecall
//videocall
//camera String
//switch taking picture
//
//zoom double tap
//continous tap continous shot

interface Smartphone{
	public boolean voicecall(boolean vo);
	public boolean videocall(boolean vc);
	public String camera(String c);

}
class Samsung implements Smartphone{
	
	public boolean voicecall(boolean vo) {
		return vo;
	}
	public boolean videocall(boolean vc) {
		return vc;
	}
	public String camera(String c) {
		switch(c) {
		case "tap":
			return "Taking Picture";
		case "tap tap":
			return "Zooming";
		case "Continous tap":
			return "continous shot";
		default:
			return "invalid input";
		}
	}
}