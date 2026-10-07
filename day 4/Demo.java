 class Demo{
	 static void changeValue(int x){
		 x=100;
		 
		 System.out.println("1st value of x:" +x);
		
	 }
	 
	 public static void main(String[] args){
		 int number=5;
		 System.out.println("2nd value of x:" +number);
		 
		 changeValue(number);
		 System.out.println("last value of x:" +number);
	 }
 }
	 