class Shape{
	 public void m1(){
		 System.out.println("this is shape");
	 }
}
class circle extends Shape{
	 public void m2(){
	     System.out.println("this is circular");
	 }
	
}
class rectangle extends Shape{
	 public void m1(){
		 System.out.println("this is shape");
	 }
	 public void m3(){
		 Super.m1();
	 }
}
class square extends rectangle{
	public void m4(){
		super.m1();
		m3();
	}
}
	 