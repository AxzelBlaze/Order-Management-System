package com.userservice.userservice.validator;

import java.time.LocalDate;


import com.userservice.userservice.entity.Buyer;
import com.userservice.userservice.entity.Seller;

public class Validator {

	public static void validate(Buyer buy) throws Exception {
		if(!validateName(buy.getUserName())) {
			throw new Exception("Validator.Invalid_UserName");
		}
		if(!validatePassword(buy.getUserPassword())) {
			throw new Exception("Validator.Invalid_Password");
		}
		if(!validatePhoneNumber(buy.getPhoneNumber())) {
			throw new Exception("Validator.Invalid_PhoneNumber");
			
		}
		if(!validateEmail(buy.getEmail())) {
			throw new Exception("Validator.Invalid_EmailAddress");
		}
	}
	public static void validate(Seller sell) throws Exception {
		if(!validateName(sell.getUserName())) {
			throw new Exception("Validator.Invalid_UserName");
		}
		if(!validatePassword(sell.getUserPassword())) {
			throw new Exception("Validator.Invalid_Password");
		}
		if(!validatePhoneNumber(sell.getPhoneNumber())) {
			throw new Exception("Validator.Invalid_PhoneNumber");
			
		}
		if(!validateEmail(sell.getEmail())) {
			throw new Exception("Validator.Invalid_EmailAddress");
		}
	}

//	}

	public static Boolean validateName(String name) {
		String regx ="[A-Za-z]+";
		if(name.matches(regx)){
			return true;
		}

		return false;

	}

	public static Boolean validatePassword(String password) {
		String regx = "^(?=.*[0-9])" 
				+ "(?=.*[a-z])(?=.*[A-Z])"
				+ "(?=.*[@#$%^&!*])"
				+ "(?=\\S+$).{7, 20}$ ";
		if(password.matches(regx)) {
			return true;
		}

		return false;
	}

	public static Boolean validatePhoneNumber(String phoneNumber) {
		String regx = " ^[4-9]{9}$ " ;
		if(phoneNumber.matches(regx)) {
			return true;
		}
		

		return false;
	}

	public static Boolean validateEmail(String email) {
		String regx= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		if(email.matches(regx)) {
			return true;
		}
		return false;


		
	}

}