interface car{
	void tire();
	void seat();
}
interface bmw extends car{
	void door();
	void window();
}
class MyDreamCar implements bmw{
	public void tire(){
		System.out.println("tire");
	}
		public void seat(){
		System.out.println("seat");
	}
		public void door(){
		System.out.println("door");
	}
		public void window(){
		System.out.println("window");
	}
}
public class cwd_oops_set1{
	public static void main(String[] args){
	 MyDreamCar car = new MyDreamCar();
	 car.tire();
	 car.seat();
	 car.door();
	 car.window();
	
	
	}
}