import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        int size;                    //Khai báo biến
        int [] array;                //Khai báo mảng
        Scanner scanner = new Scanner(System.in);
        // Kiểm tra kích thước mảng
       do {
           System.out.println("Enter a size: ");
           size = scanner.nextInt();
           if (size>20)
               System.out.println("Size does not exceed 20");
       } while ((size>20));
       // Khởi tạo mảng
       array = new int[size];
       // Nhập các gí trị cho phần tử mảng
       int i =0;
       for (i=0; i<array.length; i++){
           System.out.print("Enter element " + (i+1) + ": ");
           array[i] = scanner.nextInt();
       }
       // in ra mảng đã nhập
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length ; j++) {
            System.out.print(array[j] + "\t");
        }
        // Đảo ngược các phần tử mảng
        for (int j = 0; j < array.length/2 ; j++) {
            int nano = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = nano;
        }
        // in ra phần tử đảo ngược
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
