package lmsfor;

//public class vowels {
//
//}
public class vowels {
	public static void main(String[]args){
	String word=args[0];
      String word2=word.toUpperCase();
      int i,c=0;
      String temp="";
      for(i=word.length()-1;i>=0;i--){    
        //capital letter finding from string
        if(word.charAt(i)==word2.charAt(i))
        {
          c=c+1;
        }else
        {
        }
      } 
      System.out.println(c);
    }
}