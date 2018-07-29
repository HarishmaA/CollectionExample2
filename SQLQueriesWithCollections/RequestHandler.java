package SQLQueriesWithCollections;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class RequestHandler {
	HashMap<String, Employee> employeeHashMap = new HashMap<>();

	// Insert into Employee(....);
	void addingNewEmployee(String employeeName, Employee employee) {
		employeeHashMap.put(employeeName, employee);
	}

	// Select * from Employee;
	void displayAllEmployeeDetails() {
		System.out.println();
		System.out.println("EMPLOYEE NAME\tCOMPANY NAME\tID NO.\tEMPLOYEE NAME\tAGE\tDESIGNATION\tTEAMNAME\tSALARY\t");
		System.out.println();
		for (Map.Entry<String, Employee> entry : employeeHashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	// Drop table Employee;
	void deleteAllEmployeeDetails() {
		employeeHashMap.clear();
	}

	// Select count(*) from Employee;
	int noOfEmployees() {
		return employeeHashMap.size();
	}

	// Select employeeName from Employee;
	void displayEmployeeName() {
		System.out.println("The employees are");
		Set<String> keys = employeeHashMap.keySet();
		System.out.println(keys);
		//for (Map.Entry<String, Employee> entry : employeeHashMap.entrySet()) {
	        //	System.out.println(entry.getKey());
		//}

	}
}
