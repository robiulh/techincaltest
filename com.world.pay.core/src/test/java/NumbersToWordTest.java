
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.world.pay.NumbersToWords;
import com.world.pay.NumbersToWordsImpl;

import com.world.pay.exceptions.IllegalNumberException;

import static org.junit.Assert.*;


public class NumbersToWordTest {
	
	private NumbersToWords test = new NumbersToWordsImpl(); 
	@Rule
	  public final ExpectedException exception = ExpectedException.none();
	
	 @Test
	 public void testConvert() throws IllegalNumberException{
		 
		 	assertEquals("ZERO", test.convert(0));	 
	        assertEquals("ONE", test.convert(1));	 
	        assertEquals("TWENTY ONE", test.convert(21));	 
	        assertEquals("ONE HUNDRED AND FIVE", test.convert(105));	 
	        assertEquals("ONE HUNDRED AND TWENTY THREE", test.convert(123));	 
	       assertEquals("ONE THOUSAND AND FIVE", test.convert(1005));	 
	       assertEquals("ONE THOUSAND AND FORTY TWO", test.convert(1042));
	        assertEquals("FIFTY SIX MILLION NINE HUNDRED AND FORTY FIVE THOUSAND SEVEN HUNDRED AND EIGHTY ONE", test.convert(56945781));
	        assertEquals("NINE HUNDRED AND NINETY NINE MILLION NINE HUNDRED AND NINETY NINE THOUSAND NINE HUNDRED AND NINETY NINE", test.convert(999999999));
	        
	 }
	 
	 @Test
	 public void testNegativeIllegalNumberException() throws IllegalNumberException {
		 exception.expect(IllegalNumberException.class);
		 test.convert(-151);
	 }
	 
	 @Test
	 public void testOORIllegalNumberException() throws IllegalNumberException {
		 exception.expect(IllegalNumberException.class);
		 test.convert(1000000000);
	 }

}
