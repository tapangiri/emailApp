package emailApp;
import java.util.Scanner;

public class EmailApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter FirstName");
		String firstName=sc.nextLine();
		System.out.print("Enter Lastname");
		String lastName=sc.nextLine();
		
Email em1=new Email(firstName , lastName);
System.out.println(em1.showInfo());
}
}