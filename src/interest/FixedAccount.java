package interest;

import java.util.Scanner;

	 class FA
	 {
		 public void calculateIntrest(double amount)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enetr rate for FA");
				int rate=sc.nextInt();
				double intrest=(amount*rate/100);
				System.out.println(intrest);
			}

}
	
	class SA extends FA
	{	
		public void calculateIntrest(double amount)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr rate for SA");
			int rate=sc.nextInt();
			double intrest=(amount*rate/100);
			System.out.println(intrest);
		}
	}
	
	class FixedAccount {
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter amount to calaculet intrest");
		
		double amount=sc.nextDouble();
	   FA fa=new FA();
	fa.calculateIntrest(amount);
	SA sa=new SA();
	sa.calculateIntrest(amount);
	
	//SA sa=new SA();

	
	}
	}
	
	
		


