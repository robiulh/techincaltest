package com.world.pay.enums;

public enum TensAndUnits {
	
	ZERO(0, "ZERO"),

	
	ONE(1, "ONE"),

	
	TWO(2, "TWO"),

	
	THREE(3, "THREE"),

	
	FOUR(4, "FOUR"),

	
	FIVE(5, "FIVE"),

	
	SIX(6, "SIX"),

	
	SEVEN(7, "SEVEN"),

	
	EIGHT(8, "EIGHT"),


	NINE(9, "NINE"),

	
	TEN(10, "TEN"),

	
	ELEVEN(11, "ELEVEN"),

	
	TWELVE(12, "TWELVE"),


	THIRTEEN(13, "THIRTEEN"),

	
	FOURTEEN(14, "FOURTEEN"),

	
	FIFTEEN(15, "FIFTEEN"),

	
	SIXTEEN(16, "SIXTEEN"),

	
	SEVENTEEN(17, "SEVENTEEN"),

	
	EIGHTEEN(18, "EIGHTEEN"),

	
	NINETEEN(19, "	NINETEEN"),

	
	TWENTY(20, "TWENTY"),

	
	THIRTY(30, "	THIRTY"),

	
	FORTY(40, "FORTY"),


	FIFTY(50, "FIFTY"),


	SIXTY(60, "SIXTY"),


	SEVENTY(70, "SEVENTY"),


	EIGHTY(80, "EIGHTY"),

	NINETY(90, "NINETY");


	private int intValue;


	private String convertedNumber;


	private TensAndUnits(final int intValue, final String convertedNumber) {
		this.intValue = intValue;
		this.convertedNumber = convertedNumber;
	}


	public int getIntValue() {
		return this.intValue;
	}


	public String getWordValue() {
		return convertedNumber;
	}


	public static String findWord(final int num) {
		String output = "";
		for (TensAndUnits tau : values()) {
			if (num == tau.getIntValue()) {
				output = tau.getWordValue();
				break;
			}
		}
		return output;
	}
}
