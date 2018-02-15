package JenkinsMavenApp.Mavenproject;

public class Maven {

	static int empID;
	static int age;
	static double salary;
	static double vpay;
	
	public static void main(String[] args)
	{
		Maven s1=new Maven();
		s1.empID=1003;
		s1.age=30;
		s1.salary=1234.34;
		s1.vpay=123.21;
		System.out.println("Employee ID is"+empID);
		System.out.println("age is" +age);
		System.out.println("salary  is" +salary);
		System.out.println("vpay is" +vpay);
		
	}
}
