import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Radius");
		int radius= sc.nextInt();
		float pi=3.14f;
		float area=pi*radius*radius;
		System.out.println(area);
	}

}
