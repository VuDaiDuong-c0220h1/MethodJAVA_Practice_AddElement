import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0};
        for ( int value : arr) {
            System.out.print(value + "\t");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Nhập số cần thêm: ");
        int inputNumber = sc.nextInt();
        int index;
        do {
            System.out.println("Nhập vị trí muốn thêm: ");
            index = sc.nextInt();
            if (index >= arr.length) {
                System.out.println("Vị trí phải nhỏ hơn độ dài mảng");
            } else {
                addNumber(arr, inputNumber, index);
                for ( int value : arr) {
                    System.out.print(value + "\t");
                }
            }
        } while (index >= arr.length);
    }
    public static void addNumber(int[] array, int inputNumber, int index) {
        for ( int i = 1; array.length - i >= index; i++) {
            array[array.length-i] = array[array.length -i -1 ];
        }
        array[index-1] = inputNumber;
    }
}
