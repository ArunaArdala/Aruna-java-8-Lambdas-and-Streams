import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AverageOfList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int noOfIntegers,avgOfIntegers;
		BiFunction<Integer,Integer,Integer> biFunction=( a, b)->a+b;
		int sum=0;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		System.out.print("Enter no of elements:");
		noOfIntegers=sc.nextInt();
		int integers[] = new int[noOfIntegers];
		System.out.println("Enter elements : ");
		for(int iterator = 0;iterator < noOfIntegers;iterator++)
		{
			int num = sc.nextInt();
			integers[iterator] = num;
		}
		for(int num:integers)
		{
			sum=biFunction.apply(sum,num);
		}
		avgOfIntegers=findDiv.apply(sum,integers.length);
		System.out.println("Average of given integers is : "+avgOfIntegers);
	}
}