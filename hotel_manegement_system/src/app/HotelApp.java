package app;

import java.util.Scanner; 

import service.HotelService;
import serviceimplementation.HotelServiceImplimentation;

public class HotelApp {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		HotelService h1=new HotelServiceImplimentation();
		System.out.println("====🙏Welcome to Hotel Management System🙏====");
		
		while (true) {
			System.out.println("========MENU========");
			System.out.println(" 1. Room Details \n 2. Available Rooms \n 3. Allocate Room \n 4. Checkout \n 5. Find All Customer \n 6. Customer by ID \n 7. Exit");
			System.out.println("Select your Option");
			int op=ip.nextInt();
			
			switch (op) {
			case 1:h1.roomInfo(); break;
			case 2:h1.availableRooms(); break;
			case 3:h1.allocateRoom(); break;
			case 4:h1.checkout();
			case 5:h1.findAllCustomer();;
			case 6:h1.getCustomerById();
			case 7:System.out.println("Thank You Visit Again");
			
			ip.close();
			System.exit(0);
			}
		}
	}
}
