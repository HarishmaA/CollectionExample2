package SQLQueriesWithCollections;

import java.util.Scanner;
import java.util.InputMismatchException;

public class User {

	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		RequestHandler requestHandler = new RequestHandler();
		do {
			System.out.println("WHAT DO YOU WANT TO DO??");
			System.out.println("1.ADD A NEW EMPLOYEE");
			System.out.println("2.DISPLAY ALL EMPLOYEE DETAILS");
			System.out.println("3.DELETE ALL EMPLOYEE DETAILS");
			System.out.println("4.TO KNOW THE NUMBER OF EMPLOYEES");
			System.out.println("5.TO DISPLAY NAMES OF ALL EMPLOYEES");
			System.out.println("Enter your choice");
			int selectedOption = scanner.nextInt();
			switch (selectedOption) {

			// Insert into Employee(....);
			case 1:
				System.out.println();
				int employeeId, employeeAge;
				String employeeName, employeeDesignation, teamName;
				double employeeSalary;
				try {
					System.out.println("Enter the id number");
					employeeId = scanner.nextInt();
					System.out.println("Enter name");
					employeeName = scanner.next();
					System.out.println("Enter the age");
					employeeAge = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter the designation");
					employeeDesignation = scanner.nextLine();
					System.out.println("Enter the team name");
					teamName = scanner.nextLine();
					System.out.println("Enter the salary");
					employeeSalary = scanner.nextDouble();
				}

				catch (InputMismatchException e) {
					throw new InputMismatchException("OOPS!!! YOU TYPED WRONG INPUT!!!");
				}

				requestHandler.addingNewEmployee(employeeName, new Employee(employeeId, employeeName, employeeAge,
						employeeDesignation, teamName, employeeSalary));
				break;

			// Select * from Employee;
			case 2:
				requestHandler.displayAllEmployeeDetails();
				break;

			// Drop table Employee;
			case 3:
				requestHandler.deleteAllEmployeeDetails();
				break;
			// Select count(*) from Employee;
			case 4:
				int result = requestHandler.noOfEmployees();
				System.out.println("The number of employees are " + result);
				break;
			// Select employeeName from Employee;
			case 5:
				requestHandler.displayEmployeeName();
				break;

			default:
				System.out.println("Enter a valid option!!!!");
			}
			scanner.nextLine();
			System.out.println("Do you want to continue?? If you want to continue type \"yes\" else \"no\"");
			ch = scanner.nextLine().trim().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		scanner.close();

	}

}
