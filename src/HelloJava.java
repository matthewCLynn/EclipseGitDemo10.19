import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String fName =scan.nextLine();
		System.out.println("Hello, " + fName + "!");
		
		
		scan.close();
	}

}
