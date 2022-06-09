package ss3_mang_va_phuong_thuc.bai_tap.dem_so_lan_xuat_hien_cua_ky_tu;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTu {
    public static void main(String[] args) {
        String str ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();
        String strSearch;
        System.out.println("Ký tự cần đếm: ");
        strSearch = scanner.nextLine();
        char a = strSearch.charAt(0);
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == a){
                count++;
            }
        }
        System.out.println("Ký tự "+a+" xuất hiện " +count+" lần");
    }
}
