import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double length;
		double width;
		double height;
		String option = "yes";

		System.out.println("Welcome to Grand Circus' Room Detail Generator!\n");

		
		//test first character in option for lower case y
		while (Character.toLowerCase(option.charAt(0)) == ('y')) {
			
			//get input
			System.out.print("Enter Length : ");
			length = scanner.nextDouble();

			System.out.print("Enter Width : ");
			width = scanner.nextDouble();

			System.out.print("Enter Height : ");
			height = scanner.nextDouble();
			
			//output calculations
			System.out.println("Area: " + length * width);
			System.out.println("Perimeter: " + ((length * 2) + (width * 2)));
			System.out.println("Volume: " + length * width * height);

			//get input for continue
			System.out.print("Continue? (y/n)");
			String garbage = scanner.nextLine();
			option = scanner.nextLine();
			
			while (true) {
				//if y, continue - if no, exit - if not y or n, ask again
				if (Character.toLowerCase(option.charAt(0)) == ('y')) {
					break;
				} else if (Character.toLowerCase(option.charAt(0)) == 'n') {
					System.out.println("Goodbye");
					break;
				} else {
					System.out.println("You must answer yes or no");
					System.out.print("Continue? (y/n)");
					option = scanner.nextLine();
				}
			}
		}

		scanner.close();
	}
}
