import java.util.ArrayList;

public class Store {

	ArrayList<Employee> employees = new ArrayList<Employee>();
	Manager manager;
	Stocker stocker;

	public static void main(String[] args) {
		Store s = new Store();
		s.PrintEmployees();
		System.out.println();
		s.PrintManager();
		
		//TODO: The manager doesn't know how to StockShelfs.

		s.manager.stockShelf(s.stocker);
		s.employees.add(s.stocker);
		
		/**
		 * Challenge Concept: try/catch and throwing an exception
		 * 
		 * Here I am attempting to hire more employees than my manager can handle.
		 * If the manager can not support the number of employees being hired, it will throw an exception
		 */
		s.HireEmployee();
		s.PrintEmployees();
	}
	
	public Store() {
		//Notice I am using different constructors for Employees
		employees.add(new Employee("Tom"));
		employees.add(new Employee("Jane", 40000));
		
		// Create Store Stocker
		 
		stocker = new Stocker();
		stocker.name = "John";
		stocker.salary=35000;
		
		/*
		 * This add statement will not work until the Manager class has been extended
		 * However, I never set the manager correctly
		 * 
		 * TODO: assign the manager for the store class and add the manager to the employee list
		 */
		this.manager=new Manager("Tim", 50000, 5);
		employees.add(manager);
		//employees.add(new Employee("Tim",50000));
		//employees.add(new Manager("Tim", 50000, 5));
		
		//Notice that I can put a manager inside a list of employees because Manager is a subclass of Employee.
	}
	
	public void PrintEmployees() {
		System.out.println("Employees");
		for(Employee e : employees) {
			System.out.println(e);
		}
		
	}
	
	public void PrintManager() {
		System.out.println(manager);
	}
	
	//Notice this is a private method
	private void HireEmployee() {
		try {
			employees.add(manager.HireEmployee(employees.size(), "Wanda"));
			employees.add(manager.HireEmployee(employees.size(), "James"));
			employees.add(manager.HireEmployee(employees.size(), "Kenny"));
			employees.add(manager.HireEmployee(employees.size(), "Sasha"));
		}
		catch(Exception e) {
			//do nothing
		}
	}

}
