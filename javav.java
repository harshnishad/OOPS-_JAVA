import java.util.*;
class test{
    int l;
    int b;
	int h;
    public int printinfo(){
        return l*b*h;
         
    
} 

test(){
this.l=l;
this.b=b;
this.h=h;
}
}


public class javav
{
	public static void main(String[] args) {
	    test t=new test();
		t.l=9;
		t.b=10;
		t.h=2;
		System.out.println(t.printinfo());
		
		
	}
}
