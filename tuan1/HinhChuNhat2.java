package tuan1;

public class HinhChuNhat2 {
	public double chieuDai;
	public double chieuRong;
	public void setChieuDai(double cd ) throws Exception{
		if(cd>0) {
			this.chieuDai=cd;
		}else throw new Exception("Chieu dau lon hon 0");
	}
	public double getChieuDai() {
		return this.chieuDai;
	}
	public void setChieuRong(double cr) throws Exception{
		if(cr>0) {
			this.chieuRong=cr;
		}else throw new Exception("Chieu rong lon 0.");
	}
	public double getChieuRong() {
		return this.chieuRong;
	}
	public HinhChuNhat2() {
		
	}
	public HinhChuNhat2 (double cd,double cr) {
		this.chieuDai=cd;
		this.chieuRong=cr;
	}
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}
	
}

