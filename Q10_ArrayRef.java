import java.util.Scanner;

/**
 * Q10_ArrayRef
 * 配列は参照型なので、別名で参照していると中身は共有される。
 */
public class Q10_ArrayRef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = new String[3];

        System.out.print("値を入力 (例: A B C): ");
        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.next();
        }

        String[] arr2 = arr1;
        arr2[1] = "Z";

        System.out.println("arr1[1] = " + arr1[1]); // Z
        sc.close();
    }
}

