import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
		public void testAdd() {
			int a = 4321;
			int b = 1234;
				
			Calculator cal = new Calculator();
			int actual = cal.add(a, b); 
				 
			int expected = 5555;
			assertEquals (expected, actual);
			}
	public void testsubtract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		}

	
	public void testmultiply() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 5332114;
		assertEquals (expected, actual);
		}

	public double testdivide() {
		int a = 4321;
		int b = 1234;
			
		try {
		    return a / b;
		} catch (ArithmeticException e) {
		    throw new ArithmeticException("Division by 0");
		}
	}
}
