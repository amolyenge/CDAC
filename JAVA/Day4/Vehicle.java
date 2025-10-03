import java.util.Date;

public class Vehicle {

	private int vid;
	private String oname;
	private String vtype;
	private Date pDate;
	
	public Vehicle() {
		this.vid = 0;
		this.oname = null;
		this.vtype = null;
		this.pDate = null;
	}
	
	public Vehicle(int id , String name , String type , Date date) {
		this.vid = id;
		this.oname = name;
		this.vtype = type;
		this.pDate = date;
	}
	
	public void setVid(int id) {
		this.vid = id;
	}
	public void setOname(String name) {
		this.oname = name;
	}
	public void setVtype(String type) {
		this.vtype = type;
	}
	public void setPdate(Date date) {
		this.pDate = date;
	}
	
	public int getVid() {
		return vid;
	}
	public String getOname() {
		return oname;
	}
	public String getVtype() {
		return vtype;
	}
	public Date getPdate() {
		return pDate;
	}
	
	public String toString() {
		System.out.println("Data is ass Follows");
		return "Vid : " + vid + " Owner Name: " + oname + " Vehicle Type : " 
				+ vtype + " Date of Purchase: " + pDate;
	}
}
