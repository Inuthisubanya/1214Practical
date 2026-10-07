public class Car{
	int No;
	String Model;
	String Color;
	double Weight;
	int Speed;
	
	public void Speed (){
		System.out.println(Speed);
	}
	
	public void Model (){
		System.out.println(Model);
	}
	
	public void Color (){
		System.out.println(Color);
	}
	
	public void No (){
		System.out.println(No);
	}
	
	public void Weight (){
		System.out.println(Weight);
	}




public static void main(String[] args){
	Car c1 = new Car();
	c1.Speed =150;
	c1.Model="Toyota";
	c1.Color = "Red";
	c1.No = 111;
	c1.Weight =45.5;
	
	c1.Speed();
	c1.Model();
	c1.Color();
	c1.No();
	c1.Weight();
}
}
	