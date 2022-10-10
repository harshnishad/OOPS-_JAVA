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

 class Student{
	 String name;
	 int age;
	 
	 public void printinfo(){
		 System.out.println(this.name);
		 System.out.println(this.age);
	 } 
 }	   
	

public class oops{
	public static void main(String args[]){
		
		/*Pen Pen1 = new Pen();
		Pen1.color = "blue";
	 	Pen1.type = "gel";
		
		Pen pen2 = new Pen();
		Pen2.color = "black";
		Pen2.type = "ballpoint";
		
		Pen1.printColor();
		Pen2.printColor(); */
		
		Student s1 = new Student();
		s1.name = "aman";
		s1.age =24;
		
		s1.printinfo();
		
		
	 }
}
	