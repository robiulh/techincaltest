package com.world.pay;

import com.world.pay.exceptions.IllegalNumberException;

public interface NumbersToWords {

	  String convert(Integer i) throws IllegalNumberException; 
}
