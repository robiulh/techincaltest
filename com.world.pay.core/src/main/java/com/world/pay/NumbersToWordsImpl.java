package com.world.pay;

import com.world.pay.constants.ApplicationConstants;
import com.world.pay.enums.TensAndUnits;
import com.world.pay.exceptions.IllegalNumberException;


public class NumbersToWordsImpl implements NumbersToWords {

		
	/**
	 * @param args
	 * @throws IllegalNumberException 
	 */
	private static boolean uppercase = true;
	
	public static boolean isUppercase() {
		return uppercase;
	}

	public static void setUppercase(boolean uppercase) {
		NumbersToWordsImpl.uppercase = uppercase;
	}

	public  String convert(Integer i) throws IllegalNumberException {
		
		String output="";
		StringBuffer sb = new StringBuffer();
		
		if(i<0 || i > 999999999){
			throw new IllegalNumberException("Entered number not in the range");
		}
		
		if( i < 20){
			sb.append(TensAndUnits.findWord(i)); 									
			}
		else if( i < 100) 
		{
			sb.append(TensAndUnits.findWord(i - (i % 10)));
			if(i % 10 > 0){
				sb.append(ApplicationConstants.SEPARATOR).append(convert(i % 10));
			}
			
		}
		else if( i < 1000) {
			sb.append(TensAndUnits.findWord(i/100)).append(ApplicationConstants.HUNDREDS); 
			if(i % 100 > 0){
				sb.append(ApplicationConstants.SEPARATOR_AND + convert(i % 100));
			}else{
				sb.append("");
			}			
		}
		else if (i < 1000000) {
			System.out.println(i / 1000);
			
			sb.append(convert(i / 1000)).append(ApplicationConstants.THOUSANDS);
				
			Integer num = (i % 1000);
				if(i % 1000 > 0){
					if(num.toString().length()<=2){
						sb.append(ApplicationConstants.SEPARATOR_AND);
					}else{
						sb.append(ApplicationConstants.SEPARATOR);
					}
					sb.append(convert(i % 1000));
					
				}else{
					sb.append("");
				}
		
	        }

		else  if (i < 1000000000) {
			sb.append(convert(i / 1000000)).append(ApplicationConstants.MILLIONS);
			if(i % 1000000 > 0){
				sb.append(ApplicationConstants.SEPARATOR  + convert(i % 1000000));
			}else{
				sb.append("");
			}
			
	   }    
		
		output=	sb.toString();
		if(!uppercase){
			output.toLowerCase();
		}
		return output;
	}
	
	

}
