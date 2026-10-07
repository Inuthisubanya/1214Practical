import java.util.Scanner;
 class Student{
private String StudentName;
private String CourseName;

public Student(String StudentName){
this.StudentName = StudentName;
this.CourseName = "IT";
}

public void displayStudentInfo(){
	System.out.println("Student Name :" + StudentName + " ,Course Name : " + CourseName);
}


public void updateCourse(String Course){
	if(Course !=null && !Course.trim().isEmpty()){
		this.CourseName = Course;
		System.out.println("Updated Course name :" +this.CourseName);
	}
	else{
		System.out.println("Invalid course name!");
	}
}

class StudentApp{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in );
	
	System.out.print("Enter student name :" );
	String name = scanner.nextLine();
	
	Student s1 = new Student(name);
	s1.displayStudentInfo();
	
	System.out.print("Enter new course name :" );
	String newCourse = scanner.nextLine();
	
	
	s1.updateCourse(newCourse);
	s1.displayStudentInfo();
	
	scanner.close();
}
}
}

