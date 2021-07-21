package com.bridgelab.program;
import java.util.regex.Pattern;

interface Validator
{
	boolean detailsValidator(String input);
}
public class UserRegistarationLambda {

	public static void main(String[] args) {
		Validator validatefirstName = (firstName) ->  {return Pattern.matches(UserRegistaration.NAME_VALIDATOR, firstName);};
		System.out.println("Entered FirstName  " +validatefirstName.detailsValidator("Deepak"));
		Validator validatelastName = (lastName) ->  {return Pattern.matches(UserRegistaration.NAME_VALIDATOR, lastName);};
		System.out.println("Entered LastName  " +validatelastName.detailsValidator("Mench"));
		Validator validatePhoneName = (phonenumber) ->  {return Pattern.matches(UserRegistaration.CONTACTNUMBER_VALIDATOR, phonenumber);};
		System.out.println("Entered Phone Number  " +validatefirstName.detailsValidator("917038716093"));
		Validator validateEmailName = (email) ->  {return Pattern.matches(UserRegistaration.EMAIL_VALIDATOR, email);};
		System.out.println("Entered Email ID  " +validateEmailName.detailsValidator("deepakmench18@gmail.com"));
		Validator validatePassword = (password) ->  {return Pattern.matches(UserRegistaration.PASSWORD_VALIDATOR, password);};
		System.out.println("Entered Password  " +validatePassword.detailsValidator("Deepak@18"));
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
