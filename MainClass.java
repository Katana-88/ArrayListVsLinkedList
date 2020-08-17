import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Choose an array. Type 1 for ArrayList or 2 for LinkedList: ");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		int num = Integer.parseInt(choice);
		
		System.out.println("Type N: ");
		String choice2 = scan.nextLine();
		int n = Integer.parseInt(choice2);
		
		switch(num) {
		
		case 1:
			DeleteInArrayList.Run(n);
			break;
			
		case 2:
			DeleteInLinkedList.Run(n);
			break;
			
			default: System.out.println("Error number.");
		}

	}

}
