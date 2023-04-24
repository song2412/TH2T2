package main;
import java.text.NumberFormat;
import java.util.Scanner;
 
public class Account {
    private long soTK;
    private String tenTK;
    private double soTienTrongTK;
 
    Scanner sc = new Scanner(System.in);
    public Account() {
    }
 
    public Account(long soTK, String tenTK, double soTienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soTienTrongTK = soTienTrongTK;
    }
    public long getSoTK() {
        return this.soTK;
    }
 
    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }
 
    public String getTenTK() {
        return this.tenTK;
    }
 
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }
 
    public double getSoTienTrongTK() {
        return this.soTienTrongTK;
    }
 
    public void setSoTienTrongTK(double soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }
    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        return soTK + "-" + tenTK + "-" + str1;
    }
 
    public double napTien() {
        double nap;
        System.out.print("Nhap so tien nap: ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            soTienTrongTK = nap + soTienTrongTK;
            NumberFormat currencyVN = NumberFormat.getCurrencyInstance();
            String str1 = currencyVN.format(nap);
            System.out.println("Vua thuc hien giao dich nap " + str1 + " vao tai khoan.");
        } else {
            System.out.println("So tien khong hop le!");
        }
        return nap;
    }
    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhap so tien can rutt: ");
        rut = sc.nextDouble();
        if (rut <= (soTienTrongTK - phi)) {
            soTienTrongTK = soTienTrongTK - (rut + phi);
            NumberFormat currencyVN = NumberFormat.getCurrencyInstance();
            String str1 = currencyVN.format(rut);
            System.out.println("Giao dich rut tien " + str1 + "và phi la 50000VND.");
        } else {
            System.out.println("So tien khong hop le!");
            return rutTien();
        }
        return rut;
    }
 
    public double daoHan() {
        double laiSuat = 0.035;
        soTienTrongTK = soTienTrongTK + soTienTrongTK * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
        return soTienTrongTK;
    }
 
    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTienTrongTK);
        System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
    }
}

