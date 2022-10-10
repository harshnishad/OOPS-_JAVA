class Pen{
	String pentype;
	String color;
public void peninfo(){
	System.out.println(this.pentype);
	System.out.println(this.color);
}
Pen(){
     /* for non parametarise */
}
	
 Pen(String pentype , String color){
	 this.pentype = pentype;
	 this.color = color;
 }
	
}



public class prac{
	public static void main(String[] args){
     
	 Pen h1 = new Pen();  //  pen() is special type func which is known as Constructor rest in notes.
	 //h1 reference variableS
	 h1.pentype="ball wala"; ///>>>>>>>>>>>NON PARAMETER<<<<<<<<<<</////
	 h1.peninfo();
	 
	 Pen h2 = new Pen();
	 h2.pentype="jel wala";  //this keyword tells the value which is called by any object
	 
	 h2.peninfo();
	 
	 
	 Pen h3 = new Pen("kala","neela");
	 h3.peninfo();
	 
	 
	 
	 
	}
}