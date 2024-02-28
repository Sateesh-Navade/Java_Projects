package entity;

public class Customer {
	private int cid;
	private String cname;
	private long cphno;
	private int cage;
	private String cemail;
	private Address cadd;
	private double camt;
	public Customer(int cid, String cname, long cphno, int cage, String cemail, Address cadd) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cphno = cphno;
		this.cage = cage;
		this.cemail = cemail;
		this.cadd = cadd;
	}
	
	public double getCamt() {
		return camt;
	}
	public void setCamt(double camt) {
		this.camt = camt;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setEname(String ename) {
		this.cname = cname;
	}
	public long getCphno() {
		return cphno;
	}
	public void setCphno(long cphno) {
		this.cphno = cphno;
	}
	public int getCage() {
		return cage;
	}
	public void setCage(int cage) {
		this.cage = cage;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public Address getCadd() {
		return cadd;
	}
	public void setCadd(Address cadd) {
		this.cadd = cadd;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cphno=" + cphno + ", cage=" + cage + ", cemail="
				+ cemail + ", cadd=" + cadd + ", camt=" + camt + "]";
	}
	
	
	
}
