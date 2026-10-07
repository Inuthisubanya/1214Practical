import java.util.Scanner;
public class Employee{
	private String empName;
	private double Salary;


public Employee(String empName){
	this.empName = empName;
	this.Salary = 55000;
}

public void  displayEmployeeInfo (){
	System.out.print("Enter your name :" + empName + ", Salary :" + Salary);
}

public void  updateSalary(double newSalary){
	if(newSalary>=20000){
		this.Salary = newSalary;
		System.out.println("updated salary :" + this.Salary);
	}
	else{
		System.out.print("Invalied value");
	}
}

public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter employee name : ");
	String name = scanner.nextLine();
	
	Employee e1 = new Employee(name);
	e1.displayEmployeeInfo ();
	
	
	System.out.print("Enter new salary :" );
	double newSalary = scanner.nextDouble();
	
	
	e1.displayEmployeeInfo();
	e1.updateSalary(newSalary);
	
	scanner.close();
}
}