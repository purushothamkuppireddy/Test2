package netpayablesalary;

import java.util.Scanner;

public class Display {
public static void main(String[] args)
{
	System.out.println("enter basic salary");
	Scanner sc=new Scanner(System.in);
	double salary=sc.nextDouble();
	
	double HRA=(salary*50/100);
	double special=(salary*75/100);
	double PF=(salary*12/100);
	
	double netsalary=salary+HRA+special-PF;
	System.out.println(netsalary);
	
	}
	
}
