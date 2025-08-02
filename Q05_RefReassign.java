import java.util.Scanner;

/**
 * Q05_RefReassign
 * 参照を別のインスタンスに変更しても元の参照には影響しない。
 */
class Box {
    int number;
}

public class Q05_RefReassign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b1 = new Box();

        System.out.print("数値を入力: ");
        b1.number = sc.nextInt();

        Box b2 = b1;
        b2 = new Box(); // 新しいオブジェクト
        b2.number = 999;

        System.out.println("b1の値: " + b1.number);
        System.out.println("b2の値: " + b2.number);
        sc.close();
    }
}
