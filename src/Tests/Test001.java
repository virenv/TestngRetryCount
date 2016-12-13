package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import CustomAnnotations.RetryCountIfFailed;

public class Test001 {
	
	@Test
	@RetryCountIfFailed(1000)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
