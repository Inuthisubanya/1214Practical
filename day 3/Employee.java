class Employee{
	int id;
	String name;
	int salary;
	
	void dispay(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args){
		Employee e1 = new Employee;
		Employee e2 = new Employee;
	
		e1.id=101;
		e1.name="Inuthi";
		e1.salary=100000;
		
		e1.display();
		
		e2.id=100;
		e2.name="Sahan";
		e2.salary=250000;
		
		e2.display();
	}
} 
		