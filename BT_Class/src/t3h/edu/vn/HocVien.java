package t3h.edu.vn;

import t3h.edu.lib.Person;

public class HocVien extends Person{
	int id;
	String name;
	String bod;
	String address;
	
	
	
	public HocVien() {
		super();
	}

	


	public HocVien(int id, String name, String bod, String address) {
		super();
		this.id = id;
		this.name = name;
		this.bod = bod;
		this.address = address;
	}
	



	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getBod() {
		return bod;
	}




	public void setBod(String bod) {
		this.bod = bod;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	@Override
	public String layThongTin() {
		return super.layThongTin()+" "+id+" "+name+" "+bod+" "+address;
	}


	
	
	
	
}
