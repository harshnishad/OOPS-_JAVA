import java.util.*;
class college{
     String name;
     int year;
     public void univ(){
        System.out.println(this.name);
        System.out.println(this.year);
     }

college(){ 
  System.out.println("welcome");
}
}
public class practice {
public static void main(String[] args){
     college c1 = new college();
     c1.name  =  "GLA University";
     c1.year  =   10;
     c1.univ();
}
}