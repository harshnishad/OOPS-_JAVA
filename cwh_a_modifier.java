class MyEmployee{
    private int id;
    private String name;

public String getName(){
    return name; 
}
public void setname(String n){
    name =n;
}
public void setid(int i){
    id = i; 
}
 public int getid(){
    return id;
 }
}
public class cwh_a_modifier{
public static void main(String[] args){
 MyEmployee harsh = new MyEmployee();
 //harsh.id = 143231;
 //harsh.name ="nishad ji";
 harsh.setname("mr harsh");
 System.out.println(harsh.getName() );
}
}
