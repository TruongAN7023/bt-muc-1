package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * viet chuong trinh nhap a,b,c kiem tra xem phai tam giac khong.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap 3 canh a,b,c cua tam giac:");
//		System.out.println("Nhap canh a:");

//		int a = sc.nextInt();
//		System.out.println("Nhap canh b:");
//		int b = sc.nextInt();
//		System.out.println("Nhap canh c:");
//		int c = sc.nextInt();
//		if ((a + b > c) && (b + c > a) && (a + c > b)) {
//			System.out.println("Day la 3 canh cua tam giac ");

//		}else {
//			System.out.println("Khong phai la 3 canh cua tam giac");

//		}
		/*
		 * viet chuong trinh tinh diem trung binh. suy ra luc học
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao diem trung binh");
//		double dtb = sc.nextDouble();

//		if (dtb >= 8) {
//			System.out.println("Hoc luc gioi");

//		} else if (dtb >= 6.5) {
//			System.out.println("Hoc luc kha");
//		} else if (dtb <= 6.5) {
//			System.out.println("Hoc luc tb");
//		} else {
//			System.out.println("Hoc luc yeu");
//		}

		/*
		 * Viết chương trình nhập số chữ điện tiêu dung của hộ gia đình trong 1 tháng.
		 * Tính số tiền phải trả. Biết 1-100 chữ: giá 1800vnd/chữ 101-200 chữ: giá
		 * 2500vnd/chữ 200 trở lên: giá 3000vnd/chữ
		 * 
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao so chu dien tieu dung ");
//		int soChuDien = sc.nextInt();
//		int donGia = 0;
//		if (soChuDien <= 100) {
//			donGia = 1800;

//		}else if (soChuDien <= 200) {
//
//		donGia = 2500;
//		}else {
//			donGia = 3000;

//		}
//		int soTien = soChuDien * donGia;
//		System.out.println("so tien phai tra " + soTien);

		/*
		 * viet chuong trinh nhap vao so nguyen kiem tra so chan so le
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 4 so nguyen  ");

		System.out.println("Nhap vao so1");
		int so1 = sc.nextInt();
		System.out.println("Nhap vao so2");
		int so2 = sc.nextInt();
		System.out.println("Nhap vao so3");
		int so3 = sc.nextInt();
		System.out.println("Nhap vao so4");
		int so4 = sc.nextInt();

		int soChan = 0;
		int soLe = 0;
		if (so1 % 2 == 0) {
			soChan++;

		} else {
			soLe++;
			if (so2 % 2 == 0) {
				soChan++;

			} else {
				soLe++;

			}
			if (so3 % 2 == 0) {
				soChan++;

			} else {
				soLe++;

			}
			if (so4 % 2 == 0) {
				soChan++;

			} else {

			}
			System.out.println("so chan" +soChan);
			System.out.println("so le" + soLe);

		}

	}

}
