package serviceimplementation;

import java.util.LinkedHashMap; 
import java.util.Scanner;

import dao.HotelRepo;
import entity.Customer;
import service.HotelService;
import entity.Address;
public class HotelServiceImplimentation implements HotelService,HotelRepo{
	Scanner ip=new Scanner(System.in);

	{ //it is non static block which is used to show the rooms available
		for (int i = 1; i <= 10; i++) {
			cm.put(i, null);
		}
		for (int i = 1; i <= 8; i++) {
			sm.put(i, null);
		}
		for (int i = 1; i <= 5; i++) {
			dm.put(i, null);
		}
	}

	@Override
	public void roomInfo() {
		System.out.println("====Clasic Rooms====");
		System.out.println("Hot Water \t: Yes");
		System.out.println("AC \t: No");
		System.out.println("Tv \t: No");
		System.out.println("Wifi \t: No");
		System.out.println("Price \t: 2500");

		System.out.println("====Standard Rooms====");
		System.out.println("Hot Water \t: Yes");
		System.out.println("AC \t: No");
		System.out.println("Tv \t: Yes");
		System.out.println("Wifi \t: No");
		System.out.println("Price \t: 3500");

		System.out.println("====Deluxe Rooms====");
		System.out.println("Hot Water \t: Yes");
		System.out.println("AC \t: Yes");
		System.out.println("Tv \t: Yes");
		System.out.println("Wifi \t: Yes");
		System.out.println("Price \t: 4500");

	}

	public void checkRooms(LinkedHashMap<Integer, Customer> l1) {
		boolean flag=false;
		for (Integer ele : l1.keySet()) {
			if (l1.get(ele)==null) {
				System.out.print(ele + " ");
				flag=true;
			}
		}
		System.out.println();
		if (flag==false) {
			System.out.println("Rooms Not Available");
		}
	}
	@Override
	public void availableRooms() {
		System.out.println("====Available Rooms====");
		System.out.println("==Clasic Rooms==");
		checkRooms(cm);
		System.out.println("==Standard Rooms==");
		checkRooms(sm);
		System.out.println("==Deluxe Rooms==");
		checkRooms(dm);
	}

	Customer createCustomer() {
		System.out.println("Enter Customer Details");
		System.out.println("Enter Coustomer ID:- ");
		int cid=ip.nextInt();
		System.out.println("Enter Customer name:-");
		String cname=ip.next();
		System.out.println("Enter Coustomer age:- ");
		int cage=ip.nextInt();
		System.out.println("Enter Coustomer Ph no:- ");
		long cphno=ip.nextLong();
		System.out.println("Enter Customer emal id:-");
		String cemail=ip.next();
		System.out.println("Enter Door No:- ");
		String dn=ip.next();
		System.out.println("Enter Street Address :- ");
		ip.nextLine();
		String street=ip.nextLine();
		System.out.println("Enter Distic:-");
		String dst=ip.next();
		System.out.println("Enter State:-");
		String state=ip.next();
		System.out.println("Enter Pincode:-");
		int pincode=ip.nextInt();
		
		Address a=new Address(dn,street,dst,state,pincode);
		return new Customer(cid,cname,cphno,cage,cemail,a);
		}
	
	void mapRoom(LinkedHashMap<Integer, Customer>l1,int roomNo,double amt) {
		
		if(l1.get(roomNo)==null) {
		//createing customer object here
			Customer c=createCustomer();
			a1.add(c);
			l1.put(roomNo, c);
			System.out.println("Room No"+roomNo+" had been alloted for "+c.getCname());
		}else {
			System.out.println("Room is not Available...!!");
		}
	}
	@Override
	public void allocateRoom() {
		System.out.println("========MENU========");
		System.out.println("1.Classic Room \n 2.Standard Rooms \n 3.Deluxe Rooms");
		int op=ip.nextInt();

		switch(op) {
		case 1:System.out.println("Enter Room No:-");
		int roomNo1=ip.nextInt();
		if (roomNo1>=1 && roomNo1<=10) {
			mapRoom(cm,roomNo1,1000);
		} else {
			System.out.println("Enter Correct Room No");
		}
		break;

		case 2:System.out.println("Enter Room No:-");
		int roomNo2=ip.nextInt();
		if (roomNo2>=1 && roomNo2<=8) {
			mapRoom(cm,roomNo2,2000);
		} else {
			System.out.println("Enter Correct Room No");
		}
		break;

		case 3:System.out.println("Enter Room No:-");
		int roomNo3=ip.nextInt();
		if (roomNo3>=1 && roomNo3<=5) {
			mapRoom(cm,roomNo3,3000);
		} else {
			System.out.println("Enter Correct Room No");
		}
		break;
		default:System.out.println("Invalid Option...! ");
		}
	}
	
	void unMapRoom(LinkedHashMap<Integer, Customer>l1,int roomNo) {
		if (l1.get(roomNo)!=null) {
			Customer c1=l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+" need to pay "+c1.getCamt()+" rs");
			l1.put(roomNo, null);
		}else {
			System.out.println("Invalid Room No");
		}
	}

	@Override
	public void checkout() {
		System.out.println("========MENU========");
		System.out.println("1.Classic Room \n 2.Standard Rooms \n 3.Deluxe Rooms");
		int op=ip.nextInt();
		System.out.println("Enter the Room No");
		int roomno=ip.nextInt();
		
		switch (op) {
		case 1: if(roomno>=1 && roomno<=10) {
			unMapRoom(cm, roomno);
		}else {
			System.out.println("Invalid Room No");
		}break;
		case 2: if(roomno>=1 && roomno<=8) {
			unMapRoom(sm, roomno);
		}else {
			System.out.println("Invalid Room No");
		}break;
		case 3: if(roomno>=1 && roomno<=5) {
			unMapRoom(dm, roomno);
		}else {
			System.out.println("Invalid Room No");
		}break;
			
		}
	}

	@Override
	public void findAllCustomer() {
		if (a1.size()==0) {
			System.out.println("DataBase is Empty");
		}else {
			for (Customer ele : a1) {
				System.out.println(ele);
			}
		}
	}

	@Override
	public void getCustomerById() {
		boolean flag=false;
		System.out.println("Enter the Customer ID:- ");
		int cid=ip.nextInt();
		for (Customer ele : a1) {
			if (ele.getCid()==cid) {
				System.out.println(ele);
				flag=true;
			}
		}
		ip.close();
	}
	
}
