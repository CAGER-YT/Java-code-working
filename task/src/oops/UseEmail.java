package oops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email e=new Email();
		System.out.println(e.validateEmail("sandykumar@gmail.com"));
	}

}
class Email{
	public boolean validateEmail(String email) {
		String regex = "^[\\w\\.-]+@[\\w\\.-]+.[\\w\\.-]+$";    
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);        
        return matcher.matches();
	}
}