class employee{
	int salary;
	String name;
	int changedName;

public int getSalary(){
	return salary;
}
public String getName(){
    return name;
}
public void setName(String n){
	name = n;
}
}


public class cwh_set1{
	public static void main(String[] args){
	employee harsh = new employee();
	harsh.setName("harsh bittu");
	harsh.salary = 233 ;
	System.out.println(harsh.getSalary());
	System.out.println(harsh.getName());
	}
}