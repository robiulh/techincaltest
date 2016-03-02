package com.world.pay.api;




import com.world.pay.exceptions.IllegalNumberException;

public class Convert {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IllegalNumberException {
		
		
		
		//test.setUppercase(true);
		System.out.println(NumberConversion.convertNumberToWord(56945781));	
		System.out.println(NumberConversion.convertNumberToWord(99999999));
		System.out.println(NumberConversion.convertNumberToWord(1005));	
		System.out.println(NumberConversion.convertNumberToWord(99));	
		System.out.println(NumberConversion.convertNumberToWord(1042));	
	}

}
