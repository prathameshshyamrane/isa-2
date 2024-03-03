package question4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class count {
 

	    @Test
	    public void testCountDigitsWithPositiveNumber() {
	        int number = 12345;
	        int expectedCount = 5;
	        assertEquals(expectedCount, count.countdigit(number));
	    }

	    private static Object countdigit(int number) {
			// TODO Auto-generated method stub
			return null;
		}

		@Test
	    public void testCountDigitsWithNegativeNumber() {
	        int number = -9876;
	        int expectedCount = 4;
	        assertEquals(expectedCount, count.countdigit(number));
	    }
	}









	
