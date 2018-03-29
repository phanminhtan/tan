package t3h.edu.vn;

import t3h.edu.lib.Person;

public class NhanVien extends Person {
	int id;
	String name;
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String layThongTin() {
		// TODO Auto-generated method stub
		return super.layThongTin()+" "+id+" "+name;
	}
	
}
