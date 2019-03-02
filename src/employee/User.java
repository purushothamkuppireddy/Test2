package employee;

import java.util.ArrayList;
import java.util.Scanner;

 
	
	
public class User{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);	
	System.out.println("enetr the user details");	
	 String name= sc.next();
	 long phone=sc.nextLong();
	 int age;
int ag=sc.nextInt();
if(ag<20||ag>55)
	throw new Exception("age is not sufficient"); 
else
	age=ag;
	

System.out.println(name);
System.out.println(phone);	
System.out.println(age);
	}
	
	
}






