class Person{
	String name;
	int age;
	String course;
	
	public Person(String name){
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	
	public Person(){
	}
	
	public void displayPerson(){
		System.out.println("Name : "+ name);
		System.out.println("Age : " + age);
		System.out.println("Course : " + course);
	}
}

class Student extends Person{
	
}
public class Main{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Inuthi";
		s1.age = 21;
		s1.course = "bsc it";
		
		s2.name = "Subanya";
		s2.age = 25;
		s2.course = "bit";
		
		
		
		s1.displayPerson();
		s2.displayPerson();
		
	}
}