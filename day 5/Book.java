import java.util.Scanner;

public class Book{
	private String Title;
	private double Price;
	
	public Book(String Title){
		this.Title = Title;
		this.Price= 500.0;
	}
	public void displayBookInfo(){
		System.out.println("Book Title :" + Title + "price : " + Price);
	}
	
	public void updatePrice(double newPrice){
		if(newPrice>0){
			this.Price = newPrice;
			System.out.println("Enter your update price");
		}
		else{
			System.out.println("Invalied price!");
		}
		
	}
	
	public static void main(String[] args){
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter book title : ");
		String bookTitle = scanner.nextLine();
		
		Book b1 = new Book(bookTitle);
		b1.displayBookInfo();
		
		System.out.println("Enter new price : ");
		double newPrice = scanner.nextDouble();
		
		b1.updatePrice( newPrice);
		b1.displayBookInfo();
		scanner.close();
	}
}
		
		