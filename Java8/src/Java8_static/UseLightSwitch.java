package Java8_static;

//public class UseLightSwitch {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//public class UseLightSwitch {
//	public static void main(String[]args){
//      LightSwitch s=(x)->{
//      	if(x==true){
//        	return "LIGHT IS ON";
//        }else{
//        	return "LIGHT IS OFF";
//        }
//      };
//      System.out.println(s.findLightIsOn(Boolean.parseBoolean(args[0])));
//    }
//}
interface LightSwitch {
	public default String findLightIsOn(boolean isSwitchOn){
    	if(isSwitchOn==true){
        	return "LIGHT IS ON";
        }else{
        	return "LIGHT IS OFF";
        }
    }
}	