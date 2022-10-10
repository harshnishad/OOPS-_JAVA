class Student{
		String name;
		int age;
		int roll;
		
		static String university;

}
public class Test{
	public static void main(String[] args){
		 Student s1 = new Student();
		 Student s2 = new Student();
		 Student s3 = new Student();
		 s1.name = "Abc";
		 s1.age = 34;
		 s1.roll = 23;
		 System.out.println("name:"+s1.name);
		 System.out.println("name:"+s1.age);
		 System.out.println("name:"+s1.roll);
		 
		        s2=s1;
				s1.name = "java code";
		 System.out.println("name:"+s2.name);
		 System.out.println("name:"+s2.age);
		 System.out.println("name:"+s2.roll);
		 System.out.println(s3.university);
		 
		 Student.university ="GLA University";
		 System.out.println(Student.university);
		
	}
}	
	