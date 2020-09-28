package com.pinCode;

import java.util.regex.*;
import java.util.*;

public class PinCode {
	
	public static boolean isValidPinCode(String pinCode) {
		String regex="[1-9][0-9]{5}";
		Pattern pattern=Pattern.compile(regex);
		return pattern.matcher(pinCode).matches();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Pin Code Problem");

		System.out.println("Enter the pin code:");
		Scanner scan=new Scanner(System.in);
		String pin=scan.next();
		
		System.out.println("The pin code: "+pin+" is "+isValidPinCode(pin));
		
	}

}
