class Student{
	String Name;
	int Age;
	
	void display(){
		System.out.println("Name :" + Name);
		System.out.println("Age :" + Age);
	}
}

public class Example{
public static void main(String[] args){
	Student e1 = new Student();
	
	e1.Name="Inuthi";
	e1.Age=21;
	
	e1.display();
}
}
