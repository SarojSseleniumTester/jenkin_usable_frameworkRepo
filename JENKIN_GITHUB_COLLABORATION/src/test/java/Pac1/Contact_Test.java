package Pac1;

import org.testng.annotations.Test;

public class Contact_Test 
{
	@Test
	public void CreateContact()
	{
		System.out.println("CreateContact");
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);


		
	}
	@Test
	public void ModifyContact()
	{
		System.out.println("ModifyContaxt");
	}

}
