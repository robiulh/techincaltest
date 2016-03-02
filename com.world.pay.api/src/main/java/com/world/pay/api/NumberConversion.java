package com.world.pay.api;

import com.world.pay.NumbersToWordsImpl;
import com.world.pay.exceptions.IllegalNumberException;

public final class NumberConversion {
	
	private static NumbersToWordsImpl numbersToWords =  new NumbersToWordsImpl(); 
	private NumberConversion(){
		
	}
	
	public static String convertNumberToWord(int i) throws IllegalNumberException{
		
		return numbersToWords.convert(i);
	}

}
