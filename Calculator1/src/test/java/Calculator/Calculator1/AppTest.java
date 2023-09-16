package Calculator.Calculator1;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;



class CalculatorTest {
	@Test
	public void caltestadd() {
		assertEquals(10,Calculator.add(5, 5));
	}
	
	@Test
	public void caltestsub() {
		assertEquals(0,Calculator.sub(5, 5));
	}
	
	@Test
	public void caltestmul() {
		assertEquals(25,Calculator.mul(5, 5));
	}
	
	@Test
	public void caltestdiv() {
		assertEquals(1,Calculator.div(5, 5));
	}
}
