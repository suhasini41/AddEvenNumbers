package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddEvenNumbers
{
	private int addEvenNum(int n) {
		int sum = 0;
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(addEvenNum(6), 12);
	}

}
