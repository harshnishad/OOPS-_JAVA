import java.util.*;
class test{
    int l;
    int b;
    public int printinfo(){
        return l*b;
        
    }
    
    test(int l, int b){
        this.l=l;
        this.b=b;
    }
    
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int l= sc.nextInt();
	    int b=sc.nextInt();
		test d = new test(l,b);
		d.printinfo();
		
	}
}
