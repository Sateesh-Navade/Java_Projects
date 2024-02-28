package service;

public interface HotelService {
	void roomInfo();
	void availableRooms();
	void allocateRoom();
	void checkout();//deallocate Room 
	void findAllCustomer();
	void getCustomerById();
}
