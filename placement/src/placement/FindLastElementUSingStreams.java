package placement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindLastElementUSingStreams {
	
//    @Override
//    public void finalize(){
//        System.out.println("Collected");
//    }
	public static void main(String[] args) {
        List<String> s = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        Optional<String> a=s.stream().reduce((x,y)->y);
        a.ifPresent(x->System.out.println(x));
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy :EEEE HH:mm:ss");
        LocalDateTime c= LocalDateTime.now();
        System.out.println(c.format(formatter));
       
//        FindLastElementUSingStreams e=new FindLastElementUSingStreams();
//        System.out.println(e.hashCode());
//        FindLastElementUSingStreams e1=new FindLastElementUSingStreams();
//        System.out.println(e1.hashCode());
//        e=new FindLastElementUSingStreams();
//        System.out.println(e.hashCode());
//        System.gc();
	}

}