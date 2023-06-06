package practice;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of Pencil, Pen, Eraser");
		float pencil=sc.nextFloat();
		float pen=sc.nextFloat();
		float eraser=sc.nextFloat();
		float total= (pen+pencil+eraser)+10.8f;
		System.out.println("Total is :"+total);
	}

}
