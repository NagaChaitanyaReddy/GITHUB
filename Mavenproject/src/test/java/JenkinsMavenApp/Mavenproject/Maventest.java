package JenkinsMavenApp.Mavenproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Maventest {
	@Before
	public void login()
	{
		System.out.println("Login Window of Web");
		
	}
	@Test
	public void addTocart()
	{
		System.out.println("addTocar");
	}

	@After
	public void Import()
	{
		System.out.println("Import");
	}

}
