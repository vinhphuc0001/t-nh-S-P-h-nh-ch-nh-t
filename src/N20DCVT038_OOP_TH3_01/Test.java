package N20DCVT038_OOP_TH3_01;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập chiều dài của hình chữ nhật: ");
	        double chieuDai = scanner.nextDouble();

	        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
	        double chieuRong = scanner.nextDouble();

	        HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);

	        System.out.println("Diện tích của hình chữ nhật là: " + hinhChuNhat.tinhDienTich());
	        System.out.println("Chu vi của hình chữ nhật là: " + hinhChuNhat.tinhChuVi());

	        scanner.close();
	    }
	}
	

