package demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day_7_2 {
	    
	    int a = 10;
	    int b = 5;
	 	Calculator calculator = new Calculator();
	 	 
	    @Test(priority = 1)
	    public void testAdd() {
	        Assert.assertEquals(calculator.add(a, b), 15);
	    }

	    @Test(priority = 2)
	    public void testSubtract() {
	        Assert.assertEquals(calculator.subtract(a, b), 5);
	    }

	    @Test(priority = 3)
	    public void testMultiply() {
	        Assert.assertEquals(calculator.multiply(a, b), 50);
	    }

	    @Test(priority = 4)
	    public void testDivide() {
	        Assert.assertEquals(calculator.divide(a, b), 2);
	    } 
}

class Calculator {

	 public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public int divide(int a, int b) {
	        return a / b;
	    }
}

