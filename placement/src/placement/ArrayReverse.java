package placement;

class ArrayReverse {
    public static void main(String[] args) {
//        String[] a={"One","Two"};
    	String b="one two";
    	String a[]=b.split(" ");
        Test t1=new Test();
        System.out.println(t1.arrayReverse(a));
    }
}
class Test{
    public String arrayReverse(String[] a){
        String temp ="";
        for(int i=0;i<a.length;i++){
            for(int j=a[i].length()-1;j>=0;j--){
                temp=temp+a[i].charAt(j);
            }
            temp=temp+" ";
        }
        return temp;
    }
}

