package oops;

//public class UseStoryBook {
//
//}
public class UseStoryBook {
	public static void main(String[]args){
      int a=Integer.parseInt(args[0]);
      String b=args[1];
      String c=args[2];
      int d=Integer.parseInt(args[3]);
    StoryBook s1=new StoryBook(a,b,c,d);
    System.out.println(s1);
      
    }
}
class StoryBook {
  private int id;
  private String author;
  private String title;
  private int price;


public void setId(int i){
	id=i;
}
public void setAuthor(String a){
  author =a;
}
public void setTitle(String t){
  title = t;
}
public void setPrice(int p){
	price=p;
}
public int getId(){
	return id;
}
public String getAuthor(){
	return author;
}
public String getTitle(){
	return title;
}
public int getPrice(){
	return price;
}
public StoryBook(int i,String a,String t,int p){
	id=i;
  	author=a;
  	title=t;
  	price=p;
}
public String toString(){
	return "Title: "+title+", Author:"+author;
}
}