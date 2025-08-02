import java.util.Scanner;

/**
 * Q01_StringCompare
 * ユーザーが入力した2つの文字列を == と equals で比較する。
 */
public class Q01_StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字列1: ");
        String str1 = sc.nextLine(); //文字列プール
        System.out.print("文字列2: ");
        String str2 = new String(sc.nextLine()); //ヒープ領域

        System.out.println("==比較: " + (str1 == str2));         // 参照比較
        System.out.println("equals比較: " + str1.equals(str2)); // 内容比較
        sc.close();
    }
}
