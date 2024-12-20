package lms;


public class UseAdd {
	  public static void main(String [] args){
	  	Add software=new Add();
	    software.name=args[0];
	    software.version=Integer.parseInt(args[1]);
	    software.layer=args[2];
	  
	    int c= software.version%2;
	    boolean d=c==1;
	    System.out.println(software.name+"-"+d+"-"+software.layer);
	  }
	}