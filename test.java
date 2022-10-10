class Pen{
	String color;
	String type;
	
	public void write(){
		System.out.println("write something");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

	

public class test{
	public static void main(String args[]){
		
		Pen Pen1 = new Pen();
		Pen1.color = "blue";
	 	Pen1.type = "gel";
		
		Pen Pen2 = new Pen();
		Pen2.color = "black";
		Pen2.type = "ballpoint";
		
		Pen1.printColor();
		Pen2.printColor(); 
		
		
		
		
	 }
}
	