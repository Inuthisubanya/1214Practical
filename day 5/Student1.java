import java.util.Scanner;
class Student{
	private String studentName;
	private String courseName;
	
	public Student(String studentName){
		this.studentName = studentName;
		this.courseName = "IT";
	}
	
	public void displayStudentInfo(){
		System.out.println("Student name :" + studentName + ", course :" + courseName);
	}
	
	public void updateCourse(String course){
		if(course != null && course.trim().isEmpty()){
			System.out.print("Enter updated course");
		}
			else{
			System.out.print("Invalied value");
			}
		}
		
		public class Student1{
			public static void main(String[] args){
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("Enter your name :");
				String name = scanner.nextLine();
				
				
				Student s1 = new Student(name);
				s1.displayStudentInfo();
				
				
				System.out.print("Enter course :  ");
				String course = scanner.nextLine();
				
				s1.updateCourse(course);
				s1.displayStudentInfo();
				
				scanner.close();
			}
		}
}