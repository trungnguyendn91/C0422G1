package ss3_mang_va_phuong_thuc.thuc_hanh.phuong_thuc;

public class TimGiaTriNhoNhatTrongMangBangPhuongThuc {

    /*Tạo phương thứ thực thi chương trình*/
    public static void main(String[] args) {
        int arr[] = {4, 1, 12, 6, 8, 5};
        int index = minValue(arr);
        System.out.println("The smaller element in the array is: " + arr[index]);
    }
    /*Nguyên mẫu phương thức*/
    public static int minValue(int array[]) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
