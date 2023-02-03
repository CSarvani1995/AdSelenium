package Programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsset {
	
							//	@Test
							//	public void CreateContact()
							//	{
							//		System.out.println("step1");
							//		System.out.println("step2");
							//		//Hard asset
							//		Assert.assertEquals(false, true);
							//							//(act,expect)
							//		System.out.println("step3");
							//		System.out.println("step4");
							//	
							//	}
							//	@Test
							//	public void ModifyContact()
							//	{
							//		System.out.println("step5");
							//		System.out.println("step6");	
							//	}
	@Test
	public void Create()
	{
		String expName= "Sarvani";
		String actName= "Sarvani Chowdam";
		Assert.assertEquals(expName, actName);
	}
	@Test
	public void Modify()
	{
		String expName= "Sarvani";
		String actName= "Sarvani";
		Assert.assertEquals(expName, actName);
	}
}
