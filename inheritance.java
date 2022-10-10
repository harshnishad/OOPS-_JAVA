abstract class Shape{
	abstract String color; // parent class or base class
	Shape(){
	          System.out.println("neela");
			 }
}
class triangle extends Shape{
	         
}

public class inheritance{
	
	public static void main(String[] args){
		triangle t1 = new triangle();
         t1.color = "blue";
	}
}