package optionalclass;

import java.util.Optional;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="santhosh";
//		Optional<String>op1=Optional.of(word);
		Optional<String>op2=Optional.ofNullable(word);
		if(op2.isPresent()) {										//to check whether any string persent or not
			System.out.println(word.toUpperCase());
		}
		else {
			System.out.println("The value is null");
		}
//		System.out.println(op2.orElse("the value is null"));		//if the word is present return word or return else statement
	}

}
