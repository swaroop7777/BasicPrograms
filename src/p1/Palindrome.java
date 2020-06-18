package p1;

public class Palindrome {
public static void main(String[] args) 
{
String inp="my name is a your name is";
String[] a=inp.split(" ");
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("Repeated words:");
				System.out.println(a[j]);
			}
			else
				continue;
		
		}
	}

}
}
