class base
{
int x;
public int getX(){
return x;
}
public void setX(int x){
this.x=x;
}
}


public class incaptulation{
public static void main(String args[]){
base h = new base();
h.setX(9);
System.out.println(h.getX());



}
}
