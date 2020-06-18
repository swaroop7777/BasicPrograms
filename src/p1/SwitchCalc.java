package p1;

import java.util.Scanner;

public class SwitchCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		l1:
		while(true)
		{
		System.out.println("Enter The Numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter the operator:");
		String ch=sc.next();
		int n;
		switch(ch)
		{
			case "+":
				int sum=num1+num2;
				System.out.println("The sum is: "+sum);
				System.out.println("\nEnter 1 to repeat or press any digit to exit");
				n=sc.nextInt();
				if(n==1)
					continue l1;
				System.exit(0);
			case "-":
				int diff=num1-num2;
				System.out.println("The difference is: "+diff);
				System.out.println("\nEnter 1 to repeat or press any digit to exit");
				n=sc.nextInt();
				if(n==1)
					continue l1;
				System.exit(0);
			case "*":
				int mul=num1*num2;
				System.out.println("The Product is: "+mul);
				System.out.println("\nEnter 1 to repeat or press any other digit to exit");
				n=sc.nextInt();
				if(n==1)
					continue l1;
				System.exit(0);
			default:
				System.out.println("Enter the one of operators(*,/,-,+)");
		}
	}

}
}
