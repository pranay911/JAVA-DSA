package practice;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three no's");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int avg=(a+b+c)/3;
		System.out.println("Average of Three No's is: "+avg);
	}

}
