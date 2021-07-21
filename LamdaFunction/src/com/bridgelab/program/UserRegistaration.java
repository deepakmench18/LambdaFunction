package com.bridgelab.program;

public class UserRegistaration {
	
	static final String NAME_VALIDATOR = "^[a-zA-Z]{4,}$";
	static final String CONTACTNUMBER_VALIDATOR = "^91\\s[0-9]{10}$";
	static final String EMAIL_VALIDATOR ="^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$";
	static final String PASSWORD_VALIDATOR = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"
            										+ "(?=.*[@#$%^&+=])"
            										+ "(?=\\S+$).{8,20}$";
}
