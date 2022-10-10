class Employee{     //ek java file me ek hi public hota hai//
    int id;
    String name;
    int salary;
    
    public void printdetail(){
        System.out.println("employee id is : "+id);
        System.out.println("employee name is :"+name);
    }
    public int getsalary(){
        return salary;
    }
}
public class cwh_class_1 {
    public static void main(String[] args){
        System.out.println("This is our custom class");
        System.out.println( );
        
        Employee harry = new Employee();
        //Setting properties or attribute
        harry.id = 12;
        harry.name = "harry";
        harry.salary = 30000;
        //System.out.println(harry.id);
        //System.out.println(harry.name);
        harry.printdetail();
       
        System.out.println( );

        Employee john = new Employee();
        john.id = 13;
        john.name = "john muttal";
        john.salary = 120000;
        int salary = john.getsalary();
        john.printdetail();
        System.out.println(salary);

    }
}
