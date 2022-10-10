class Pen{
	String pentype;
	int price;
public void peninfo(String name){
	System.out.println(name);
	
}
public void peninfo(int price){
	System.out.println(price);
	
}
public void peninfo(String name, int price){
	System.out.println(name+"  "+price);
	
}
}



public class polymorphism{
	public static void main(String[] args){
     
	 Pen h1 = new Pen();  
	 
	 
	 
	 Pen h2 = new Pen();
	
	 
	 h1.peninfo("kaala");
	 h1.peninfo("kaala",10);
	 h2.peninfo(20);
	 
	 
	 
	 
	 
	}
}