package p1;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for fabonacci series:(how many values to print?)");
		int limit=sc.nextInt();
		int val1=0;
		int val2=1;
		int cnt=0;
		int sum=0;
		System.out.println("Fabonacci Series:\n"+val1+"\n"+val2);
		while(cnt<=limit-3)
		{
			sum=val1+val2;
			val1=val2;
			val2=sum;
			System.out.println(sum);
			cnt++;
		}

	}

}
