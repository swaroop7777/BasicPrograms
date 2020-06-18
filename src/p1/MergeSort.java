package p1;

import java.util.Scanner;

public class MergeSort {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the total no. of values you want in an array..");
			int n = sc.nextInt();
			int[] a = new int[n];
			System.out.println("Enter the values into array to be sorted using the merge sort..");
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(a);
			int []temp=mergeSort(a);
			System.out.println("Final sorted array:");
			for(int i:temp)
			{
				System.out.print(i+" ");
			}
			
		}
		public static int[] mergeSort(int a[])
		{
			if(a.length==1)
				return a;
			int mid=a.length/2;
			int left[]=new int[mid];
			int right[]=new int[a.length-mid];
			for(int i=0;i<=mid-1;i++)
			{
				left[i]=a[i];
			}
			int k=0;
			for(int i=mid;i<a.length;i++)
			{
				right[k]=a[i];
				k++;
			}
			left=mergeSort(left);
			right=mergeSort(right);
			merge(a,left,right);
			return a;
			
			
		}
		public static int [] merge(int[] a,int left[],int right[])
		{
			int i=0;
			int j=0;
			int k=0;
		while(i<=left.length-1 && j<=right.length-1)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
			}
			else
			{
				a[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<=left.length-1)
		{
			
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<=right.length-1)
		{
			a[k]=right[j];
			j++;
			k++;
		}
		return a;
		
		}
	}

