package largest;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int number = scan.nextInt();
	System.out.println("Enter the Target number not present: ");
	int targetNum = scan.nextInt();
	int temp1 = 0, temp2 =0;
	do{
	int count =0;
	number--;
	temp2 = number;
	do{
	temp1 = temp2%10;

	temp2 = (temp2-temp1)/10;

	if(temp1==targetNum)
	{
	count--;
	}
	}while(temp2!=0);
	if(count==0)
	{
	System.out.println(number);
	break;
	}
	}while(number!=0);
	}
	}

