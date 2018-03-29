package t3h.edu.vn;

public class KiemTra {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HocVien hv=new HocVien(1,"nghia","0942424242","an giang");
		NhanVien nv=new NhanVien(2,"Nhi");
		System.out.println(hv.layThongTin());
		System.out.println(nv.layThongTin());
	}
	
}