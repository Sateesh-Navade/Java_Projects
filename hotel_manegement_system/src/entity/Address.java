package entity;

public class Address {

	private String doorNo;
	private String street;
	private String dst;
	private String state;
	private int pincode;
	public Address(String doorNo, String street, String dst, String state, int pincode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.dst = dst;
		this.state = state;
		this.pincode = pincode;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", dst=" + dst + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	
}
