class Student{
		private String name;
		int age;
		int roll;
		
		static String university;
		void setName(String name){
		this.name = name;}
		String getName(){
			return this.name;}
		

}
public class Test2{
	public static void main(String[] args){
    Student s1 = new Student();
	s1.setName("ABC");
	System.out.println(s1.getName());
		
	}
}	
	