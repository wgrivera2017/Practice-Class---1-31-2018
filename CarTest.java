
public class CarTest {
	
	public static void main(String[] args) {
		
	Cars car1 = new Cars("Ford", 15000, 1992);
	
		System.out.println(car1.carBrand);
	
	Cars car2 = new Cars("Toyota", 10000, 2000);
	
		System.out.println(car2.carBrand);
	
	car2.carBrand = "Nissan";
	
		System.out.println(car2.carBrand);
	
	}

}
