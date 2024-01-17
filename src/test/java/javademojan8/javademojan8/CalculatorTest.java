package javademojan8.javademojan8;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc=new Calculator();
		
		assertEquals(200, calc.add(100, 100));
	}

}
