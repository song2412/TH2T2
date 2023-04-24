package main;
	import java.util.Scanner;
	public class Main {
	    static Scanner sc = new Scanner(System.in);
	    static void nhapTK(Account tk) {
	        System.out.println("Nhap so tai khoan: ");
	        tk.setSoTK(sc.nextInt());
	        sc.nextLine();
	        System.out.println("Nhap ten tai khoan: ");
	        tk.setTenTK(sc.nextLine());
	        tk.setSoTienTrongTK(50);
	    }
	    public static void main(String[] args) {
	        Account a[] = null;
	        int k, b, n = 0;
	        long s, d, c, f;
	        boolean flag = true;
	        do {
	            System.out.println("-------------Menu---------- ");
	            System.out.println("1.Nhap thong tin khach hang.\n"
	                    + "2.In danh sach khach hang.\n" 
	            		+ "3.Nap tien.\n"
	                    + "4.Rut tien\n"
	                    + "5.Chuyen tien" 
	                    + "0.Số khác để thoát");
	            b = sc.nextInt();
	            switch (b) {
	                case 1:
	                    System.out.println("Nhap so luong khach hang can nhap: ");
	                    n = sc.nextInt();
	                    a = new Account[n];
	                    for (int i = 0; i < n; i++) {
	                        System.out.println("Khach hang so: " + (i+1));
	                        a[i] = new Account();
	                        nhapTK(a[i]);
	                    }
	                    break;
	                case 2:
	                    System.out.printf("%-10s %-20s %-20s\n", "So TK", "Ten TK", "So tien trong TK");
	                    for (int i = 0; i < n; i++) {
	                        a[i].inTK();
	                    }
	                    break;
	                case 3:
	                    System.out.println("Nhap so tai khoan nap: ");
	                    s = sc.nextLong();
	                    for (int i = 0; i < n; i++) {
	                        d = a[i].getSoTK();
	                        if (s == d) {
	                            System.out.println("Tai khoan: " + d);
	                            a[i].napTien();
	                        } else {
	                            System.out.println("");
	                        }
	                    }
	                    break;
	                case 4:
	                    System.out.println("Nhap so tai khoan can rut: ");
	                    s = sc.nextLong();
	                    for (int i = 0; i < n; i++) {
	                        d = a[i].getSoTK();
	                        if (s == d) {
	                            System.out.println("Tai Khoan: " + d);
	                            a[i].rutTien();
	                        }
	                    }
	                    break;
	                case 5:
	                    double chuyen,
	                            nhan,
	                            tienChuyen;
	                    System.out.print("Nhap so tai khoan khach hang chuyen tien: ");
	                    s = sc.nextLong();
	                    System.out.print("Nhap so tai khoan khach hang nhan tien: ");
	                    c = sc.nextLong();
	                    for (int i = 0; i < n; i++) {
	                        d = a[i].getSoTK();
	                        if (s == d) {
	                            chuyen = a[i].getSoTienTrongTK();
	                            for (int j = 0; j < n; j++) {
	                                f = a[j].getSoTK();
	                                if (c == f) {
	                                    nhan = a[j].getSoTienTrongTK();
	                                    System.out.println("Nhap so tien chuyen");
	                                    tienChuyen = sc.nextDouble();
	                                    if (tienChuyen <= chuyen) {
	                                        chuyen = chuyen - tienChuyen;
	                                        nhan = nhan + tienChuyen;
	                                        a[i].setSoTienTrongTK(chuyen);
	                                        a[j].setSoTienTrongTK(nhan);
	                                        System.out.println("Tai khoan thuc hien giao dịch " + d + " vừa chuyển: VND" + tienChuyen);
	                                        System.out.println("Tai khoan so  " + f + " vua nhan: VND" + tienChuyen);
	                                    } else {
	                                        System.out.println("So tien khong hop le!");
	                                    }
	                                } else {
	                                    System.out.println("");
	                                }
	                            }
	                        } else {
	                            System.out.println("");
	                        }
	                    }
	                    break;
	                default:
	                    System.out.println("Bye!!");
	                    flag = false;
	                    break;
	            }
	        } while (flag);
	    }
	}

