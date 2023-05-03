package demo1;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class day_9_1 {
  @Test(dataProvider = "dp")
  public void Calcuator(Integer a, Integer b) {
	  if(a==2 && b==1) {
		  Assert.assertEquals(a+b, 3);
		  Assert.assertEquals(a-b, 1);
		  Assert.assertEquals(a*b, 2);
		  Assert.assertEquals(a/b, 2);
	  }
	  if(a==12 && b==4) {
		  Assert.assertEquals(a+b, 16);
		  Assert.assertEquals(a-b, 8);
		  Assert.assertEquals(a*b, 48);
		  Assert.assertEquals(a/b, 3);
	  }
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 2, 1},
      new Object[] { 12, 4},
    };
  }
}
