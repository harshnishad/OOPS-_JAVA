// it is 100 percent pure abstract method
interface Car{
    int x=10;//ye change nahi hoga kyuki final hai because its by deafualt abstract and public ,final
    void bmw();
    default void b(){
        System.out.print("bro");
        c();//praivate accesed by default
    }
    
    private void c(){
    System.out.print("hello");
    }
}

public class Main implements Car  //  we use implements to acess interface
{
    public void bmw(){
        System.out.print("harsh have ......");
    }
	public static void main(String[] args) {
	  Main h = new Main();
	  h.b();
	}
}
