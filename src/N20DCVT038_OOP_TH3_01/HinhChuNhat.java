package N20DCVT038_OOP_TH3_01 ;
import java.util.Scanner;
	class HinhChuNhat {
	    private double chieuDai;
	    private double chieuRong;

	    public HinhChuNhat(double chieuDai, double chieuRong) {
	        this.chieuDai = chieuDai;
	        this.chieuRong = chieuRong;
	    }

	    public void setChieuDai(double chieuDai) {
	        this.chieuDai = chieuDai;
	    }

	    public double getChieuDai() {
	        return chieuDai;
	    }

	    public void setChieuRong(double chieuRong) {
	        this.chieuRong = chieuRong;
	    }

	    public double getChieuRong() {
	        return chieuRong;
	    }

	    public double tinhDienTich() {
	        return chieuDai * chieuRong;
	    }

	    public double tinhChuVi() {
	        return 2 * (chieuDai + chieuRong);
	    }
	}
