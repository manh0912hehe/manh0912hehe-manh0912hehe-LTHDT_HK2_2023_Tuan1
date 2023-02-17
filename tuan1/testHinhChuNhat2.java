package tuan1;
import tuan1.HinhChuNhat2;
public class testHinhChuNhat2 {
    public static void main(String[] args) {
        HinhChuNhat2 hcn = new HinhChuNhat2(10, 15);
        System.out.println("Dien tich hinh chu nhat: " + hcn.getChuVi());
        System.out.println("Chu vi hinh chu nhat: " + hcn.getDienTich());
    }
}